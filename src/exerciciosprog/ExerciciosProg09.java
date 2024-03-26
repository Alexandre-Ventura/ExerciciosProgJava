/*
Escreva um programa em JAVA que solicite ao usuário 2 números inteiros
(um de cada vez), armazene os valores em variáveis e depois mostre a soma
dos dois em uma mensagem.
*/
package exerciciosprog;
import javax.swing.JOptionPane;

public class ExerciciosProg09 {
    
    public static void main(String[] args) {
        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com outro número inteiro: "));
        soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma dos dois números inseridos é: " + soma);
    }
    
}
