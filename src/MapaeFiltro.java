import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class MapaeFiltro {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Maça", "Banana", "Formiga", "Gato");
        //mapear s string s colocando todas as letras para maiusculas e filtrar as palavras que começam com a letra "M";

        palavras.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("M")).forEach(System.out::println);
    }
}
