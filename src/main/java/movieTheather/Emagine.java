package movieTheather;

public class Emagine extends Theater{

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
}
