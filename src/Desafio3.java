import java.util.Arrays;
import java.util.List;

public class Desafio3 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, -1, -3, 2, 3, 4, -3, 5, -5, 6, 7, 8, 9, 10, -10, 5, 4, 3);

    List<Integer> numerosPositivos = numeros.stream()
    .filter(n -> n > 0)
    .toList();

    numerosPositivos.forEach(System.out::println);
  }
}
