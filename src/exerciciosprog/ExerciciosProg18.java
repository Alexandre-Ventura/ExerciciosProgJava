//Uma loja dará um desconto em seus produtos de acordo com a
//categoria de cada produto.
//As categorias e os descontos são mostrados abaixo:
//
//A:10%  B:15%  C:20%  D:25%  E:50%
//
//Faça um algoritmo para ler o nome do cliente, o preço e a categoria do produto que o
//cliente está comprando. Após a leitura mostrar na tela o preço final que o cliente deverá
//pagar após ter sido dado o desconto no preço da mercadoria.

package exerciciosprog;

import static java.lang.Math.round;
import javax.swing.JOptionPane;

public class ExerciciosProg18 {

    public static void main(String args[]) {
        
        String nome, categoriaProduto;
        double preco, precoFinal;
        
        nome = JOptionPane.showInputDialog(null, "Qual seu nome? ");
        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preço do seu produto? "));
        categoriaProduto = JOptionPane.showInputDialog(null, """
                                                            E qual a categoria do seu produto: 
                                                            Categoria A.    
                                                            Categoria B.
                                                            Categoria C.
                                                            Cateogira D.
                                                            Categoria E. """);
        if (null == categoriaProduto){
            JOptionPane.showMessageDialog(null, nome + " a categoria do seu produto está errada, por favor confira!");
        }else switch (categoriaProduto) {
            case "A":
                precoFinal = preco - (round(preco * 0.10));
                JOptionPane.showMessageDialog(null, nome + " o preço final do seu produto com o desconto aplicado é R$ " + precoFinal);
                break;
            case "B":
                precoFinal = preco - (round(preco * 0.15));
                JOptionPane.showMessageDialog(null, nome + " o preço final do seu produto com o desconto aplicado é R$ " + precoFinal);
                break;
            case "C":
                precoFinal = preco - (round(preco * 0.20));
                JOptionPane.showMessageDialog(null, nome + " o preço final do seu produto com o desconto aplicado é R$ " + precoFinal);
                break;
            case "D":
                precoFinal = preco - (round(preco * 0.25));
                JOptionPane.showMessageDialog(null, nome + " o preço final do seu produto com o desconto aplicado é R$ " + precoFinal);
                break;
            case "E":
                precoFinal = preco - (round(preco * 0.50));
                JOptionPane.showMessageDialog(null, nome + " o preço final do seu produto com o desconto aplicado é R$ " + precoFinal);
                break;
            default:
                JOptionPane.showMessageDialog(null, nome + " a categoria do seu produto está errada, por favor confira!");
                break;
        }
    }
}
