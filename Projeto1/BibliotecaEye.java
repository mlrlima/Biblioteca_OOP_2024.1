package Biblioteca;

class BibliotecaEye extends Pessoa{


    void printarLivro(){
        
    }

    public class void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("----------------------------------------");
            System.out.println("\tBEM-VINDO, BIBLIOTECÁRIO!!!");
            System.out.println("----------------------------------------");
            System.out.println("\t[1] Adiconar novo livro \n\t[2] Checar livros \n\t[3] Checar empréstimos \n\t[4] Checar clientes \n\t[0] Encerrar");
            System.out.println("----------------------------------------");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

        }while(choice<0 || choice>4);

        Switch(choice){
            case 1:
                System.out.println("Nome do autor: ");
                String autor = scanner.nextLine();
                System.out.println("Tíulo do livro: ");
                String titulo = scanner.nextLine();	
                sistema.addLivro(autor, titulo);
                break;

            case 2:

                printarLivros();

            case 3:

            case 4:
        }


    }
}