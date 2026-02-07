import javax.swing.JOptionPane;

public class gradosFaC {
    public static void main(String[] args) {
        String Fahrenheit = JOptionPane.showInputDialog("Ingrese los grados Fahrenheit");

        JOptionPane.showMessageDialog(null, "La conversión de " + (Float.parseFloat(Fahrenheit)) + "F a celsius es: " + (((Float.parseFloat(Fahrenheit)) - 32)/1.8) + "C");
    }
}