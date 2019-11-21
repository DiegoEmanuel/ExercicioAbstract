public abstract class Produto {
    private String cod;
    private String nome;
    private String descricao;
    double preco;
    
    //construtor
    public Produto(String c, String n, String d, double preco){
        this.cod=(c);
        this.nome=(n);
        this.descricao=(d);
        this.preco=(preco);               
    }
    
    //getters e setters
    
    public String getNome(){
       return this.nome;
    }
    public void setNome(String n){
        this.setNome(n);
    }
    public String getCod(){
        return this.cod;
    }
    public void setCod(String c){
        this.setCod(c);
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String d){
        this.setDescricao(d);        
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.setPreco(preco);
    }
    
    
    //metodos
    public abstract double calcularPrecoFinal();
    public abstract String imprimirDados();
}
