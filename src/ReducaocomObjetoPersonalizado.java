import src.Pessoa;

import java.util.*;

public class ReducaocomObjetoPersonalizado {
    public static void main(String[] args){
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 30),
                new Pessoa("Bob", 25),
                new Pessoa("Charlie", 35)
        );
        OptionalDouble resultado = pessoas.stream().mapToInt(Pessoa::getIdade).average();
                if(resultado.isPresent()){
                    System.out.println(resultado.getAsDouble());
                }
    }
}
