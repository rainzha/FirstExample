package org.rainzha.refactoring.firstexample;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @Test
    public void rentedREGULARMovieMoreThan2Days() throws Exception {
        Movie topGun = new Movie("Top Gun", 1);
        Movie superMan = new Movie("Superman", 0);

        Rental topGunRental = new Rental(topGun, 10);
        Rental superManRental = new Rental(superMan, 5);

        Customer rainzha = new Customer("rainzha");
        rainzha.addRental(topGunRental);
        rainzha.addRental(superManRental);

        String actual = "Rental Record for rainzha" + "\n"
                + "\t" + "Top Gun" + "\t" + "30.0" + "\n"
                + "\t" + "Superman" + "\t" + "6.5" + "\n"
                + "Amount owed is 36.5" + "\n"
                + "You earned 3 frequent renter points";
        assertThat(actual).isEqualTo(rainzha.statement());
    }

    @Test
    public void rentedCHILDRENSMovieMoreThan3Days() throws Exception {
        Movie topGun = new Movie("Top Gun", 1);
        Movie iceAge = new Movie("Ice Age", 2);

        Rental topGunRental = new Rental(topGun, 10);
        Rental iceAgeRental = new Rental(iceAge, 6);

        Customer rainzha = new Customer("rainzha");
        rainzha.addRental(topGunRental);
        rainzha.addRental(iceAgeRental);

        String actual = "Rental Record for rainzha" + "\n"
                + "\t" + "Top Gun" + "\t" + "30.0" + "\n"
                + "\t" + "Ice Age" + "\t" + "6.0" + "\n"
                + "Amount owed is 36.0" + "\n"
                + "You earned 3 frequent renter points";
        assertThat(actual).isEqualTo(rainzha.statement());
    }
}