import javax.swing.JOptionPane;

public class Desafio4 
{
    public static void main(String[] args)     
    {
        String texto ="";

        texto = JOptionPane.showInputDialog(null, "Insira um texto: ");

        int contagem = texto.length();
        
        JOptionPane.showMessageDialog(null, "Número de caracteres: "+contagem);
    }
}