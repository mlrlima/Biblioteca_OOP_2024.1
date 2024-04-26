
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

    //Adiciona novo livro a base de dados

    public void newBook(ArrayList<Livro> livros){

        System.out.println("----------------------------------------");
        System.out.println("\t Registrar novo livro");
        System.out.println("----------------------------------------");

        Livro newbook = new Livro();

        String textinput;

        System.out.println("título:");
        textinput = input.nextLine();
        newbook.setTitulo(textinput);

        System.out.println("autor:");
        textinput = input.nextLine();
        newbook.setTitulo(textinput);
        
        System.out.println("genero (codigo):");
        int newgenero = input.nextInt();
        input.nextLine();
        newbook.setGenero(newgenero);

        livros.add(newbook);

    }


    

}
