import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int numero = scanner.nextInt();
    if (numero % 2 == 0) {
        System.out.println("Par");
        } else {
        System.out.println("Ímpar");
        }
        int soma = 0;
        int pares = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            soma = soma + i;
            if (i % 2 ==0){
                pares++; 
            }
            
            }
            System.out.println("Numero de pares: " + pares);
            

    }
}
