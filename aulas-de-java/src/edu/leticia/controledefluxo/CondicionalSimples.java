public class CondicionalSimples {

public static void main(String[] args)  {

// CaixaEletronico.java

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo) 

        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo"); 
        //PARA ADICIONAR ESTRUTURA COMPOSTA:
        
      /*  } else {
        System.out.println("Saldo insuficiente");          
        }
         Acima já vira uma condicional composta por causa do ELSE
         A condicional simples tem somente o IF
         */
        System.out.println(saldo);
}
}
