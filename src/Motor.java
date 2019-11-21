    public class Motor extends Produto {
    
    private double Potencia;
    private double RPM;
    
    public Motor(String c, String n, String d, double preco){
        super(c,n,d,preco);
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double Potencia) {
        this.Potencia = Potencia;
    }

    public double getRPM() {
        return RPM;
    }

    public void setRPM(double RPM) {
        this.RPM = RPM;
    }
    
    
    
    public double calcularPrecoFinal(){
        double reajuste= getPreco()*0.15;
        double precofinal= reajuste+preco;
        return precofinal;
    }
    public String imprimirDados(){
        return ("Codigo: "+getCod()+"nome:"+getNome()+"descricao: "+getDescricao()
                +"Valor: "+getPreco()+"Comprimento: "+this.getPotencia()+"diametro: "+this.getRPM());
    }
}