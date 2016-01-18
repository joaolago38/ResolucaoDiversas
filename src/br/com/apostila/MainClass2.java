package br.com.apostila;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		if (child instanceof Parent) {
			System.out.println("true");
		} else {
			
			System.out.println("false");
		}

	}

}
