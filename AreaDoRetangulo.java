import javax.swing.JOptionPane;
public class AreaDoRetangulo {
   public static void main (String [] args) {
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do ret�ngulo"));
      int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do ret�ngulo"));
      int areaTotal = base * altura;
      
      JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo inserido � de " + areaTotal + " m�.");
   }
}