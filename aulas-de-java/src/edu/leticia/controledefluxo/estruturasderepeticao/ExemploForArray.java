package estruturasderepeticao;

/*For Each:
O uso do for / each
 está fortemente relacionado, com um cenário onde contenha um array
  ou coleção, e assim , a interação é baseada nos elementos 
  da coleção. */

public class ExemploForArray {
    // ExemploFor.java
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for (int x=0; x < alunos.length; x++)  {
          System.out.println("O aluno no indice x=" + x + " é " + alunos [ x ]  );
        }
    
    }
    }





