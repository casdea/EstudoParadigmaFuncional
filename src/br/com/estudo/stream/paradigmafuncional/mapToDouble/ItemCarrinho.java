package br.com.estudo.stream.paradigmafuncional.mapToDouble;

public class ItemCarrinho {

	private int codigoProduto;
	private String nomeProduto;
	private int quantidade;
	private double precoUnitario;
 
	public ItemCarrinho(int codigoProduto, String nomeProduto, int quantidade, double precoUnitario) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "ItemCarrinho [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", quantidade="
				+ quantidade + ", precoUnitario=" + precoUnitario + "]";
	}

}
