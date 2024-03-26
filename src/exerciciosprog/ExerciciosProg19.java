/*
Solicite ao usuário que escreva uma frase e o número de vezes que a mesma
deve ser mostrada. Implemente o algoritmo usando for
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg19 {

    public static void main(String args[]) {
        String frase;
        int contadorFrase;
        frase = JOptionPane.showInputDialog(null, "Escreva uma frase: ");
        contadorFrase = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes a frase deve ser mostrada? "));
        
        for (int i = 0; i < contadorFrase; i++){
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}
