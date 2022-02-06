package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		System.out.print("Quantos produtos desejas registrar? ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade");
			int quantidade = sc.nextInt();

			double total = quantidade * preco;

			Produto produto1 = new Produto(nome, preco, quantidade, total);
			produtos.add(produto1);
		}
		String caminho = "C:\\Users\\Joel Fernandes\\Documents\\Documentos Pessoais\\produtos.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {

			for (Produto produto : produtos) {
				bw.write(produto.getNome() + ", " + produto.getTotal());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
