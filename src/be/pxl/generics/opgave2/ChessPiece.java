package be.pxl.generics.opgave2;

public class ChessPiece implements Moveable<ChessBoardLocation> {
    ChessBoardLocation location;

    @Override
    public void move(ChessBoardLocation location) {
        this.location = location;
    }

    @Override
    public ChessBoardLocation getCurrentLocation() {
        return location;
    }
}
