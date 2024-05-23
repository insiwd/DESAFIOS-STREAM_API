import java.util.Arrays;
import java.util.List;

public class Desafio7 {
  public static void main(String[] args) {

    // Desafio 7 - Encontrar o segundo número maior da lista

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer segundoMaior = numeros.stream()
        // distinct remove duplicados
        .distinct()
        // sorted ordena elementos.
        // `a,b -> b.compareTo(a)` compara os valores do maior pro menor
        .sorted((a, b) -> b.compareTo(a))
        // ignora o primeiro elemento
        .skip(1)
        // acha o primeiro valor - que nesse caso é o segundo, já que usamos o skip
        .findFirst().orElse(null);

    System.out.println(segundoMaior);

  }
}
