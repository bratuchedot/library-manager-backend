package mk.ukim.finki.library.service;

import mk.ukim.finki.library.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    /**
     * This method is used to add initial countries on the start of the app
     */
    Country addCountry(Country country);

    /**
     * @return List of all countries in the database
     */
    List<Country> findAll();

    /**
     * @param id The id of the country that we want to obtain
     * @return The country with the given id
     */
    Optional<Country> findById(Long id);

    /**
     * This method is used to add a new country, and save it in the database.
     *
     * @param name
     * @param continent
     * @return The country that is created. The id should be generated when the entity is created.
     */
    Optional<Country> save(String name, String continent);

    /**
     * Method that should delete a country.
     *
     * @param id The id of the country that should be deleted
     */
    void deleteById(Long id);

}
