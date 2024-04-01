//Implemente e execute o código de pesquisa linear dado em aula, incluindo
//códigos para INTERROMPER a varredura completa do vetor, quando o
//elemento procurado é encontrado

package exerciciosprog;
import javax.swing.*;

public class ExerciciosProg25 {
    public static void main(String args[ ]) {
        int i, flag;
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome de pessoas a ser cadastrado: "));
        String vetorPesquisado[] = new String [numElementos];
        for (i = 0; i < numElementos; i++) {
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
        }
        String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado: ");
        flag = 0;
        for (i = 0; i < numElementos; i++){
            if (vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)){
                JOptionPane.showMessageDialog(null, "o valor procurado foi encontrado na posição " + i);
                flag = 1;
                
                // para interromper varredura
                i = numElementos;
                JOptionPane.showMessageDialog(null, "Interrompendo a varredura...");
            }
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "o nome não foi encontrado.");
        }
    }
}