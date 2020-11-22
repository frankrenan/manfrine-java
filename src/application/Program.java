package application;

import java.util.Scanner;

import controller.FuncionarioController;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FuncionarioController fc = new FuncionarioController();

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Codigo: ");
			int codigo = sc.nextInt();
			System.out.print("Login: ");
			sc.nextLine();
			String login = sc.nextLine();
			System.out.print("Senha: ");
			int senha = sc.nextInt();

			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Cpf: ");
			String cpf = sc.nextLine();
			System.out.print("RG: ");
			String rg = sc.nextLine();

			fc.cadastrarFuncionario(new Funcionario(codigo, login, senha, nome, cpf, rg));

		}


		sc.close();

	}

}
