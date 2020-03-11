import javax.swing.JOptionPane;
public class DiasVividos {
   public static void main (String [] args) {
      int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem"));
      
      int diasDeVida = (anos * 365);
      
      JOptionPane.showMessageDialog(null, "Você tem, aproximadamente, " + diasDeVida + " dias de vida.");
   }
}