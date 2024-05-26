package estruturascondicionais;
public class CondicionalEncadeada {
   // ResultadoEscolar.java

    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)   //true
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação"); //true or false
	else
		System.out.println("Reprovado"); //true or false
    }
}
    
