import java.util.Arrays;
import java.util.Collections; // collections é usado para operar em coleções
import java.util.List;
import java.util.stream.Collectors; // usado para coletar elementos processados por stream

public class Desafio9 {
  public static void main(String[] args) {
    // Desafio 9 - Verificar se todos os números da lista são distintos (não se
    // repetem)
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> findDuplicates = numeros.stream()
        // para cada n (numero) dentro da lista, verifica se sua frequencia é maior que um
        .filter(n -> Collections.frequency(numeros, n) > 1)
        // coloca eles na lista
        .collect(Collectors.toList());

    System.out.println("os numeros duplicados sao: " + findDuplicates);
  }
}