package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Scanner;

import model.bean.Funcionario;
import model.bean.Produto;
import model.dao.FuncionarioDao;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		FuncionarioDao fc = new FuncionarioDao();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Quantos Usuários?");
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
		System.out.println("Quantos produtos?: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Descrição Produto: ");
			sc.nextLine();
			String desc = sc.nextLine();

			System.out.print("Data: ");
			Date x = sdf1.parse(sc.next());

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			fc.cadastrarProduto(new Produto(i, desc, quantidade, x));

		}

		System.out.print("Pesquisar produto: ");
		String produtopesq = sc.next();

		try {
			fc.removerProduto(produtopesq);
		} catch (ConcurrentModificationException e) {
			System.out.println();
			System.out.println("Excluído com sucesso");
		}

		System.out.println(fc);

		sc.close();

	}

}
