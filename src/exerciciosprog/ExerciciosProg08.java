/*
Escreva um programa em JAVA que solicite ao usuário um nome, armazene
em uma variável e depois mostre o nome digitado em uma mensagem.
*/
package exerciciosprog;

import javax.swing.JOptionPane;

public class ExerciciosProg08 {
    
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog(null, "Qual é o seu nome? ");
            JOptionPane.showMessageDialog(null, "Este é seu nome: " + nome);
    }
}
