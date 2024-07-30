import javax.swing.JOptionPane;

public class Desafio3 {
    public static void main(String[] args) {
        double temp = 0.0;
        String tipoTemp = "";
        temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a temperatura"));
        JOptionPane.showInputDialog(null, "Informe o tipo da temperatura");
        tipoTemp = JOptionPane.showInputDialog(null,"Celsius, Fahrenheit e Kelvin");
        switch(tipoTemp)
        {

        }
    }
}