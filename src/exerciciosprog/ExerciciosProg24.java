/*
Escreva um algoritmo que mostre todos os números pares entre 13 e 23
usando do..while.
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg24 {
    
    public static void main(String[] args) {
        int i = 13;
        do{
            if((i % 2) == 0){
                JOptionPane.showMessageDialog(null, i);
            }
            i++;
        }while(i < 23);
    }
}
