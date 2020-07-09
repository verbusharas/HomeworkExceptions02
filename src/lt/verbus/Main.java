package lt.verbus;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        while(true) {
            try {
                System.out.printf("%s %3d","You entered:", (new Input().readNumber()));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Number must be an integer. Try again:");
            }
        }
    }
}
