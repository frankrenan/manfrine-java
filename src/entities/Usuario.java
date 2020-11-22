package entities;

public abstract class Usuario {

	private int codigo;
	private String login;
	private int senha;

	public Usuario(int codigo, String login, int senha) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}

	public Usuario() {
	}

	public int getCodigo() {
		return codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
