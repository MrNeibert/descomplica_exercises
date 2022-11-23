import javax.swing.*;

public class pratica03 
{
  public static void main(String entrada[]) {
    //variables
    int n1, n2, prod = 1;
    char op = 0;
    String msg = "", msgEntr = "Digite 1 para produto\nDigite 2 para produtoria\n";

    // input
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    // code
    switch (op) {
      case '1': {
        if (n1 > 0 && n2 > 0) {
          prod = n1 * n2;
          msg = msg + "Produto de " + n1 + " por " + n2 + " = " + prod + "\n\n";

        }
        break;
      }
      case '2': {
        for (int i = 1; i <= n2; i = i + 1) {
          prod = prod * n1;
        }
        msg = msg + "Produtoria de " + n1 + ", " + n2 + " vezes é: " + prod + "\n\n";
        break;
      }
      default:
        JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados");
    }
    
    // saida de dados
    if (op >= '1' && op <= '3') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
}