package biblioClasses;
import java.util.*;

public class Pessoa{

    //ATRIBUTOS
    protected String nome, CPF, senha, endereco, telefone;
    Scanner input = new Scanner(System.in);
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

    //criar conta

    public void Registro(ArrayList<Pessoa> userList, ArrayList<String> cpfList){

        System.out.println("----------------------------------------");
        System.out.println("\tCRIAÇÃO DE NOVA CONTA");
        System.out.println("Insira os seus dados cadastrais");
        System.out.println("----------------------------------------");

        //Nome

        System.out.println("Nome: ");
        nome = input.nextLine();
        

        //CPF

        System.out.println("CPF: ");
        CPF = input.nextLine();

        while (cpfList.contains(CPF) || CPF.length() != 11){

            System.out.println("----------------------------------------");
            System.out.println("CPF inválido ou já cadastrado");
            System.out.println("----------------------------------------");
            System.out.println("CPF: ");
            CPF = input.nextLine();           
        }

        //Senha

        System.out.println("Senha: ");
        senha = input.nextLine();

        while (senha.length() < 8 || senha.length() > 20){
            System.out.println("----------------------------------------");
            System.out.println("Tamanho de senha inválido, tente denovo");
            System.out.println("----------------------------------------");
            System.out.println("Senha: ");
            senha = input.nextLine();
        }

        cpfList.add(CPF);
        userList.add(this);


        System.out.println("----------------------------------------");
        System.out.println("Conta criada com sucesso, seja bem-vindo");
    }

    //entrar em conta

    public Pessoa Login(ArrayList<Pessoa> users){

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

                if(inputCPF.equals(temp.CPF)){
                    
                    indexConta = i;
                    break;
                }
            }

            while (indexConta == -1) {

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

                System.out.println("Seja bem-vindo!" );

                break;
            }

            //VERIFICAR PORQUE CHECAGEM DE SENHA N FUNCIONA!!!

            else{
                while(inputSenha.equals(temp.senha) == false){
                    System.out.println("Senha incorreta, tente novamente:" );
                    System.out.println("----------------------------------------");
                    System.out.println("Senha: ");

                    inputSenha = input.nextLine();
                }

                break;
            }    

        }  

        return users.get(indexConta);
    }

    public void Devolver() {
        
        System.out.println("\tLivros Emprestados:");

        for(int i=1; i<=BorrowedList.size(); i++){

            System.out.println(" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + BorrowedList.get(i).getAutor());
        }

        System.out.println("----------------------------------------");
        System.out.print("\t Número do livro a Devolver");
        System.out.println("----------------------------------------");
        System.out.print("--> ");

        int bookChoice;

        do{
            bookChoice = input.nextInt();
            input.nextLine();
            bookChoice--;

        }while(bookChoice<0 && bookChoice>=BorrowedList.size());
        
        BorrowedList.remove(bookChoice);

        BorrowedList.get(bookChoice).setDisponivel();
    }

    public void printarEmprestimos(){

        if(BorrowedList.size()==0){
            System.out.println("Voce não possui livros emprestados.");
            return;
        }

        System.out.println("Livros emprestados:");

        for(int i=1; i<=BorrowedList.size(); i++){
            System.out.println(i+" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + BorrowedList.get(i).getAutor());
        }
    }

}