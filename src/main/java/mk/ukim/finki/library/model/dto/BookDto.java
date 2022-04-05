package mk.ukim.finki.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.library.model.enumerations.Category;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private String name;
    private Category category;
    private Long authorId;
    private Integer availableCopies;
}
