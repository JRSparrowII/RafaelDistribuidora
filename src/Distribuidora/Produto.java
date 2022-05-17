package Distribuidora;

public class Produto {

	private String marca;
	private String tipo; //perguntar para o Rodrigo
	private double unidadeMedida;
	private double precoCusto;
	private double precoVenda;
	private double estoqueMinimo;
	private static int total;
	
	public Produto() {
		super();
	}
	
		public Produto(String marca, String tipo, double unidadeMedida, double precoCusto, double precoVenda,
			double estoqueMinimo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.unidadeMedida = unidadeMedida;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.estoqueMinimo = estoqueMinimo;
	}
				
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(double unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(double estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
		
}
