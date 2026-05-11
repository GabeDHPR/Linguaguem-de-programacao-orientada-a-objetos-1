import java.util.Scanner;
public class MeotodoScan {
public static void saudacao() {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();
System.out.println("Olá, " + nome);
}
public static void main(String[] args) {
saudacao();
}
}