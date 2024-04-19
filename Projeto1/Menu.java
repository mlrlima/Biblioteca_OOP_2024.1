class Menu{

void criarconta(){
    Scanner s=new Scanner(System.in);

    System.out.println("----------------------------------------");
    System.out.println("CRIAR CONTA\t");
    System.out.println("----------------------------------------");

    
    Sring cpf, nome, senha, endereco, telefone;
    
        System.out.println("Digite seu nome: ");
        nome = s.nextLine();
        s.nextLine();

        System.out.println("Digite seu endereco: ");
        nome = s.nextLine();
        s.nextLine();

        do{
            System.out.println("Digite seu telefone: ");
            telefone = s.nextLine();
            s.nextLine();
        }while(telefone.length()>13 || telefone.length()<9);


    do{
        System.out.println("Digite seu CPF: ")
        id = s.nextLine();
        s.nextLine();
    }while(id.length()!=11);

    do{
        System.out.println("Crie uma senha: (8 ou mais caracteres)")
        senha = s.nextLine();
        s.nextLine();
    }while(senha.length()<8);

    System.out.println("----------------------------------------");
    System.out.println("CONTA CRIADA!\t");
    System.out.println("----------------------------------------");

    String senhauppercase=senha.toUpperCase();
    int tamanhodasenha=senha.lenght();
    if(senhauppercase[tamanhodasenha-1]=='K' && senhauppercase[tamanhodasenha-1]=='B' senhauppercase[tamanhodasenha-1]=='#' senhauppercase[tamanhodasenha-1]=='*'  senhauppercase[tamanhodasenha-1]=='*'){

    }
    else{
        Cliente c= new Cliente();
        c.setIdCliente(id);
        c.setNome(nome);
    }

}

int inicializarMenu0(){


        do{
            System.out.println("----------------------------------------");
            System.out.println("\tSISTEMA BIBLIOTECÁRIO UNICAP");
            System.out.println("----------------------------------------");
            System.out.println("\t[1] Entrar\n\t[2] Nova Conta\n\t[3] Encerrar");
            System.out.println("----------------------------------------");
            System.out.print("--> ");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

        }while(choice<1 || choice>3);

        return choice;
}


public class void main(String[] args){
    int choice=inicializarMenu0();

    Swich (choice){
        case 3: return;

        case 2: criarconta();

        case 1: 
    }
}
}