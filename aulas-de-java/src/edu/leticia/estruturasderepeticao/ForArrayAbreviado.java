package edu.leticia.estruturasderepeticao;

public class ForArrayAbreviado {
    
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos) {
          System.out.println("Nome do aluno é: " + aluno);
        }
    
    }
    }