import javax.swing.*;
class pratica14
{
    public static void main(String entrada []) {
      //variables 
        int n1, n2, div;
        double pot;
        String msg="";
      //input
        n1 = 4;
        n2 = 6;
      //code
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
      //output
        msg = msg + "Quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "Potencia de " + n1 + " por " + n2 + " = " + pot;
        System.out.println(msg);

        System.exit(0);
 
    } 
}