package biblioClasses;
import java.util.ArrayList;

public class Cliente extends Pessoa  {


    //NOVA CONTA

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

            System.out.print("\033\143");
            System.out.println("----------------------------------------");
            System.out.println("CPF inválido ou já cadastrado");
            System.out.println("----------------------------------------");
            System.out.println("CPF: ");
            CPF = input.nextLine();           
        }

        //Senha

        System.out.println("Senha: ");
        senha = input.nextLine();
        System.out.print("\033\143");

        while (senha.length() < 8 || senha.length() > 20){
            System.out.print("\033\143");
            System.out.println("----------------------------------------");
            System.out.println("Tamanho de senha inválido, tente denovo");
            System.out.println("----------------------------------------");
            System.out.println("Senha: ");
            senha = input.nextLine();
            System.out.print("\033\143");
        }

        System.out.println("Endereço: ");
        endereco = input.nextLine();

        
        boolean telvalido=false;
        System.out.println("Telefone: ");
        telefone = input.nextLine();
        if(telefone.length()>7 && telefone.length()<14 && telefone.matches("\\d+")){
            telvalido=true;
        }

        while(!telvalido){
            System.out.print("\033\143");
            System.out.println("----------------------------------------");
            System.out.println("Telefone inválido, tente denovo");
            System.out.println("----------------------------------------");
            System.out.println("Telefone: ");
            telefone = input.nextLine();
            System.out.print("\033\143");

            if(telefone.length()>7 && telefone.length()<14 && telefone.matches("\\d+")){
                telvalido=true;
            }
        }

        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setTelefone(telefone);

        cpfList.add(CPF);
        userList.add(this);

        System.out.print("\033\143");
        System.out.println("----------------------------------------");
        System.out.println("Conta criada com sucesso, seja bem-vindo");
    }

}