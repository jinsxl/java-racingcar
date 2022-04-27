package RacingCar.domains;

public class PositiveNumber {
    private int number;

    public PositiveNumber(String number) {
        this(Integer.parseInt(number));
    }

    public PositiveNumber(int number) {
        this.number = number;
        if (number < 0) {
            throw new IllegalArgumentException("양수만 가능합니다.");
        }
    }
}
