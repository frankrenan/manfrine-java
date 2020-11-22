package entities;

import java.util.Date;

public class Produto {

	private int codigo;
	private String descricao;
	private int quantidade;
	private Date validade;

	public Produto() {
	}

	public Produto(int codigo, String descricao, int quantidade, Date validade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.validade = validade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

}
