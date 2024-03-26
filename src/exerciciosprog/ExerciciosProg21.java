/*
Escreva um algoritmo que mostre todos os números pares entre 33 e 57
usando for
*/
package exerciciosprog;
import javax.swing.JOptionPane;

public class ExerciciosProg21 {

    public static void main(String args[]) {
        int i;
        for(i = 33; i < 57; i++){
            if(( i % 2) == 0){
                JOptionPane.showMessageDialog(null, i);
            }
        }
    }
}
