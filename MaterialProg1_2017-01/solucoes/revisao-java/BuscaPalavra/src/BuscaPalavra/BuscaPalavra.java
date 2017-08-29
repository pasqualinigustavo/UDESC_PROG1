package BuscaPalavra;

import javax.swing.JOptionPane;

public class BuscaPalavra {

	public static void main(String[] args) {
		
		int letrasIguaisEmSequencia = 0;
		int e = 0;
		int i = 0;
		
		String texto = JOptionPane.showInputDialog("Digite um texto:" );
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		do{
			if(texto.charAt(e) == palavra.charAt(i)){
				e++;
				i++;
				letrasIguaisEmSequencia ++;
			}else{
				i = 0;
				letrasIguaisEmSequencia = 0;
				e++;
			}
		}while((letrasIguaisEmSequencia < palavra.length())&&(e < texto.length()));
		
		if(letrasIguaisEmSequencia == palavra.length()){
			JOptionPane.showMessageDialog(null, "A palavra está contida no texto!");
		}else{
			JOptionPane.showMessageDialog(null, "A palavra NÃO está contida no texto!");
		}
	}
}
