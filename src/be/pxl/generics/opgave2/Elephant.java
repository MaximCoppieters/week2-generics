package be.pxl.generics.opgave2;

public class Elephant implements Moveable<Location> {
    Location location;

    @Override
    public void move(Location location) {
        this.location = location;
    }

    @Override
    public Location getCurrentLocation() {
        return location;
    }
}
