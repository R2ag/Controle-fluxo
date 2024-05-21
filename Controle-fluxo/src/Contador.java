public class Contador {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Por favor, forneça dois números inteiros como argumentos.");
                return;
            }

            // Converte os argumentos para inteiros
            int primeiroNumero = Integer.parseInt(args[0]);
            int segundoNumero = Integer.parseInt(args[1]);

            // Verifica se o primeiro número é maior que o segundo
            if (primeiroNumero > segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Executa a lógica de impressão dos números
            for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Os argumentos devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
