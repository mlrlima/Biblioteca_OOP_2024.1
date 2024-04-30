package biblioClasses;
import java.util.*;

public class Pessoa implements java.io.Serializable{

    transient Scanner input = new Scanner(System.in);

    //ATRIBUTOS
    protected String nome, CPF, senha, endereco, telefone;
    
    //Lista de livros emprestados no momento pelo cliente
    protected ArrayList<Livro> BorrowedList = new ArrayList<Livro>();

    //Contagem de livros emprestados por genero
    int[] generosHist = new int[10];


    //--------------getters e setters---------------//

    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    //----------------------------------------------//
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    //----------------------------------------------//
    public void setSenha(String senha) {
        this.senha=senha;
    }
    public String getSenha() {
        return senha;
    }
    //----------------------------------------------//
    public void setEndereco(String endereco) {
        this.endereco=endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    //----------------------------------------------//
    public void setTelefone(String telefone) {
        this.telefone=telefone;
    }
    public String getTelefone() {
        return telefone;
    }
    //----------------------------------------------//  
    public ArrayList<Livro> getEmprestados() {
        return BorrowedList;
    }
    //----------------------------------------------//
    public int[] getGenerosHist(){
        return generosHist;
    }
    //----------------------------------------------//

    //LOGIN

    public int Login(ArrayList<Pessoa> users){

        int indexConta = -1;

        System.out.println("----------------------------------------");
        System.out.println("\t\tLOGIN");
        System.out.println("----------------------------------------");
        System.out.println("CPF: ");

        String inputCPF = input.nextLine();
        Pessoa temp = new Pessoa();

        while(indexConta == -1){

            for(int i=0; i < users.size(); i++){

                temp = users.get(i);

                if(inputCPF.equals(temp.getCPF())){
                    
                    indexConta = i;
                    break;
                }
            }

            while (indexConta == -1) {

                System.out.print("\033\143");
                System.out.println("----------------------------------------");
                System.out.println("CPF não encontrado, tente novamente" );
                System.out.println("----------------------------------------");
                System.out.print("CPF: ");
                
                inputCPF = input.nextLine();
                
                for(int i=0; i < users.size(); i++){

                    temp = users.get(i);
    
                    if(inputCPF.equals(temp.CPF)){
                        
                        indexConta = i;
                        break;
                    }
                }
                
            }

            System.out.println("Senha: ");
            String inputSenha = input.nextLine();

            if(inputSenha.equals(temp.senha)){

                System.out.print("\033\143");
                System.out.println("----------------------------------------");
                System.out.println("\tSeja bem-vindo!" );

                break;
            }


            else{
                while(inputSenha.equals(temp.senha) == false){
                    System.out.print("\033\143");
                    System.out.println("Senha incorreta, tente novamente:" );
                    System.out.println("----------------------------------------");
                    System.out.println("Senha: ");

                    inputSenha = input.nextLine();
                    System.out.print("\033\143");
                }

                System.out.print("\033\143");
                System.out.println("----------------------------------------");
                System.out.println("\tSeja bem-vindo!" );

                break;
            }    

        }  

        return indexConta;
    }


    //EMPRESTIMO

    public void Emprestar(ArrayList<Livro> livros, int choiceCode){

        if(BorrowedList.size() >= 6){
            System.out.println("Você já atingiu número máximo de livros");
            return;
        }

        if(livros.size() == 0){
            System.out.println("----------------------------------------");
            System.out.println("\tAinda não há livros");
            System.out.println("----------------------------------------");
            return;
        }


        if(livros.get(choiceCode).getStatus() == true){

            System.out.println("----------------------------------------");
            System.out.println("\tLivro emprestado com sucesso!");
            System.out.println(livros.get(choiceCode).getTitulo() + "-" + livros.get(choiceCode).getAutor());

            //adiciona a lista de emprestados
            this.getEmprestados().add(livros.get(choiceCode));
            //muda status do livro
            livros.get(choiceCode).switchStatus(); 
            //incrementa numero total de livros emprestados do genero
            generosHist[livros.get(choiceCode).getGenero()]++ ; 
        }

        else{
            System.out.println("----------------------------------------");
            System.out.println("Livro indisponível ou inexistente");
        }

    }

    
    //DEVOLUCAO

    public void Devolver(int choiceCode, ArrayList<Livro> livros) {
        
        if (choiceCode >= livros.size()){
                        
            System.out.print("\033\143");
            System.out.println("Livro indisponível ou inexistente");
            return;
        }

        for(int i=0; i<BorrowedList.size(); i++){

            if(BorrowedList.get(i).getCode() == choiceCode){

                getEmprestados().get(i).switchStatus();
                getEmprestados().remove(i);
                return;
            }
        }

        System.out.println("Você não está com esse livro.");
    }

}