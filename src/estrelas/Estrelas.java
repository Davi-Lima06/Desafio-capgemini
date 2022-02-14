package estrelas;

import java.util.Scanner;

public class Estrelas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int estrela = Integer.parseInt(scan.nextLine());
		
		System.out.println(geradorDeEstrelas(estrela));
        
        scan.close();

	}
	
	public static String geradorDeEstrelas(int estrela) {

		String retorno = "";
		
		for(int y = 1; y <= estrela; y++){

            for(int espacoEmBranco = estrela; espacoEmBranco > y; espacoEmBranco--)

               retorno += " ";

            for(int x = 1; x <= y; x++)

               retorno += "*";

           retorno += "\n";

        }
		return retorno;
	
	}

}
