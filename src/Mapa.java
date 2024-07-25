import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mapa {

    public static void main(String[] args) {

        // Converta uma lista de inteiros para seus quadrados usando map
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream().map(v -> v * v).forEach(System.out::println);
    }
}
