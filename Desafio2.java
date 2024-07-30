import javax.swing.JOptionPane;

public class Desafio2 {
    public static void main(String[] args) {
        // Solicita ao usuário para inserir um número decimal
        String input = JOptionPane.showInputDialog(null, "Informe um número decimal:");
        
        // Converte a entrada de String para double
        double num = Double.parseDouble(input);

        // Arredonda o número para cima
        double arredondadoParaCima = Math.round(num);

        // Exibe o resultado arredondado
        JOptionPane.showMessageDialog(null, "O número arredondado para cima é: " + arredondadoParaCima);
    }
}