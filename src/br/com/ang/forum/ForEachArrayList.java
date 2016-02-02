package br.com.ang.forum;

import java.util.ArrayList;

public class ForEachArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Garima");
		list.add("anyforum.in");
		list.add("Sailesh");
		for (String s : list) {
			System.out.println(s);
		}

	}

}
