package model.bean;

public class Funcionario extends Usuario {

	private String nome;
	private String cpf;
	private String rg;

	public Funcionario() {
	}

	public Funcionario(int codigo, String login, int senha, String nome, String cpf, String rg) {
		super(codigo, login, senha);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
