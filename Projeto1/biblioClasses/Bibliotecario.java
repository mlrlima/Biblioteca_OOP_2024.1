
package biblioClasses;
import java.util.ArrayList;

public class Bibliotecario extends Pessoa{
    

    public int Login(ArrayList<Pessoa> users){

        int indexConta = -1;

        System.out.println("----------------------------------------");
        System.out.println("\t\tLOGIN");
        System.out.println("----------------------------------------");
        System.out.println("CPF do cliente: ");

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

        }  

        return indexConta;
    }




    //Bibliotecario devolve livro p cliente

    public void Devolver(ArrayList<String> cpfList) {

        /* while (cpfList.contains(ClientCPF) || ClientCPF.length() != 11){

            System.out.println("----------------------------------------");
            System.out.println("CPF inválido ou já cadastrado");
            System.out.println("----------------------------------------");
            System.out.println("CPF: ");
            ClientCPF = input.nextLine();           
        }*/

        if(BorrowedList.size()==0){
            System.out.println("Voce não possui livros emprestados.\n");
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
        
        BorrowedList.get(bookChoice).setDisponivel();
        BorrowedList.remove(bookChoice);
    }


}
