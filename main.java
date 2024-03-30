package array;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		//配列 不可変
		/*int[] hairetu = new int[2];

		hairetu[0] = 1;
		hairetu[1] = 2;

		for (int i = 0; i < hairetu.length; i++) {
			System.out.println(hairetu[i]);
		}*/
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		


	}

}
