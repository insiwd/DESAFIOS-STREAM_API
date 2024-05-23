import java.util.Arrays;
import java.util.List;

public class Desafio5 {
  public static void main(String[] args) {

    // Desafio 5 - calcule a média dos números maiores que 5
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    double media = numeros.stream()
        .filter(n -> n > 5)
        .mapToDouble(Integer::doubleValue)
        .average().orElse(0.0);
    System.out.println(media);
  }

  /*
   * outra forma:
   * import java.util.Arrays;
   * import java.util.List;
   * import java.util.stream.Collectors;
   *
   * public class Desafio5 {
   * public static void main(String[] args) {
   *
   * List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4,
   * 3);
   *
   * List<Integer> maioresQueCinco = numeros.stream()
   * .filter(n -> n > 5)
   * .collect(Collectors.toList());
   *
   * double media = maioresQueCinco.stream()
   * .mapToInt(Integer::intValue)
   * .average()
   * .orElse(0.0);
   *
   * System.out.println(media);
   * }
   * }
   */
}
