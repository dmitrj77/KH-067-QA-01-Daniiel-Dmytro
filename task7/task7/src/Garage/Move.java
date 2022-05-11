package task7.src.Garage;

public interface Move {
    int MAXIMUM_SPEED_TRUCK = 70;
    int MAXIMUM_SPEED_BUS =90;

    void getMove();

    void getBrake();

    default void getSawFly() {
        System.out.printf("\nSaw flying behind the Car");

    }
}
