package Lesson24;


import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
    @CsvBindByName(column = "ISBN")
    private String isbn;
    @CsvBindByName(column = "Title")
    private String title;
    @CsvBindByName(column = "URL")
    private String url;
    @CsvBindByName(column = "Pages")
    private int pages;
    @CsvBindByName(column = "Author")
    private String author;
    @CsvBindByName(column = "Price")
    private BigDecimal price;
    
}
