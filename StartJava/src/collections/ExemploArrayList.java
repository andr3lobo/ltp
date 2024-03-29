package collections;

import java.util.ArrayList;
import java.util.List;//ArrayList implementa a interface List

public class ExemploArrayList {

	public static void main(String[] args) {
		List<Integer> km = new ArrayList<Integer>();
		
		km.add(3);
		km.add(41);
		km.add(1983);
		km.add(28);
		km.add(79);
		
		for (int i = 0; i < km.size(); i++) {
			System.out.println(km.get(i));
		}
		
		for(Integer k: km)
			System.out.println(k);
		
	}

}
