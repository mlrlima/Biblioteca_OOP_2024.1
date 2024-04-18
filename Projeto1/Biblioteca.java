class Biblioteca {
    
    private ArrayList<Livro> ListaCliente;
    private ArrayList<Cliente> ListaLivro;
    
    public listas(){
        Lista Livros = new ArrayList<>();
        Lista Cliente = new ArrayList<>();
        
    }

    public void addLivro(Livro livro) {
        ListaLivro.add(livro);
    }
    
    public void removerLivro(Livro livro) {
        ListaLivro.remove(livro);
    }
    
    public void addCliente(Cliente cliente) {
        ListaCliente.add(cliente);
    }
    
    public void removerCliente(Cliente cliente) {
        ListaCliente.remove(cliente);
    }
    
}
