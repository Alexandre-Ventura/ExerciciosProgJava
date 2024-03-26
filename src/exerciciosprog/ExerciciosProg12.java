/*

Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
o número maior e mostrar na tela, ou se forem iguais, mostrar uma
mensagem indicando esta informação.

*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg12 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com outro número inteiro: "));
        if (num1 > num2){
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        }else if (num2 > num1){
            JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
        }else{
            JOptionPane.showMessageDialog(null, num1 + " é igual a " + num2);
        }
    }
    
}
