package task7.src.Garage;

public interface Move {
    int MAXIMUM_SPEED = 90;

    void getMove();

    void getBrake();

    default void getSawFly() {
        System.out.printf("\nSaw flying behind the Car");

    }
}
