package syumi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.println(x);
			x += 2;
		}while(	x <= 12	);
		
		while(x < 16) {
			System.out.println(x);
			x++;
		}
		
		Map<String , String> l = new HashMap<>();
		l.put("Isami", "Braveburn");
		l.put("Ruru", "Sperubia");
		
		for(String s:l.keySet()) {
			System.out.println(l.get(s));
		}
		for(Entry<String, String> e:l.entrySet()) {
			System.out.println(e.getKey() + " rides " + e.getValue());
		}
		
		Person i = new Person("イサミ");
		i.setMecha("ブレイバーン");
		i.ride();
		String t = i.getName();
		System.out.println(t);
		i.talk();
		
		if(t.equals("イサミ")) {
			System.out.println(t + "ィ！！！");
		}else {
			System.out.println(t);
		}
		
		Person r = new Person("ルル");
		r.setMecha("スペルビア");
		r.walk();
		
		String q = r.getName();
		if(q.equals("イサミ")) {
			System.out.println(q + "ィ！！！");
		}else {
			System.out.println(q);
		}
		
	}
	

}
