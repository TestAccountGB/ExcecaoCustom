package classes;

import java.io.IOException;


public class Funcionario extends Pessoa{
	
	@Override
	public void metodoGenericoToSemCriatividade() throws IOException{ //Nao podemos lancar execoes checked que sao
		//Superclasses em classes extendidas e que nao foram lancada na superclasse da classe extendida, mas podemos
		//Lancar excecao RuntimeException e suas subclasses, porque sao excecoes unchecked
		
		//Quando temos uma classe que extende de outra e temos que
		//Sobrescrever um metodo que joga excecoes, temos muitas possibilidades. Podemos apenas nao usar elas, ou seja,
		//Nao vamos usar o throws, podemos lancar apenas uma excecao, podemos lancar todas as excecoes, ou podemos
		//lancar outras execoes alem da superclasse
		
		//Em resumo, podemos relancar todas as excecoes que a superclasse lancou, ou tambem nao lancar nenhuma e se
		//A gente quiser lancar alguma outra excecao precisa ser RuntimeException ou subclasse dela e se a gente quiser
		//Lancar alguma excecao checked, precisamos lancar alguma subclasse dela, como no exemplo acima. Nao podemos
		//Lancar IOException, mas podemos lancar uma subclasse dela, porque excecoes checked devem ser tratadas desde
		//O comeco, ai nao faria sentido ter ela em uma subclasse ao inves da superclasse.
	}
}