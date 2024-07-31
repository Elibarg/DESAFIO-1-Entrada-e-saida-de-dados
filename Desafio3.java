import javax.swing.JOptionPane;

public class Desafio3 {
    private static double temp;
    private static String tipoTemp;

    public static void main(String[] args) {
        double tempF = solicitarTemp();
        tempFinal(tempF);
    }

    public static double solicitarTemp() {
        temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura: "));
        return temp;
    }

    public static void tempFinal(double tempF) {
        String conversao = "";
        do {
            tipoTemp = JOptionPane.showInputDialog(null, "Qual é o tipo da temperatura informada: Celsius, Fahrenheit ou Kelvin: ");
            switch (tipoTemp) {
                case "Celsius":
                    do {
                        conversao = JOptionPane.showInputDialog(null, "Fahrenheit ou Kelvin: ");
                        switch (conversao) {
                            case "Fahrenheit":
                                temp = celsiusParaFahrenheit(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + temp);
                                break;
                            case "Kelvin":
                                temp = celsiusParaKelvin(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Kelvin: " + temp);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (!conversao.equals("Fahrenheit") && !conversao.equals("Kelvin"));
                    break;
                case "Fahrenheit":
                    do {
                        conversao = JOptionPane.showInputDialog(null, "Celsius ou Kelvin: ");
                        switch (conversao) {
                            case "Celsius":
                                temp = fahrenheitParaCelsius(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + temp);
                                break;
                            case "Kelvin":
                                temp = fahrenheitParaKelvin(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Kelvin: " + temp);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (!conversao.equals("Celsius") && !conversao.equals("Kelvin"));
                    break;
                case "Kelvin":
                    do {
                        conversao = JOptionPane.showInputDialog(null, "Celsius ou Fahrenheit: ");
                        switch (conversao) {
                            case "Celsius":
                                temp = kelvinParaCelsius(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + temp);
                                break;
                            case "Fahrenheit":
                                temp = kelvinParaFahrenheit(temp);
                                JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + temp);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (!conversao.equals("Celsius") && !conversao.equals("Fahrenheit"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de temperatura inválido. Tente novamente.");
                    break;
            }
        } while (!tipoTemp.equals("Celsius") && !tipoTemp.equals("Fahrenheit") && !tipoTemp.equals("Kelvin"));
    }

    public static double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return Math.round(celsius * 100.0) / 100.0;
    }

    public static double celsiusParaKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return Math.round(kelvin * 100.0) / 100.0;
    }

    public static double kelvinParaCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return Math.round(celsius * 100.0) / 100.0;
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        return Math.round(kelvin * 100.0) / 100.0;
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }
}
