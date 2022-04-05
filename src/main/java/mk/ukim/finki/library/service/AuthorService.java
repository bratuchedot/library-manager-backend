package mk.ukim.finki.library.service;

import mk.ukim.finki.library.model.Author;
import mk.ukim.finki.library.model.exceptions.CountryNotFoundException;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    /**
     * This method is used to add initial authors on the start of the app
     */
    Author addAuthor(Author author);

    /**
     * @return List of all authors in the database
     */
    List<Author> findAll();

    /**
     * @param id The id of the author that we want to obtain
     * @return The author with the given id
     */
    Optional<Author> findById(Long id);

    /**
     * This method is used to register a new author, and save it in the database.
     *
     * @param name
     * @param surname
     * @param countryId
     * @return The author that is created. The id should be generated when the entity is created.
     * @throws CountryNotFoundException when there is no country with the given id
     */
    Optional<Author> save(String name, String surname, Long countryId);

    /**
     * Method that should deregister an author.
     *
     * @param id The id of the author that should be deleted
     */
    void deleteById(Long id);

}
