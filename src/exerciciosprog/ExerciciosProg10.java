/*

Escreva um programa em JAVA que solicite ao usuário o seu
peso(aqui entenda massa) em Kg (int) e a sua altura em metros
(Double). Com estes dados calcule o IMC – Índice de Massa Corporal.
Seguindo a seguinte fórmula.
IMC = massa / (altura * altura )
Mostre o resultado em uma mensagem.

*/

package exerciciosprog;
import static java.lang.Math.round;
import javax.swing.JOptionPane;

public class ExerciciosProg10 {
    
    public static void main(String[] args) {
        int peso;
        double altura, IMC;
            peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu peso em Kg?"));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a sua altura?"));
            IMC = peso / (altura * altura);
                JOptionPane.showMessageDialog(null, "Seu indice de massa corporal é: " + round(IMC));
    }
    
}
