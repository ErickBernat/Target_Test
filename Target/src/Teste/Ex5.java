package Teste;

public class Ex5 {
	public static void main(String[] args) {
		String normal = "target";
		String invertida = "";

		for (int i = normal.length() - 1; i >= 0; i--) {
			invertida += normal.charAt(i);
		}
		System.out.println(normal);
		System.out.println(invertida);

	}
}
