import javax.swing.*;

public class Pratica14
{
    public static void main(String entrada []) {
      //variables 
        int n1, n2, div;
        double pot;
        String msg="";
      //input
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
      //code
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
      //output
        msg = msg + "Quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "Potencia de " + n1 + " por " + n2 + " = " + pot;
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
 
    } 
}