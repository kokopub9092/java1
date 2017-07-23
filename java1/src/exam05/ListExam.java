package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {
	
	public static void main(String[] args) {
		ArrayList al; // ArrayList배열을 대신함 --> 데이터 타입을 선언해야한다.
		al = new ArrayList<Integer>(); //Integer는 int를 모두 넣을 수 있다.
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(4);
//		al.add(5);
//		System.out.println(al.get(4));
		
		for (int i=1; i<=5; i++ ){
			al.add(i);
		}
		
		for (int i=0; i<al.size(); i++ ){
			System.out.println(al.get(i));
		}
		
//		HashMap hm = new HashMap();
//		hm.put(0, 1);
//		hm.put(0, 2);
//		hm.put(0, 3);
//		hm.put(0, 4);
//		System.out.println(hm.get(0));
		
		HashMap <String, String> hm = new HashMap<String, String>();
		// HashMap은 키와 밸류만 가질 수 있다. 
		hm.put("0", "1");
		ArrayList<HashMap> al =new ArrayList<HashMap>();
		al.add(hm);
		
		
	}

}
