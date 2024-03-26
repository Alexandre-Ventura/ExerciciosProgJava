/*
Escreva um algoritmo para calcular e mostrar a média dos números entre 1 e 1000
usando while
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg22 {

    public static void main(String args[]) {
       int soma = 0, media = 0, i = 1;
       while(i <= 1000){
           soma = soma + i;
           //JOptionPane.showMessageDialog(null, "soma: " + soma);
           i++; 
       }
       media = soma / 1000;
       JOptionPane.showMessageDialog(null, "o valor da soma: " + soma + 
                                        "\n o valor da media: " + media);
    }
}
