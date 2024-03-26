/*
A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
valor da prestação e informar se o empréstimo pode ou não ser concedido.
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg13 {
    public static void main(String[] args) {
        double salario, prestacao, validaEmp;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o valor do sálario bruto? "));
        prestacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o valor da prestação? "));
        validaEmp = (salario * 30) / 100;
        if (validaEmp >= prestacao){
            JOptionPane.showMessageDialog(null, "O empréstimo pode ser efetuado!");
        }else{
            JOptionPane.showMessageDialog(null, "O empréstimo não pode ser efetuado!");
        }
    }
}
