import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducao {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        // calcular  soma de todos os elementos
        int x = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.print("Resultado: " + x);
    }
}
