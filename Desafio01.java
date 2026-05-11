public class Desafio01 {
    public static int soma(int a, int b) {
        return a + b;
        }
        public static int multi(int a, int b) {
            return a * b;
            }
            public static void tabuada(int a) {
                int i;
                for (i = 1; i <= 10; i++){
                int tabu = a * i;
                System.out.println(tabu);
                }
                }
                public static void main(String[] args) {
                    int resultadosoma = soma(10, 5);
                    System.out.println(resultadosoma);
                
                int resultadomulti = multi(10, 5);
                System.out.println(resultadomulti);
                tabuada(3);
                }
}
