/*
Faça um programa em JAVA que solicite 1 número inteiro, verificar
se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
negativa:
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg11 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um número inteiro: "));
        if((num % 2) == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é múltiplo de 2!");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + num + " não é múltiplo de 2!");

        }
    }
}
