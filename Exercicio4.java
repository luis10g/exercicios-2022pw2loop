public class Exercicio4 {
    public static void main(String[] args) {
        int vetor[] = {16, 23, 55, 11, 85, 36, 77, 59, 66, 29};
        
        
        for(int i = 0;i < vetor.length;i++) {
            boolean ePrimo = true;
            for(int valor = 2;valor < vetor[i];valor++) {
                if(vetor[i] % valor == 0) {
                    ePrimo = false;
                    break;
                }
              }
              if(ePrimo) {
                    System.out.println(vetor[i]);
            }
        }
    }
}