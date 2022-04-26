package movieTheather;

import com.github.javafaker.Faker;

public class AMC extends Theater implements MovieService {

    private boolean hasVR;
    private Faker faker;
    String[] movies;

    public AMC(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn,
               boolean has3D, boolean hasDrinks, boolean hasVR) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.hasVR = hasVR;
        faker = new Faker();
        movies = new String[10];
        for (int i = 0; i < 10; i++) {
            movies[i] = faker.book().title();
        }
    }

    //getter
    public boolean isHasVR() {
        return hasVR;
    }

    //setter
    public void setHasVR(boolean hasVR) {
        this.hasVR = hasVR;
    }

    //implemented from MovieService Interfaces
    @Override
    public void welcomeCustomer() {
        System.out.println("=== Welcome to AMC ===");
    }

    @Override
    public void showAvailableMovies() {
        System.out.println("\t\t\t========== AMC Movie List ==========");
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
                "AMC SPECIAL -- VR --: " + isHasVR() + "\n");
    }//end showTheaterInfo
}//end AMC class
