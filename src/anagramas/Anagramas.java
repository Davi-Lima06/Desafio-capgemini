package anagramas;

import java.util.Scanner;

public class Anagramas {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
	
		System.out.println("Digite o anagrama");
		String anagrama = sc.nextLine();
		imprimeAnagramas("", palavra, anagrama);	
		
		System.out.println("=== Fim ===");
		
		sc.close();
	}

	public static void imprimeAnagramas(String prefix, String word, String anagrama) {
		if (word.length() <= 1) {
			String valor = prefix + word;
			//System.out.println(valor);
			if(anagrama.equalsIgnoreCase(valor)) {
				System.out.println(valor + " é um anagrama");
			}
		} else {
			for (int i = 0; i < word.length(); i++) {
				String cur = word.substring(i, i + 1);
				String before = word.substring(0, i); 
				String after = word.substring(i + 1);
				imprimeAnagramas(prefix + cur, before + after, anagrama);
			}
		}
		
	}

}
