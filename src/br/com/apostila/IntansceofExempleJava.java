package br.com.apostila;

public class IntansceofExempleJava extends Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntansceofExempleJava teste =  new IntansceofExempleJava() ;
		Object obj = new String("Teste");
		if(obj instanceof String)
			System.out.println("Verdadeiro");
		if(teste instanceof Hello){
			System.out.println(" teste Verdadeiro");
		}

	}

}
