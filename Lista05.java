import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int numero = scanner.nextInt();
    numero = numero * 2;
    System.out.print("O dobro desse numero é: " + numero);
    }
}