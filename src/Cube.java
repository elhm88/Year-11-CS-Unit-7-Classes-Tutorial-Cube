public class Cube {
    // Properties
    private int side;


    // Methods
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSurfaceArea() {
        return 6 * ( side * side );
    }

    public int getVolume() {
        return side * side * side;
    }

    public String toString() {
        return ("Cube{side=" + side + "}");
    }


    // Constructors
    public Cube() {
        side = 1;
    }

    public Cube(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }

        side = n;
    }

}
