/*
Solicitar nome e idade de uma pessoa.
Se a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
mensagem: “ACEITA”.
Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.
*/
package exerciciosprog;
import javax.swing.JOptionPane;

public class ExerciciosProg15 {

    public static void main(String args[]) {
        String nome;
        int idade;
        nome = JOptionPane.showInputDialog(null, "Insira seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira sua idade: "));
        if ((idade >= 15) && (idade <= 25)){
            JOptionPane.showMessageDialog(null, nome + " ACEITA!");
        }else{
            JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA!");
        }
    }
}
