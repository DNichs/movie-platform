package movieTheather;

import com.github.javafaker.Faker;

public class Emagine extends Theater implements MovieService {

    private String specialEvent;
    private Faker faker;
    String[] movies;

    public Emagine(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn,
                   boolean has3D, boolean hasDrinks, String specialEvent) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.specialEvent = specialEvent;
        faker = new Faker();
        movies = new String[10];
        for (int i = 0; i < 10; i++) {
            movies[i] = faker.book().title();
        }
    }

    //getter
    public String getSpecialEvent() {
        return specialEvent;
    }

    //setter
    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }


    //implemented from MovieService Interfaces
    @Override
    public void welcomeCustomer() {
        System.out.println("=== Welcome to EMAGINE ===");
    }

    @Override
    public void showAvailableMovies() {
        System.out.println("\t\t\t========== EMAGINE Movie List ==========");
        for (int i = 0; i < movies.length; i++) {
            int temp = movies[i].length();
            int remain = 50 - temp;
            String whiteSpace = " ";

            //10th has extra one character(1-2-5-9-10) for alignment of it this if-else statement
            if (i == 9) {
                System.out.println((i + 1) + " -> " + movies[i] + whiteSpace.repeat(remain - 1) + "$" + (int) (Math.random() * (20 - 10) + 10));
            } else {
                System.out.println((i + 1) + " -> " + movies[i] + whiteSpace.repeat(remain) + "$" + (int) (Math.random() * (20 - 10) + 10));
            }
        }
    }

    @Override
    public void showAvailableSeat(String movie) {

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(movie)) {
                System.out.println("Available seats for \"" + movies[i] + "\" --> " + (int) (Math.random() * (100 - 10) + 10));
                return;
            }
        }
        System.out.println("Movie NOT Available!");
    }//end showAvailableSeats

    @Override
    public void showTheaterInfo() {
        System.out.println("=== EMAGINE Movie Theater ===\n" +
                "Number of Rooms     : " + getNumberOfRooms() + "\n" +
                "Number of Restrooms : " + getNumberOfRestrooms() + "\n" +
                "Number of Seats     : " + getNumberOfSeats() + "\n" +
                "Popcorn             : " + isHasPopcorn() + "\n" +
                "3D Available        : " + isHas3D() + "\n" +
                "Drinks              : " + isHasDrinks() + "\n" +
                "EMAGINE EVENTS      : " + getSpecialEvent() + "\n");
    }//end showTheaterInfo

}//end EMAGINE class
