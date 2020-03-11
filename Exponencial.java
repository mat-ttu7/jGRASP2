import javax.swing.JOptionPane;
import java.lang.Math;
public class Exponencial {
   public static void main (String [] args) {
      double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
      double expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente"));
      
      double resultado = Math.pow(base, expoente);
      
      JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é " + resultado + ".");
   }
}