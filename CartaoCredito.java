package Metodos;
public class CartaoCredito implements MetodosPagamentos {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        // Cobrança de 5% de taxa
        double taxa = valor * 0.05;
        double valorTotal = valor + taxa;
        // O especificador de formato correto para double é %.2f
        System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito. Cobrança de 5%% de taxa (R$ %.2f). Valor total: R$ %.2f.\n", valor, taxa, valorTotal);
    }
}