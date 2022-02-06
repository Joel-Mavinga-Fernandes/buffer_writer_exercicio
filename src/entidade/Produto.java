package entidade;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	private double total;

public Produto(String nome, double preco, int quantidade, double total) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.total = total;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public double getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
 
	}
}
