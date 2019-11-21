public class TestaProduto {
    public static void main(String[] args) {
        
    
    
    Motor m = new Motor("HJFDH", "uno 939", "Economico demais", 5000, 600, 14000);
    Parafuso f = new Parafuso("UE39", "Parafuso", "QuebraFacil", 1.99, 15, 10);
    
    System.out.println(m.imprimirDados());
    System.out.println("Preço Final: "+ m.calcularPrecoFinal());
    
    System.out.println(f.imprimirDados());
    System.out.println("Preço Final: "+ f.calcularPrecoFinal());
    
    } 
}