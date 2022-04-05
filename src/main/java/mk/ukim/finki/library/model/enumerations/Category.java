package mk.ukim.finki.library.model.enumerations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Category {
    NOVEL,
    THRILLER,
    HISTORY,
    FANTASY,
    BIOGRAPHY,
    CLASSICS,
    DRAMA;

    public static List<Category> listAllCategories(){
        return Stream.of(Category.values()).collect(Collectors.toList());
    }
}
