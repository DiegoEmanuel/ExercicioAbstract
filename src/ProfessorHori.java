public class ProfessorHori extends Professor {
          
       public ProfessorHori (String nome, double salario){
        super (nome,salario);
      }
       
             public double calculasalario() {
               double resultado=salario*0.05;
               resultado = salario-resultado;
               return resultado;
           }
}
