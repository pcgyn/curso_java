import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
		Locale.setDefault(Locale.US);
		System.out.println("Olá mundo!");
		// System.out.print("Olá mundo!\n");
		// System.out.println(x+y);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);

	}

}
