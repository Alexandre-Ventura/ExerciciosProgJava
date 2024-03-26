//Escreva um algoritmo para mostrar os valores de 1 até 10 usando for

package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg20 {

    public static void main(String args[]) {
        int i;
        for(i = 1; i < 11;){
            JOptionPane.showMessageDialog(null, i);
            i += 1;
        }
    }
}
