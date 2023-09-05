package lista10.a;

import java.util.HashSet;

public class Exe7 {
    public static void main(String[] args) {
        // Cria uma HashSet para números pares de 1 a 20
        HashSet<Integer> numerosPares1 = new HashSet<>();
        for (int i = 2; i <= 20; i += 2) {
            numerosPares1.add(i);
        }
        
        imprimirHashSet(numerosPares1);

        // Cria uma HashSet para números pares de 10 a 30
        HashSet<Integer> numerosPares2 = new HashSet<>();
        for (int i = 10; i <= 30; i += 2) {
            numerosPares2.add(i);
        }
        
        imprimirHashSet(numerosPares2);

        // Cria uma terceira HashSet e adiciona todos os valores das outras duas
        HashSet<Integer> numerosUniao = new HashSet<>();
        numerosUniao.addAll(numerosPares1);
        numerosUniao.addAll(numerosPares2);
        numerosUniao.add(30);
        numerosUniao.add(30);
        numerosUniao.add(30);
        numerosUniao.add(30);
        

        // Chama o método para imprimir os elementos de uma HashSet
        imprimirHashSet(numerosUniao);
    }

    public static void imprimirHashSet(HashSet<Integer> numeros) {
        System.out.println("Elementos da HashSet:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
