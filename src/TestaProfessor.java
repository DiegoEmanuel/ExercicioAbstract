public class TestaProfessor {
    public static void main(String[] args) {
        
        ProfessorIntegral pI = new ProfessorIntegral("Matheus", 3500);
        ProfessorHorista pH = new ProfessorHorista("Agostinho", 160, 20);
        
        System.out.println("Salario do Professor Integral " + pI.getNome() +", é: "+ pI.calculaSalarioLiquido());
        System.out.println("Salario do Professor Horista " + pH.getNome() +", é: "+ pH.calculaSalarioLiquido());
        
    }
}