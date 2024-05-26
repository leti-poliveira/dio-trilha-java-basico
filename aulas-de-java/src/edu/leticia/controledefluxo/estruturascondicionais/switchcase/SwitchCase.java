package estruturascondicionais.switchcase;
public class SwitchCase {
    

// o prof disse que é melhor usar o if else if else...


// SistemaMedida.java
// Modo condicional switch / case
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}



