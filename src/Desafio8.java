import java.util.Arrays;
import java.util.List;

public class Desafio8 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer resultado = numeros.stream()
        // reduce reduz elementos da stream utilizando um valor inicial
        // nesse caso, é como iniciar uma variável temporária
        // reduce soma todos os números
        .reduce(0, Integer::sum);

    System.out.println("a soma dos numeros é: " + resultado);
  }

  /*
   * outra forma
   * int resultado = numeros.stream()
   * .mapToInt(Integer::intValue)
   * .sum();
   *
   * System.out.println("A soma dos números é: " + resultado);
   */

}
