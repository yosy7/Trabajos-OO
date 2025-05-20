import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
       String x1 = JOptionPane.showInputDialog("Dame el primer numero");
       String x2 = JOptionPane.showInputDialog("Dame segundo numero");
       String x3 = JOptionPane.showInputDialog("Dame el tercer numero");
    
       System.out.println((Integer.parseInt(x1) + Integer.parseInt(x2) + Integer.parseInt(x3)) / 3);
    }
}
