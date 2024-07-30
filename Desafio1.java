import javax.swing.JOptionPane;

public class Desafio1 {
    public static void main(String[] args)
    {
        int num1 = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número"));
        if(num1 % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "e par");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "e impar");
        }

    }

}
