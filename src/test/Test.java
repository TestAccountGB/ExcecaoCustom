package test;

import java.util.Scanner;
import excecao.InvalidLoginExeception;

public class Test {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean loop = true;
		
		while (loop) {
			try {
				logar();
				loop = false;
			} catch (InvalidLoginExeception e) {
				e.printStackTrace();
			}
		}
	}

	public static void logar() throws InvalidLoginExeception { // Aqui usamos nossa excecao
		
		System.out.println("Digite o Usuario: ");
		String usuario = scan.next();
		
		System.out.println("Digite a Senha: ");
		String senha = scan.next();
		
		if (!usuario.equalsIgnoreCase("Goku") || !senha.equals("123")) {// Se usuario for diferente de "Goku", ou senha
			// Diferente de "123", lance a excecao.
			//throw new InvalidLoginExeception(); //Mensagem Default
			throw new InvalidLoginExeception("Mensagem Personalizada :D");
		}//Se forem iguais, aparacer a mensagem de logado.
		System.out.println("Logado");
	}
}