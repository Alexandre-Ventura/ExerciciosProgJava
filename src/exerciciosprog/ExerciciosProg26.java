//Faça um algoritmo que leia uma matriz
//de ordem 3x3 de números inteiros. Após a leitura faça:
// a - Calcule e mostre a soma dos elementos da primeira coluna;
// b - Calcule e mostre a soma dos elementos de cada coluna;
// c - Calcule e mostre o produto dos elementos da primeira linha;
// d - Calcule e mostre a soma de todos os elementos da matriz;
// e - Calcule e mostre a média dos elementos da matriz;
// f - Calcule e mostre os elementos que são maiores que a média;
// g - Calcule e mostre o maior elemento da matriz e sua posição;
// h - Calcule e mostre o menor elemento da matriz e sua posição;

package exerciciosprog;

import static java.lang.Math.round;
import javax.swing.JOptionPane;

public class ExerciciosProg26 {

    public static void main(String[] args) {
        int Matrix[ ][ ] = new int[3][3];
        int i, j;
        // leitura dos valores
        for(i=0; i<3; i++) {
            for (j=0; j<3; j++){
                Matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha "+i+" e coluna "+j+": "));
            }
        }
        
        //a - Calculando a soma dos elementos da primeira coluna;
        int somaA = 0;
        for (i = 0; i<3; i++){
           somaA = somaA + Matrix[i][0];
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: "+ somaA);
       
        //b - Calculando a soma de cada coluna
        int vetor_b[] = new int[3];
        for(i = 0; i<3; i++){
            for(j = 0; j<3; j++){
                vetor_b[i] = vetor_b[i] + Matrix[j][i];
            }
        }
        JOptionPane.showMessageDialog(null, "b) \n Coluna 0: " +vetor_b[0]+" \n Coluna 1: "+vetor_b[1]+ " \n Coluna 2: " + vetor_b[2]);
        
        // c - Calcule e mostre o produto dos elementos da primeira linha;
        int multiplicacaoC = 1;
        for (i = 0; i<3; i++){
            multiplicacaoC = multiplicacaoC * Matrix[0][i];
        }
        JOptionPane.showMessageDialog(null, "A multiplicação dos elementos da primeira linha é: " + multiplicacaoC);
        
        //d - Calcule e mostre a soma de todos os elementos da matriz;
        int somaD = 0;
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                somaD = somaD + Matrix[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "O valor da soma de todos os elementos da matriz é: " + somaD);   

        // e - Calcule e mostre a média dos elementos da matriz;
        double media = 0.0;
        media = round(somaD / 9);
        JOptionPane.showMessageDialog(null, "A média de todos os elementos da matriz é: " + media);
        
        // f - Calcule e mostre os elementos que são maiores que a média;
        String maior_media_f = "";
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                if (Matrix[i][j] > media){
                    maior_media_f = maior_media_f + ":" + Matrix[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "f)Calcule e mostre os elementos que são maiores que a média: \n" +maior_media_f);
        
        //g - Calcule e mostre o maior elemento da matriz e sua posição;
        int maior_q = 0;
        int lin_maior = 0;
        int col_maior = 0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if(Matrix[i][j] > maior_q){
                    maior_q = Matrix[i][j];
                    lin_maior = i;
                    col_maior = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "g)Calcule e mostre o maior elemento da matriz e sua posição: \n Maior: "
                                    + maior_q +
                                    "\n Linha: " +
                                    lin_maior +
                                    "\n Coluna: " +
                                    col_maior
                                    );
        
        // h - Calcule e mostre o menor elemento da matriz e sua posição;
        int menor_q = 99999;
        int lin_menor = 0;
        int col_menor = 0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if(Matrix[i][j] < menor_q){
                    menor_q = Matrix[i][j];
                    lin_menor = i;
                    col_menor = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "g)Calcule e mostre o menor elemento da matriz e sua posição: \n Menor: "
                                    + menor_q +
                                    "\n Linha: " +
                                    lin_menor +
                                    "\n Coluna: " +
                                    col_menor
                                    );
                
    }
}
