package Distribuidora;

import java.util.Scanner;

public class testaProduto {
	

	public static void main(String[] args) {
		
		Cerveja cerveja = new Cerveja();
				
		cerveja.setMarca ("Skol");
		cerveja.setTipo ("Lata");
		cerveja.setTipo ("Caixa"); //perguntar para o Rodrigo
		cerveja.setEstoqueMinimo (10);
		cerveja.setPrecoVenda (5);
		cerveja.setPrecoCusto (3);
		cerveja.setUnidadeMedida(0.5); // cada lata tem 500 ml por unidade
		//cerveja.unidadeMedida = "Caixa"; //cada caixa vem com 12 latas de cerveja
		
		System.out.println("Nome da Cerveja é: " + cerveja.getMarca());
		
		
		
//		cerveja.marca = "Kaizer";
//		cerveja.tipo = "Lata";
//		cerveja.tipo = "Caixa";
//		cerveja.estoqueMinimo = 12;
//		cerveja.precoVenda = 4;
//		cerveja.precoCusto = 3;
//		cerveja.unidadeMedida = 0.5;  // cada lata tem 350 ml por unidade
//		//cerveja.unidadeMedida = "Caixa"; //cada caixa vem com 12 latas de cerveja
//		
//		System.out.println("Nome da Cerveja é: " + cerveja.marca);
//		
//		cerveja.marca = "Itaipava";
//		cerveja.tipo = "Lata";
//		cerveja.tipo = "Caixa";
//		cerveja.estoqueMinimo = 15;
//		cerveja.precoVenda = 3;
//		cerveja.precoCusto = 2;
//		cerveja.unidadeMedida = 0.350; // cada lata tem 350 ml por unidade
//		//cerveja.unidadeMedida = "Caixa"; //cada caixa vem com 12 latas de cerveja
//		
//		System.out.println("Nome da Cerveja é: " + cerveja.marca);
		
//		double autonomia = cerveja.obterpreco();
//		System.out.println("O preço da cerveja é: " + autonomia);
		
		//double qtdeCerveja = 
		
		boolean vendaEfetuada = cerveja.realizarVenda(10);
		if (vendaEfetuada) {
			System.out.println("Venda efetuada com sucesso");
			cerveja.consultarEstoque();
		} else {
			System.out.println("Não foi possível realizar a venda! Estoque Insuficiente!");
		}
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de cerveja adquirida");
		cerveja.setMarca (scan.next()); //perguntar para o Rodrigo se esta certo
		
		System.out.println("Abastecimento de XXXXXXX");
		cerveja.abastecer(0);
		cerveja.consultarEstoque();
		
		//System.out.println("O total de cervejas cadastradas é: " + Cerveja.getTotal()); 
						
		}
	
}
