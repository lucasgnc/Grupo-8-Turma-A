import java.util.Scanner;

class main {

  public static void main(String[] args) {
    String user = "John";
    String password = "123456";
    String login, senha;
    Scanner entrada = new Scanner(System.in);

    boolean tacerto = false;

    do {

      System.out.print("Digite o Login: ");
      login = entrada.next();
      System.out.print("Digite a Senha: ");
      senha = entrada.next();

      if (login.equalsIgnoreCase(user) && senha.equals(password))
        tacerto = true;

    } while (!tacerto);
    System.out.print("Login e Senha Corretos!");

  }
}