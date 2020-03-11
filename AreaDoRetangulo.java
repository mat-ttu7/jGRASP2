import javax.swing.JOptionPane;
public class AreaDoRetangulo {
   public static void main (String [] args) {
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retângulo"));
      int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo"));
      int areaTotal = base * altura;
      
      JOptionPane.showMessageDialog(null, "A área do retângulo inserido é de " + areaTotal + " m².");
   }
}