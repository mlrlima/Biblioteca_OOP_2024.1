class Biblioteca {
    
    private ArrayList<Livro> listaCliente;
    private ArrayList<Cliente> listaLivro;
    
    public listas(){
        listaLivro = new ArrayList<>();
        listaCliente = new ArrayList<>();
        
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
