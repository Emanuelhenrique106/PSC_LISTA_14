package Metodos;

	public class Boleto implements MetodosPagamentos{
	    private String codigoBarra;

	    public Boleto(String codigoBarra) {
	        this.codigoBarra = codigoBarra;
	    }

	    @Override
	    public void realizarPagamento(double valor) {
	        System.out.printf("Pagamento de R$ %.2f realizado com Boleto. Boleto gerado e enviado por e-mail. Código de barras: %s.\n", valor, codigoBarra);
	    }
	}
	


