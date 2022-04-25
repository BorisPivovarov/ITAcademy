package Lesson21.Calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private int i;
    private int i1;

    public int summa() {
        return i + i1;
    }
}
