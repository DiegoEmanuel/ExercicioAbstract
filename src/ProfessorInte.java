public class ProfessorInte extends Professor {
          
          public ProfessorInte  (String nome, double salario){
                   super (nome,salario);
           }
          
           public double calculasalario(){
               double resultado=salario*0.11;
               resultado = salario-resultado;
               return resultado;
           }
          
          
}