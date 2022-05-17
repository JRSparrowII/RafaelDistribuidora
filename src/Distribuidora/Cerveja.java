package Distribuidora;

public class Cerveja extends Produto{
	
	public Cerveja() {
		super();
	}
	
	public Cerveja(String marca, String tipo, double unidadeMedida, double precoCusto, double precoVenda,
		double estoqueMinimo) {

	boolean realizarVenda (double venda) {
		
		//Tem estoque minimo disponivel
		if (venda >= getEstoqueMinimo()) {
			venda = venda - getEstoqueMinimo();
			return true;
		} else {//nao tem estoque minimo
			if (venda < getEstoqueMinimo()){
				System.out.println("Seu estoque está quase acabando! Você tem apenas" + getEstoqueMinimo() + "unidade deste produto!");
			} else {
				return false; //Voce nao tem mais produtos no estoque para fazer esta venda!
			}
		}
	
	}
	
	}
	
	public void abastecer (double qtdeabastecida) {
		this.getEstoqueMinimo = this.getEstoqueMinimo() + qtdeabastecida; //perguntar ao Rodrigo
	}
	
	public void consultarEstoque () {
		System.out.println("Seu saldo atual para este produto é: " + getEstoqueMinimo());
	}
	
} 
