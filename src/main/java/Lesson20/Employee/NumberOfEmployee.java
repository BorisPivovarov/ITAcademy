package Lesson20.Employee;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberOfEmployee {

    public static String generateNumberOfEmployee(){
        String secretNumber = IntStream.range(0, 5)
                .boxed().map(value -> new Random().nextInt(8 ) + "").collect(Collectors.joining());
        return "00" + secretNumber;
    }
}
