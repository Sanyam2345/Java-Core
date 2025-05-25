/**
 * @author Sanyam
 * @version 1.O
 * @since 2025
 */

package JavaDocAndAnnotation;

import java.util.Scanner;

/**
 * @author SANYAM
 * Class for Mobile
 */
public class Mobile {

    /**
     * @value shows the status of mobile on/off
     */
    boolean flag = false;

    /**
     * Constructor which turns mobile on/off
     */
    Mobile() {
        flag = true;
    }

    /**
     * Displays whether mobile is on/off
     */
    void display() {
        if (flag) {
            System.out.println("Mobile is on");
        }
        else {
            System.out.println("Mobile is off");
        }
    }

    /**
     * Calling function of a mobile
     * @param number takes mobile number for calling
     */
    void call (long number) {
        System.out.println("Calling " + number);
    }

    /**
     * Sends sms to a number
     * @param number takes mobile number for sending sms
     */
    void sms (String number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message here: ");
        String message = sc.nextLine();
        System.out.println("message: " + message + "sent to " + number);
    }

    /**
     * turns flight mode on or off
     * @return returns true or turns on the flight mode if it is off else false or turns off the flight mode
     */
    boolean flightMode () {
        boolean flight = false;
        if (flight == false){
            flight = true;
            return flight;
        }
        else {
            flight = false;
            return flight;
        }
    }
}
