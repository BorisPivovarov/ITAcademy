package lesson24.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class BookDto {
    private String isbn;
    private String title;
    private String url;
    private Integer pages;
    private BigDecimal price;

}
