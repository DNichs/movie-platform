package movieTheather;

public class Ipic extends Theater{

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
}
