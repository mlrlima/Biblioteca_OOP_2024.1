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


