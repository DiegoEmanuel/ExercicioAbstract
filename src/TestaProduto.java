public class TestaProduto {
    public static void main(String[] args) {
        
    
    
    Motor m = new Motor("M654", "FERARI 300S", "MELHOR MOTOR DO MUNDO", 155872.99, 600, 14000);
    Parafuso f = new Parafuso("M654", "Parafuso Tramontina", "Muito bom", 1.99, 15, 10);
    
    System.out.println(m.imprimirDados());
    System.out.println("Preço Final: "+ m.calcularPrecoFinal());
    
    System.out.println(f.imprimirDados());
    System.out.println("Preço Final: "+ f.calcularPrecoFinal());
    
    } 
}