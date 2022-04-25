package movieTheather;

public class Regal extends Theater{

    private String secondFloor;
    public Regal(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D, boolean hasDrinks,String secondFloor) {
        super(numberOfSeats, numberOfRooms, numberOfRestrooms, hasPopcorn, has3D, hasDrinks);
        this.secondFloor = secondFloor;
    }

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }
}
