package mk.ukim.finki.library.config;

import mk.ukim.finki.library.model.Author;
import mk.ukim.finki.library.model.Book;
import mk.ukim.finki.library.model.Country;
import mk.ukim.finki.library.model.enumerations.Category;
import mk.ukim.finki.library.service.AuthorService;
import mk.ukim.finki.library.service.BookService;
import mk.ukim.finki.library.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private final CountryService countryService;
    private final AuthorService authorService;
    private final BookService bookService;

    public DataInitializer(CountryService countryService, AuthorService authorService, BookService bookService) {
        this.countryService = countryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void initData() {
        /**
         * This code should initialize some countries.
         */
        Country country1= countryService.addCountry(new Country("Poland", "Europe")); // ID: 1
        Country country2= countryService.addCountry(new Country("United States", "America")); // ID: 2
        Country country3= countryService.addCountry(new Country("England", "Europe")); // ID: 3
        Country country4= countryService.addCountry(new Country("Italy", "Europe")); // ID: 4
        Country country5= countryService.addCountry(new Country("India", "Asia")); // ID: 5

        /**
         * This code should initialize some authors.
         */
        Author author1 = authorService.addAuthor(new Author("Andrzej", "Sapkowski", country1)); // ID: 1
        Author author2 = authorService.addAuthor(new Author("George R. R.", "Martin", country2)); // ID: 2
        Author author3 = authorService.addAuthor(new Author("J. R. R.", "Tolkien", country3)); // ID: 3
        Author author4 = authorService.addAuthor(new Author("Jane", "Austen", country3)); // ID: 4
        Author author5 = authorService.addAuthor(new Author("Dante", "Alighieri", country4)); // ID: 5
        Author author6 = authorService.addAuthor(new Author("Sarojini", "Naidu", country5)); // ID: 6

        /**
        * This code should initialize some books.
        */
        Book book1 = bookService.addBook(new Book("The Witcher", Category.FANTASY, author1, 20)); // ID: 1
        Book book2 = bookService.addBook(new Book("Sword of Destiny", Category.FANTASY, author1, 19)); // ID: 2
        Book book3 = bookService.addBook(new Book("The Last Wish", Category.FANTASY, author1, 18)); // ID: 3
        Book book4 = bookService.addBook(new Book("Blood of Elves", Category.FANTASY, author1, 17)); // ID: 4
        Book book5 = bookService.addBook(new Book("Time of Contempt", Category.FANTASY, author1, 16)); // ID: 5
        Book book6 = bookService.addBook(new Book("Baptism of Fire", Category.FANTASY, author1, 15)); // ID: 6
        Book book7 = bookService.addBook(new Book("The Tower of the Swallow", Category.FANTASY, author1, 14)); // ID: 7
        Book book8 = bookService.addBook(new Book("The Lady of the Lake", Category.FANTASY, author1, 13)); // ID: 8
        Book book9 = bookService.addBook(new Book("Season of Storms", Category.FANTASY, author1, 12)); // ID: 9
        Book book10 = bookService.addBook(new Book("A Game of Thrones", Category.FANTASY, author2, 20)); // ID: 10
        Book book11 = bookService.addBook(new Book("A Clash of Kings", Category.FANTASY, author2, 19)); // ID: 11
        Book book12 = bookService.addBook(new Book("A Storm of Swords", Category.FANTASY, author2, 18)); // ID: 12
        Book book13 = bookService.addBook(new Book("A Feast for Crows ", Category.FANTASY, author2, 17)); // ID: 13
        Book book14 = bookService.addBook(new Book("A Dance with Dragons", Category.FANTASY, author2, 16)); // ID: 14
        Book book15 = bookService.addBook(new Book("The Winds of Winter", Category.FANTASY, author2, 15)); // ID: 15
        Book book16 = bookService.addBook(new Book("A Dream of Spring", Category.FANTASY, author2, 14)); // ID: 16
        Book book17 = bookService.addBook(new Book("The Fellowship of the Ring", Category.FANTASY, author3, 20)); // ID: 17
        Book book18 = bookService.addBook(new Book("The Two Towers", Category.FANTASY, author3, 19)); // ID: 18
        Book book19 = bookService.addBook(new Book("The Return of the King", Category.FANTASY, author3, 18)); // ID: 19
        Book book20 = bookService.addBook(new Book("Sense and Sensibility", Category.DRAMA, author4, 10)); // ID: 20
        Book book21 = bookService.addBook(new Book("Pride and Prejudice", Category.THRILLER, author4, 9)); // ID: 21
        Book book22 = bookService.addBook(new Book("Divine Comedy", Category.CLASSICS, author5, 3)); // ID: 22
        Book book23 = bookService.addBook(new Book("The Golden Threshold", Category.CLASSICS, author6, 10)); // ID: 23
    }
}
