package uz.bakhromjon;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctions {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);
        BiFunction<String, Integer, Integer> biFunction = (name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000;
        salaries.replaceAll(biFunction);
    }
}
