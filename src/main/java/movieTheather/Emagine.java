package movieTheather;

import com.github.javafaker.Faker;

public class Emagine extends Theater implements MovieService{

    private String specialEvent;
    public Emagine(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D, boolean hasDrinks,String specialEvent) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.specialEvent = specialEvent;

    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    @Override
    public void welcomeCustomer() {
        System.out.println("Welcome to EMAGINE!");

    }

    @Override
    public void showAvailableMovies() {

    }

    @Override
    public void showAvailableSeat(String movie) {

    }

    @Override
    public void showTheaterInfo() {

    }
}
