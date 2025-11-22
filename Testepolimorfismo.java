
package Metodos;
public class Testepolimorfismo {
	
	
    public static void main(String[] args) {
    	
        // 1)----  Criar instâncias das classes concretas de pagamento
    	
        MetodosPagamentos cartao = new CartaoCredito("1234.5678.9012.3456");
        MetodosPagamentos boleto = new Boleto("98765.43210 12345.678901 09876.543210 1 00000000049900");
        MetodosPagamentos pix = new Pix("chavepix@email.com");

        // 2)--- Chamar o método estático ProcessadorPagamento.processar()
        // 3)--- O  polimorfismo garante que o método realizarPagamento() correto
        // 4)--- será chamado para cada tipo de objeto.

        System.out.println("--- Demonstração de Polimorfismo ---");

        // Teste com CartaoCredito (Valor: 150.75)
        ProcessadorPagamento.processar(cartao, 150.75);

        // Teste com Boleto (Valor: 499.00)
        ProcessadorPagamento.processar(boleto, 499.00);

        // Teste com Pix (Valor: 25.50)
        ProcessadorPagamento.processar(pix, 25.50);

        System.out.println("--- Fim da Demonstração ---");
    }
}