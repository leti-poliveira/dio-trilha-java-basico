package edu.leticia.estruturasderepeticao;

/*//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
*/
//Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:

public class ExemploFor {
    
	public static void main(String[] args) {         //carneirinhos ++ operador unário de incrementação.
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println("Contando carneirinhos " + carneirinhos);
		}

        System.out.println("Joaozinho dormiu");
	}
        }

/*usar em qualquer cenário que seja preciso realizar uma contagem que
 tenha um valor fixo onde quer chegar, mas enquanto isso não for 
 correspondido, a nossa aplicaçao continua executando. */