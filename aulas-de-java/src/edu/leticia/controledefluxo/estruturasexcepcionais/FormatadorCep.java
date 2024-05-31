package estruturasexcepcionais;

public class FormatadorCep {
public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep ("1235678");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        System.out.println("Erro: O CEP fornecido é inválido.");
    }
}

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
