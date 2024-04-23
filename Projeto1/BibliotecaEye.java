import Biblioteca.*
import BibliotecaMain;
import java.util.*;


public class SistemaBiblioteca extends Livro {
    private List<Livro> acervo;
    private int contadorLivros;

    public SistemaBiblioteca() {
        this.acervo = new ArrayList<>();
        this.contadorLivros = 1;
        acervoInicial();
    }
    
    private void acervoInicial() {
        String[] livrosIniciais = {
            
            "Dom Casmurro - Machado de Assis",
            "Capitães de Areia - Jorge Amado",
            "Vidas Secas - Graciliano Ramos",
            "O Cortiço - Aluísio Azevedo",
            "O Quinze - Raquel de Queiroz",
            "Macunaíma - Mário de Andrade",
            "A Hora da Estrela - Clarice Lispector",
            "Lira dos Vinte Anos - Álvares de Azevedo",
            "Triste Fim de Policarpo Quaresma - Lima Barreto",
            "Iracema - José de Alencar",
            "Os Miseráveis - Victor Hugo",
            "Cem Anos de Solidão - Gabriel Garcia Márquez",
            "Crime e Castigo - Dostoiévski",
            "Anna Karênina - Liev Tolstói",
            "O Conde de Monte Cristo - Alexandre Dumas",
            "A Metamorfose - Franz Kafka",
            "Guerra e Paz - Tolstói",
            "O Retrato de Dorian Gray - Oscar Wilde",
            "Ensaio Sobre a Cegueira - José Saramago",
            "Dom Quixote - Miguel de Cervantes",
            "Orgulho e Preconceito - Jane Austen",
            "Madame Bovary - Gustave Flaubert",
            "Moby Dick - Herman Melville",
            "O Apanhador no Campo de Centeio - J.D. Salinger",
            "O Sol é para Todos - Harper Lee",
            "O Velho e o Mar - Ernest Hemingway",
            "Hamlet - William Shakespeare",
            "Morte em Veneza - Thomas Mann",
            "Folhas de Relva - Walt Whitman",
            "O Grande Gatsby - F. Scott Fitzgerald",
            "Lolita - Vladimir Nabokov",
            "Odisseia - Homero",
            "A Divina Comédia - Dante Alighieri",
            "O Som e a Fúria - William Faulkner",
            "Grandes Esperanças - Charles Dickens",
            "O Nome da Rosa - Umberto Eco",
            "1984 - George Orwell",
            "Fahrenheit 451 - Ray Bradbury",
            "O Conto da Aia - Margaret Atwood",
            "O Processo - Franz Kafka",
            "Admirável Mundo Novo - Aldous Huxley",
            "Laranja Mecânica - Anthony Burgess",
            "A Máquina do Tempo - H. G. Wells",
            "Eu, Robô - Isaac Asimov",
            "Neuromancer - William Gibson",
            "O Silêncio dos Inocentes - Thomas Harris",
            "As Areias do Tempo - Sidney Sheldon",
            "Assassinato no Expresso do Oriente - Agatha Christie",
            "As Aventuras de Sherlock Holmes - Arthur Conan Doyle",
            "Não Conte a Ninguém - Harlan Coben",
            "Mr. Mercedes - Stephen King",
            "O Louco de Bergerac - Georges Simenon",
            "O Meu Pé de Laranja Lima - José Mauro de Vasconcelos",
            "Reinações de Narizinho - Monteiro Lobato",
            "Ou Isto ou Aquilo - Cecília Meireles",
            "As Cocadas - Cora Carolina",
            "A Bolsa Amarela - Lygia Bojunga",
            "Sapiens – Uma Breve História da Humanidade - Yuval Harari",
            "Terra Sonâmbula - Mia Couto",
            "A Amiga Genial - Elena Ferrante",
            "Mulherzinhas - Louisa May Alcott",
            "Jane Eyre - Charlotte Bronte",
            "Como as Democracias Morrem - Steven Levitsky",
            "Alice no País das Maravilhas - Lewis Carroll",
            "O Pequeno Príncipe - Antoine de Saint-Exupéry",
            "Contos de Grimm - Jacob e Wilhelm Grimm",
            "O Patinho Feio - Hans Christian Andersen",
            "Viagem ao Centro da Terra - Júlio Verne",
            "As Aventuras de Pinóquio - Carlo Collodi",
            "Tá Dando Onda - Lucas Rodolfo Celestino",
            "Desventuras em série - Lemony Snicket",
            "Duna - Frank Herbert",
            "Percy Jackson: O Ladrão de Raios - Rick Riordan",
            "Diário de um Banana - Jeff Kinney",
            "Uma mentirinha nunca matou ninguém - Roberto Regis",
            "Como faltar aula de Diego - Vínicius Martins",
            "Ilha do Tesouro - Robert Louis Stevenson",
            "Apologia de Socrates pt. 2 - Maria Luiza",
            "A Íliada - Homero",
            "Teogonia  - Hesiodo",
            "A Bíblia - Deus",
            "Biblioteca de Alexandria – As Histórias da Maior Biblioteca da Antiguidade - Derek Adie Flower",
            "O Grimório - ERROR!"

            
        };

        

        for (String livro : livrosIniciais) {
            String tituloOriginal;
            String[] partes = livro.split(" - ");
            
            
            String[] palavrasTitulo = partes[0].trim().toLowerCase().split("\\s+");
            tituloOriginal = partes[0];
            String[] palavrasDefinicao = {"the ", "a ", "o ", "os "};

        boolean definicaoEncontrada = false;
        for (String palavra : palavrasDefinicao) {
            if (palavrasTitulo[0].equals(palavra)) {
                definicaoEncontrada = true;
                break;
            }
        }


        String titulo = partes[0];
        if (definicaoEncontrada && palavrasTitulo.length > 1) {
             titulo = palavrasTitulo[1];
        }
        
        adicionarLivro(partes[1],titulo, partes[0]);
        }
    }


