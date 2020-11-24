package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.bean.Produto;

public class ProdutoDao {

	private List<Produto> list = new ArrayList<>();

	public void cadastrarProduto(Produto produto) {
		list.add(produto);
	}

	public Produto pesquisarProduto(String produtopesq) {
		for (Produto produto : list) {
			if (produto.getDescricao().equals(produtopesq)) {
				return produto;
			}
		}
		return null;
	}

	public void listarProduto() {
		for (Produto produto : list) {
			System.out.println(produto);
		}
	}

	public void removerProduto(String produtopesq) {
		for (Produto produto : list) {
			if (produto.getDescricao().equals(produtopesq)) {
				list.remove(produto);
			}
		}
	}

}
