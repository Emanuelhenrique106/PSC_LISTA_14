package Metodos; 
public class ProcessadorPagamento {
    /**
     * Método polimórfico que processa um pagamento.
     * O tipo de pagamento é determinado em tempo de execução
     * pela implementação específica do método realizarPagamento()
     * na classe concreta passada (CartaoCredito, Boleto ou Pix).
     *
     * @param metodo A instância da classe de pagamento que implementa MetodoPagamento.
     * @param valor O valor a ser pago.
     */
    public static void processar(MetodosPagamentos metodo, double valor) {
        System.out.println("\n--- Processando Pagamento ---");
        metodo.realizarPagamento(valor);
        System.out.println("-----------------------------\n");
    }
}