    public void adicionarLivro(String autor, String titulo, String tituloOriginal) {
        Livro livro = new Livro();
        livro.setTitulo(tituloOriginal);
        String id = gerarIdUnico(autor, titulo);
        livro.setAutor(autor);
        livro.setId(id);
        livro.inicializarRating();
        livro.setDisponivel();
        acervo.add(livro);
        contadorLivros++;
        
    }

    private String gerarIdUnico(String autor, String titulo) {
        String[] palavras = autor.split(" ");
        String sobrenome = "";

        if (palavras.length > 1) {
            sobrenome = palavras[palavras.length - 1];
        } else {
            sobrenome = autor;
        }

        String letraSobrenome = sobrenome.substring(0, 1).toUpperCase();
        String letraTitulo = titulo.substring(0, 1).toUpperCase();
        String sequencial = String.format("%04d", contadorLivros);
        return letraSobrenome + letraTitulo + sequencial;
    }

    public void exibirAcervo() {
        
        Collections.sort(acervo, Comparator.comparing(Livro::getId));
        
        for (Livro livro : acervo) {
            System.out.println(" ");
            System.out.println("ID: " + livro.getId() + ", Autor: " + livro.getAutor() + ", Título: " + livro.getTitulo());
            System.out.println(" ");
        }
    }

    void menuBiblioteca(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            
            
            System.out.println("-----------------------------");
            System.out.println("\tBEM-VINDO, FUNCIONÁRIO!!!");
            System.out.println("[0] Encerrar");
            System.out.println("[1] Adicionar livro.");
            System.out.println("[2] Exibir acervo.");
            System.out.println("----------------------------");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    sistema.adicionarLivro(scanner);
                    break;
                case 2:
                    sistema.exibirAcervo();
                    break;
                case 3:
                    System.out.print(listaCliente);

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    public void adicionarLivro(Scanner scanner) {
        
        String tituloOriginal;
        System.out.println("-----------------------");
        System.out.println("Nome do autor: \n---> ");
        String autor = scanner.nextLine();
        System.out.println("-----------------------");
        System.out.println("Título do livro: \n--->");
        String titulo = scanner.nextLine();
        String[] palavrasTitulo = titulo.trim().toLowerCase().split("\\s+");
        tituloOriginal = titulo;
        String[] palavrasDefinicao = {"the", "a", "o", "os"};

        boolean definicaoEncontrada = false;
        for (String palavra : palavrasDefinicao) {
            if (palavrasTitulo[0].equals(palavra)) {
                definicaoEncontrada = true;
                break;
            }
        }

        if (definicaoEncontrada && palavrasTitulo.length > 1) {
             titulo = palavrasTitulo[1];
        }

        adicionarLivro(autor, titulo, tituloOriginal);
        System.out.println(" ");
        System.out.println("Livro adicionado com Sucesso.");
        System.out.println("-------------------------------");
    }
}
