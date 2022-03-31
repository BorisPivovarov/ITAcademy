package hw33.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto {
    private String name;
    private BigDecimal value;
}
