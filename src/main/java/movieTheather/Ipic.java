package movieTheather;

public class Ipic extends Theater implements MovieService{

    private boolean hasDinner;
    public Ipic(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D, boolean hasDrinks,boolean hasDinner) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.hasDinner = hasDinner;
    }

    public boolean isHasDinner() {
        return hasDinner;
    }

    public void setHasDinner(boolean hasDinner) {
        this.hasDinner = hasDinner;
    }

    @Override
    public void welcomeCustomer() {
        System.out.println("Welcome to IPIC!");

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
