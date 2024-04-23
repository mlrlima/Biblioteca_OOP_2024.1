package biblioClasses;
import java.util.ArrayList;

public class Cliente extends Pessoa  {

    //EMPRESTAR

    public void Emprestar(Livro livro) {

        BorrowedList.add(livro);
    }

    //DEVOLVER

    public void Devolver() {
        
        System.out.println("\tLivros Emprestados:");

        for(int i=1; i<=BorrowedList.size(); i++){

            System.out.println(i+" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + 
            BorrowedList.get(i).getAutor());
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

        this.setNome(nome);
        this.setCPF(CPF);
        this.setSenha(senha);

        cpfList.add(CPF);
        userList.add(this);

        System.out.println("----------------------------------------");
        System.out.println("Conta criada com sucesso, seja bem-vindo");
    }

}
    
            
