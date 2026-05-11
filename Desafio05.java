import java.util.Scanner;
public class Desafio05 {
    
        public static void parouimpar(int a){
            if (a % 2 == 0) {
                System.out.println("Par");
                } else {
                System.out.println("Ímpar");
                }
        }
        public static void tabuada(int a) {
            System.out.println("A tabuada de " + a );
            int i;
            for (i = 1; i <= 10; i++){
            int tabu = a * i;
            System.out.println(tabu);
            }
            }
            public static void pares(int a){
                int i;
            for (i = 1; i < a; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                    }
            }
            }
            public static void somas(int a){
                int soma = 0;
                int i;
                for (i = 0; i <= a; i++){
                    soma = soma + i;
                }
                System.out.println("A soma dos numeros eh: " + soma);
            }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int n = scanner.nextInt();
            parouimpar(n);
            tabuada(n);
            pares(n);
            somas(n);
        }
}
