/*
Implemente uma calculadora,
primeiro peça 2 números ao usuário (um de cada vez)
e apresente as seguintes opções:
adição, subtração, multiplicação e divisão.
Mostre o resultado após a operação. 
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg16 {

    public static void main(String args[]) {
        int num1, num2, resultado, controle;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira outro número: "));
        controle = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                      Qual opera\u00e7\u00e3o voc\u00ea quer executar? 
                                                                       1 - adi\u00e7\u00e3o 
                                                                       2 - subtra\u00e7\u00e3o 
                                                                       3 - multiplica\u00e7\u00e3o 
                                                                       4 - divis\u00e3o"""));
        switch(controle){
            case 1:
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 2:
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 3:
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 4:
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            break;
        }
    }
}
