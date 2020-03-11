import javax.swing.JOptionPane;
public class SomaDoComprimento {
   public static void main (String [] args) {
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
      int comprimento1 = palavra1.length();
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");
      int comprimento2 = palavra2.length();
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra");
      int comprimento3 = palavra3.length();
      
      int comprimentoTotal = comprimento1 + comprimento2 + comprimento3;
      
      JOptionPane.showMessageDialog(null, "O comprimento total das palavras é " + comprimentoTotal + ".");
   }
}