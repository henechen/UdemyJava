package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia X";
		s.toUpperCase();
		
		System.out.println(s);
		
		s = s.toUpperCase();
		
		System.out.println(s);
		
		s.replace("X", "porra");
		
		s = s.replace("X", "porra");
		
		System.out.println(s);
		
		s.concat("!!!");
		
		s = s.concat("!!!");
		
		System.out.println(s);
	}
}
