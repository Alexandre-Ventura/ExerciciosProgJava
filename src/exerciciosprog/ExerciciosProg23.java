/*
Escreva um algoritmo usando while que solicite ao usuário um número inicial e
um número final. Calcule a soma de todos os números dentro da faixa de valor
informada INCLUINDO o número inicial e final
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg23 {

    public static void main(String args[]) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número inicial: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número inicial: "));
        int soma = 0;
        int i = num1;
        while(i<num2){
            soma = soma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null,"soma: " + soma);	
    }
}
