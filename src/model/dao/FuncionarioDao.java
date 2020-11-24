package model.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.bean.Funcionario;
import model.bean.Produto;

public class FuncionarioDao extends UsuarioDao {

	private List<Funcionario> list = new ArrayList<>();
	private List<Produto> listProd = new ArrayList<>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public void cadastrarProduto(Produto produto) {
		listProd.add(produto);
	}

	public List<Produto> getListProd() {
		return listProd;
	}

	public void cadastrarFuncionario(Funcionario func) {
		list.add(func);
	}

	public void removerProduto(String produtopesq) {
		for (Produto produto : listProd) {
			if (produto.getDescricao().equals(produtopesq)) {
				listProd.remove(produto);
			}
		}
	}

	public void alterarFuncionario(int codigo) {
		for (Funcionario func : list) {
			if (func.getCodigo() == codigo) {

				Scanner sc = new Scanner(System.in);
				String login = sc.nextLine();
				int senha = sc.nextInt();
				sc.nextLine();
				String nome = sc.nextLine();
				String cpf = sc.nextLine();
				String rg = sc.nextLine();
				list.get(codigo - 1).setLogin(login);
				list.get(codigo - 1).setSenha(senha);
				list.get(codigo - 1).setCpf(cpf);
				list.get(codigo - 1).setNome(nome);
				list.get(codigo - 1).setRg(rg);
				sc.close();
			}
		}
	}

	public void removerFuncionario(int codigo) {
		for (Funcionario funcionario : list) {
			if (funcionario.getCodigo() == codigo) {
				System.out.println(funcionario);
				list.remove(funcionario);
			}
		}
	}

	public void pesquisarFuncionario(int codigo) {
		for (Funcionario funcionario : list) {
			if (funcionario.getCodigo() == codigo) {
				System.out.println(funcionario);
			}
		}
	}

	public void listarFuncionario() {
		for (Funcionario func : list) {
			System.out.println(func);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Funcionarios: \n");
		for (Funcionario func : list) {
			sb.append("Nome: " + func.getNome() + "\n");
			sb.append("Login: " + func.getLogin() + "\n");
			sb.append(getListProd());
		}
		return sb.toString();

	}

	@Override
	public void realizarLogin() {
		for (Funcionario func : list) {
			if (func.getLogin().equals("frank") && func.getSenha() == 123) {
				System.out.println("Bem vindo :" + func.getNome());
				System.out.println();
				System.out.println("Produtos cadastrados com seu usuário");
				System.out.println(getListProd());
			}
		}
	}

}
