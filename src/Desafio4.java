import java.util.Arrays;
import java.util.List;

public class Desafio4 {
  public static void main(String[] args) {
    // Desafio 4 - Remova todos os valores ímpares:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .toList();
    System.out.println("Numeros pares: " + numerosPares);

    /*
     * outra forma:
     * Map<Boolean, List<Integer>> xx = numeros.stream()
     *  .collect(Collectors.partitioninBy(n -> n % 2 == 0));
     *
     * List<Integer> numerosPares = numerosParticionados.get(true) / (false)
     */
  }

}
