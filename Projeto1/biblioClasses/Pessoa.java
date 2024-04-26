package biblioClasses;
import java.util.*;

public class Pessoa implements java.io.Serializable{

    //ATRIBUTOS
    protected String nome, CPF, senha, endereco, telefone;
    transient Scanner input = new Scanner(System.in);
    protected ArrayList<Livro> BorrowedList = new ArrayList<Livro>();

    //getters e setters

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }
    public String getSenha(){
        return senha;
    }

    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getTelefone(){
        return telefone;
    }

    public ArrayList<Livro> getEmprestados() {
        return BorrowedList;
    }

    //Entrar em conta

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

    //Emprestimo (a fazer!!!)

    public void Emprestar(ArrayList<Livro> disponiveis){

        if(BorrowedList.size() >= 6){
            System.out.println("Você atingiu número máximo de livros");
            return;
        }

        

    }

    //Devolucao

    public void Devolver(int code) {

        if(BorrowedList.size()==0){
            System.out.println("Voce não possui livros emprestados.");
            return;
        }

        System.out.println("\tLivros Emprestados:");

        for(int i=1; i<=BorrowedList.size(); i++){

            System.out.println(" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + BorrowedList.get(i).getAutor());
        }

        System.out.println("----------------------------------------");
        System.out.println("\t Número do livro a Devolver\n");
        System.out.println("----------------------------------------");
        System.out.print("--> ");

        int bookChoice;

        do{
            bookChoice = input.nextInt();
            input.nextLine();
            bookChoice--;

        }while(bookChoice<0 && bookChoice>=BorrowedList.size());
        
        
        BorrowedList.get(bookChoice).switchStatus();
        BorrowedList.remove(bookChoice);
    }

}