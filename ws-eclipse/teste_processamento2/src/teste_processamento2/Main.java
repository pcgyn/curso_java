package teste_processamento2;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
				
				int x;
				String s1, s2, s3;
				
				x = sca.nextInt();
					 sca.nextLine();
				s1 = sca.nextLine();
				s2 = sca.nextLine();
				s3 = sca.nextLine();
				
				System.out.println("Dados digitados: ");
				System.out.println(x);
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);

				
				sca.close();
				
	}

}
