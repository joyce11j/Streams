import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filtro {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

    }
}
