import javax.swing.JOptionPane;

public class Desafio2 {
    public static void main(String[] args) {
        double num = 0.0;
        num = Integer.parseInt(JOptionPane.showInputDialog("inforne um número decimal: : "));

        
        double arredondadoParaCima = Math.round(num);

        
        JOptionPane.showMessageDialog(null, "O número arredondado para cima é: " + arredondadoParaCima);
    }
}