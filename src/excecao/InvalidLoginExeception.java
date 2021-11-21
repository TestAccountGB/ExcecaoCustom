package excecao;

@SuppressWarnings("serial")
public class InvalidLoginExeception extends Exception{ //So colocar "extends Exception".

	public InvalidLoginExeception(){
		super("Usuario ou Senha Invalido");
		//Mandamos para a superclasse (Throwable) uma mensagem que vai ser mostrada no console.
	}
	
	public InvalidLoginExeception(String s) { //Podemos fazer uma sobrecarga de construtores, para deixar a possibilidade
		//De algum usuario botar uma mensagem personalizada.
		super(s);
	}
	
}
//E pronto, e so isso mesmo ._.

//Obs.: Nao devemos fazer o tratamento na excecao, NUNCA.