import java.util.Arrays;
import java.util.List;

public class Desafio6 {
  public static void main(String[] args) {
    // Desafio 6 - Verificar se a lista contém algum número maior que 10:
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 4, 3);

    List<Integer> numerosMaioresQue10 = numeros.stream()
        .filter(n -> n > 10)
        .toList();

    numerosMaioresQue10.forEach(n -> {
      if(numerosMaioresQue10.isEmpty()) {
        System.out.println("Não existem números maiores que 10.");
      }
      else {
        System.out.println("Numeros maiores que 10: " + numerosMaioresQue10);
      }
    });
  }
}
