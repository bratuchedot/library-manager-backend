package mk.ukim.finki.library.service;

import mk.ukim.finki.library.model.Book;
import mk.ukim.finki.library.model.dto.BookDto;
import mk.ukim.finki.library.model.enumerations.Category;
import mk.ukim.finki.library.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.library.model.exceptions.BookNotFoundException;

import java.util.List;
import java.util.Optional;

public interface BookService {

    /**
     * This method is used to add initial books on the start of the app
     */
    Book addBook(Book book);

    /**
     * @return List of all books in the database
     */
    List<Book> findAll();

    /**
     * @param id The id of the book that we want to obtain
     * @return The book with the given id
     */
    Optional<Book> findById(Long id);

    /**
     * This method is used to add a new book, and save it in the database.
     *
     * @param bookDto Data transfer object
     * @return The book that is created. The id should be generated when the entity is created.
     * @throws AuthorNotFoundException when there is no author with the given id
     */
    Optional<Book> save(BookDto bookDto);

    /**
     * This method is used to modify a book, and save it in the database.
     *
     * @param id The id of the book that is being edited
     * @param bookDto Data transfer object
     * @return The book that is updated.
     * @throws BookNotFoundException when there is no book with the given id
     * @throws AuthorNotFoundException when there is no author with the given id
     */
    Optional<Book> edit(Long id, BookDto bookDto);

    /**
     * Method that should delete an book.
     *
     * @param id The id of the book that should be deleted
     */
    void deleteById(Long id);

    /**
     * Method for taking a book. If the id is invalid, it should throw BookNotFoundException.
     *
     * @param id
     * @return The book that is taken.
     * @throws BookNotFoundException when there is no book with the given id
     */
    Optional<Book> markAsTaken(Long id);

}
