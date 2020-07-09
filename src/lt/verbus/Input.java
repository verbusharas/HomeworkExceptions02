package lt.verbus;

import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }

    public int readNumber(){
        System.out.println("Please enter a number:");
        return input.nextInt();
    }
}
