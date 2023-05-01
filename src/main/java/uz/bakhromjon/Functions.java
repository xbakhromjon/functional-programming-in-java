package uz.bakhromjon;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Functions {
    public static void main(String[] args) {
        MyFunction myFunction = Integer::sum;
        System.out.println(myFunction.add(1, 2));
        Function<Integer, String> function = String::valueOf;
        IntFunction<String> intFunction = String::valueOf;
        ToIntFunction<String> toIntFunction = Integer::parseInt;
        DoubleToIntFunction doubleToIntFunction = d -> (int) d;

    }
}