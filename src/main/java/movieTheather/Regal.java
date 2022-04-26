package movieTheather;

import com.github.javafaker.Faker;

public class Regal extends Theater implements MovieService {

    private String secondFloor;
    private Faker faker;
    String[] movies;

    public Regal(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D,
                 boolean hasDrinks, String secondFloor) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.secondFloor = secondFloor;
        faker = new Faker();
        movies = new String[10];
        for (int i = 0; i < 10; i++) {
            movies[i] = faker.book().title();
        }
    }

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }

    @Override
    public void welcomeCustomer() {
        System.out.println("=== Welcome to REGAL ===");
    }

    @Override
    public void showAvailableMovies() {
        System.out.println("\t\t\t========== REGAL Movie List ==========");
        for (int i = 0; i < movies.length; i++) {
            int temp = movies[i].length();
            int remain = 50 - temp;
            String whiteSpace = " ";

            if (i == 9) {
                System.out.println((i + 1) + " -> " + movies[i] + whiteSpace.repeat(remain - 1) +
                        "$" + (int) (Math.random() * (20 - 10) + 10));
            } else {
                System.out.println((i + 1) + " -> " + movies[i] + whiteSpace.repeat(remain) +
                        "$" + (int) (Math.random() * (20 - 10) + 10));
            }
        }
    }//end showAvailableMovies

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
        System.out.println("=== AMC Movie Theater ===\n" +
                "Number of Rooms     : " + getNumberOfRooms() + "\n" +
                "Number of Restrooms : " + getNumberOfRestrooms() + "\n" +
                "Number of Seats     : " + getNumberOfSeats() + "\n" +
                "Popcorn             : " + isHasPopcorn() + "\n" +
                "3D Available        : " + isHas3D() + "\n" +
                "Drinks              : " + isHasDrinks() + "\n" +
                "REGAL SECOND FLOOR  : " + getSecondFloor() + "\n");
    }//end showTheaterInfo
}//end REGAL class
