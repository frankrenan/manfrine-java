package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class FuncionarioController extends UsuarioController {

	private List<Funcionario> list = new ArrayList<>();

	public void cadastrarFuncionario(Funcionario func) {
		list.add(func);
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
	public void realizarLogin() {
		for (Funcionario func : list) {
			if (func.getLogin().equals("Frank") && func.getSenha() == 123) {
				System.out.println("Bem vindo :" + func.getNome());
			}
		}
	}

}
