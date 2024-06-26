
import java.io.*;
import java.util.*;
import biblioClasses.*;
@SuppressWarnings("unchecked")

public class Biblioteca  {

    public static void main(String[] args) throws Exception{
        
        //Array lists de referência

        ArrayList<Pessoa> userList = DeserializeUser();
        ArrayList<String> cpfList = DeserializeCPF();
        ArrayList<Livro> bookList = DeserializeLivro();
 
        Bibliotecario admin = new Bibliotecario();
        if (userList.size() == 0){
            admin.setCPF("00000000000");
            admin.setSenha("12345678");
            userList.add(admin);
        }

        //admin.resetBooks(bookList);

        Menu myMenu = new Menu();
        boolean biblioteca = true;

        while(biblioteca){

            switch( myMenu.Reception() ){

                case 1: //Login
                    
                    Cliente user = new Cliente();
                    int index = user.Login(userList);
                
                    if ( userList.get(index) instanceof Cliente){

                        myMenu.MenuCliente(userList.get(index), bookList);

                    }

                    else{
                        myMenu.MenuAdmin(admin, bookList, userList);
                    }

                    Serialize(userList, bookList, cpfList);

                    break;

                case 2: //Nova Conta (Cliente)

                    Cliente novoCliente = new Cliente();

                    novoCliente.Registro(userList, cpfList);

                    break;

                case 3: //Encerrar
                    biblioteca = false;

            }
        }

        Serialize(userList, bookList, cpfList);
    }

    
    //Metodo para a serializacao de objetos
    
    static void Serialize(ArrayList<Pessoa> userList, ArrayList<Livro> bookList, 
    ArrayList<String> cpfList){

        try { 

            FileOutputStream userOutput = new FileOutputStream("usersListData"); 
            ObjectOutputStream userStream = new ObjectOutputStream(userOutput); 
    
            userStream.writeObject(userList); 
            userStream.close(); 
            userOutput.close(); 

            FileOutputStream bookOutput = new FileOutputStream("booksListData"); 
            ObjectOutputStream bookStream = new ObjectOutputStream(bookOutput); 
    
            bookStream.writeObject(bookList); 
            bookStream.close(); 
            bookStream.close(); 

            FileOutputStream cpfOutput = new FileOutputStream("cpfsListData"); 
            ObjectOutputStream cpfStream = new ObjectOutputStream(cpfOutput); 
    
            cpfStream.writeObject(cpfList); 
            cpfStream.close(); 
            cpfStream.close();
    
        } 
    
        catch (IOException ioe) { 
            ioe.printStackTrace(); 
        }

    }

    
    //Metodos para a deserializacao de objetos

    static ArrayList<String> DeserializeCPF(){

        ArrayList<String> cpfs = new ArrayList<String>();

        try
        {   
            
            FileInputStream cpfInput = new FileInputStream("cpfsListData");
            ObjectInputStream cpfStream = new ObjectInputStream(cpfInput);
             
            
            cpfs = (ArrayList<String>)cpfStream.readObject();
             
            cpfStream.close();
            cpfInput.close();

        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

        return cpfs;
    }

    static ArrayList<Pessoa> DeserializeUser(){

        ArrayList<Pessoa> user = new ArrayList<Pessoa>();

        try{
            FileInputStream userInput = new FileInputStream("usersListData");
            ObjectInputStream userStream = new ObjectInputStream(userInput);
             
            user = (ArrayList<Pessoa>)userStream.readObject();
             
            userStream.close();
            userInput.close();
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

        return user;
    }

    static ArrayList<Livro> DeserializeLivro(){

        ArrayList<Livro> book = new ArrayList<Livro>();

        try{
            FileInputStream bookInput = new FileInputStream("booksListData");
            ObjectInputStream bookStream = new ObjectInputStream(bookInput);
            
            book = (ArrayList<Livro>)bookStream.readObject();
             
            bookStream.close();
            bookInput.close();
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

        return book;
    }
}