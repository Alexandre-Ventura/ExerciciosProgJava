/*
Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
se o ano de nascimento é válido, ou seja, se o ano de nascimento é
menor que o ano atual, então mostre a idade desta pessoa.
*/
package exerciciosprog;
import javax.swing.JOptionPane;

public class ExerciciosProg14 {

    public static void main(String args[]) {
       int anoNascimento, anoAtual, idade;
       anoAtual = 2024;
       anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Em que ano você nasceu? "));
       idade = anoAtual - anoNascimento;
       if(anoAtual < anoNascimento){
           JOptionPane.showMessageDialog(null, "Ano Inválido!");
       } else{
           JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
       }
    }
    
}
