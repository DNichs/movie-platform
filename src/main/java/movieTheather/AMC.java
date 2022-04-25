package movieTheather;

public class AMC extends Theater implements MovieService{

    private boolean hasVR;
    public AMC(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D, boolean hasDrinks,boolean hasVR) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.hasVR = hasVR;
    }
    //getter
    public boolean isHasVR() {
        return hasVR;
    }
    //setter
    public void setHasVR(boolean hasVR) {
        this.hasVR = hasVR;
    }

    private String[] allMovies = {" "};

    //implemented from MovieService Interfaces
    @Override
    public void welcomeCustomer() {
        System.out.println("Welcome to AMC!");
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
