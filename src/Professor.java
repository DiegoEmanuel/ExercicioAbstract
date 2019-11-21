public abstract class Professor {
    private String nome="joanita" ;
    double salario = 1400 ;
    
    public Professor(String nome, double salario){
        this.setNome(nome);
        this.setSalario(salario);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public abstract double calculasalario();
}
