package estruturascondicionais;
public class CondicaoTernariaEncadeada {
    
// É o mesmo que a Condicional Encadeada (if, else if, else...
//porém o código é mais LIMPO.

// Cenário 1
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado"; 
       //resultado = variável. aprovado/reprovado = condição ternária. 
        System.out.println(resultado);
	}

}

    /* Cenário 2
    public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : // nota >=5 && nota <7 ? "Recuperação" // : "Reprovado";
		System.out.println(resultado);					SE NÃO                                     SE
	}
}

 */



