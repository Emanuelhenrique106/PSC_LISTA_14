package Metodos;

	public class Pix implements MetodosPagamentos {
	    private String chavePix;

	    public Pix(String chavePix) {
	        this.chavePix = chavePix;
	    }

	    @Override
	    public void realizarPagamento(double valor) {
	        System.out.printf("Pagamento de R$ %.2f realizado com Pix. Transação instantânea. Chave Pix: %s.\n", valor, chavePix);
	    }
	}


