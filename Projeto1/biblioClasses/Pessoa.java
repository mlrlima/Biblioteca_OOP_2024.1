package biblioClasses;
import java.util.*;

public class Pessoa{

    //ATRIBUTOS
    protected String nome, CPF, senha, endereco, telefone;
    Scanner input = new Scanner(System.in);

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

        while(indexConta == -1){

            for(int i=0; i < users.size(); i++){

                Pessoa temp = users.get(i);

                if(inputCPF.equals(temp.CPF)){

                    System.out.println("Senha: ");
                    String inputSenha = input.nextLine();

                    if(inputSenha.equals(temp.senha)){

                        System.out.println("Seja bem-vindo!" );
                        indexConta = i;
                    }

                    else{
                        while(senha.equals(temp.senha) == false){
                            System.out.println("Senha incorreta, tente novamente:" );
                            senha = input.nextLine();
                        }
                    }    
                }
            }

            if(indexConta == -1){

                System.out.println("----------------------------------------");
                System.out.println("CPF não encontrado, tente novamente" );
                System.out.println("----------------------------------------");
                System.out.print("CPF: ");
                
                inputCPF = input.nextLine();
                input.nextLine();
            }
        } 
        
        Pessoa user = new Pessoa();
        user = users.get(indexConta);

        return user; 

    }
}
                
