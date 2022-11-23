import java.util.Scanner;

public class calculator {

  public static String umNumero(int escolha, int n1) {
    String resultado = "";
    int result = 1;

    if (escolha == 6) {

      while (n1 != 0) {
        result *= n1;
        n1--;
      }
      resultado = String.format("O resultado é %d", result);
      return resultado;
    } else {
      if (n1 % 2 != 0) {
        resultado = "O número é impar!";
        return resultado;
      } else {
        resultado = "O número é par!";
        return resultado;
      }
    }
  }

  public static String doisNumeros(int escolha, int n1, int n2) {
    String resultado = "";
    int result;

    if (escolha == 1) { // Soma
      result = n1 + n2;
      resultado = String.format("O resultado é %d", result);

    } else if (escolha == 2) { // Subtração
      result = n1 - n2;
      resultado = String.format("O resultado é %d", result);

    } else if (escolha == 3) { // Produto
      result = n1 * n2;
      resultado = String.format("O resultado é %d", result);

    } else if (escolha == 4) { // Divisão: x/n2
      double x = n1; // convertendo n1 para double para divisão ser precisa
      resultado = String.format("O resultado é %f", x / n2);

    } else if (escolha == 5) { // Potencia
      result = (int) Math.pow(n1, n2);
      resultado = String.format("O resultado é %d", result);
    }
    return resultado;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // variáveis
    Integer escolha = null;
    String msg = "";
    int n1;
    int n2;
    String loop = "y"; // loop do programa

    while (loop.startsWith("y")) {
      do {
        System.out.println(
            "Qual operação você gostaria de executar? \n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potencialização\n6-Fatorial\n7-Impar/Par");
        escolha = Integer.parseInt(sc.nextLine());
      } while (escolha < 1 || escolha > 7);

      if (escolha == 6 || escolha == 7) {
        System.out.println("Qual número você gostaria?");
        n1 = Integer.parseInt(sc.nextLine());
        msg = umNumero(escolha, n1);

      } else {
        System.out.println("Qual o primeiro número?");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Qual o segundo número?");
        n2 = Integer.parseInt(sc.nextLine());
        msg = doisNumeros(escolha, n1, n2);
      }

      System.out.println(msg);
      System.out.println("Gostaria de fazer outra operação? y/n");
      loop = sc.nextLine();
    }
    System.out.println("Até breve! :)");
    sc.close();
  }
}




    /* 

    public static void operacao (int x) {
    String[] list = {"null","Soma","Subtração","Multiplicação","Divisão","Potencialização","Fatorial","Impar/Par"};
    if (x == 1){  
      
      
      
      
    */

