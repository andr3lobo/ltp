package collections;

import java.util.*;

public class Exe4 {

	public static void main(String[] args) {
		
		String x = mensagem();
		System.out.println(x);
		
	     ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Gregor Clegane");  
	     alist.add("Khal Drogo");  
	     alist.add("Cersei Lannister");  
	     alist.add("Sandor Clegane"); 
	     alist.add("Tyrion Lannister");
	     
	}

	private static String mensagem() {
		return "Façam a lista 10";
	}

}
