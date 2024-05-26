public class PlanoOperadora {
  
// Nesse caso compensa mais usar o switch case do que else if (exemplo abaixo)

	public static void main(String[] args) { //esse exemplo não tem o break intencionalmente.
		String plano = "B"; // M / T         //porque a pessoa pode ter mais de um plano desse.   
                                             // foi construído em escala de importância propositalmente.
		switch (plano) {                     // ele pega o que está abaixo.
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}

//Exemplo do else if:

/*// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
 */





