public class Parafuso extends Produto {
    
    private double comprimento;
    private double diamentro;
    
    public Parafuso(String c, String n, String d, double preco){
        super(c,n,d,preco);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getDiamentro() {
        return diamentro;
    }

    public void setDiamentro(double diamentro) {
        this.diamentro = diamentro;
    }
    
    
    
    public double calcularPrecoFinal(){
        double reajuste= getPreco()*0.15;
        double precofinal= reajuste+preco;
        return precofinal;
    }
    public String imprimirDados(){
        return ("Codigo: "+getCod()+"nome:"+getNome()+"descricao: "+getDescricao()
                +"Valor: "+getPreco()+"Comprimento: "+this.getComprimento()+"diametro: "+this.getDiamentro());
    }
}
// IMPRIMIR NO MAIN System.out.println(p1.imprimirdados());