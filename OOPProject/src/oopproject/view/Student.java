package oopproject.view;

import java.util.Scanner;

public class Student {

    public static void main() {
        Scanner in = new Scanner(System.in);
        int chosen;
        System.out.println("Profile Operations Enter 1\nView Reports Enter 2\nTo EXIT Enter 0");
        do {
            chosen = in.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println("Login Enter 1\nView Profile Enter 2\nUpdate Profile Enter 3\nTo BACK Enter 0");
                    int profileChoice = in.nextInt();
                    switch (profileChoice) {
                        case 1:
                            //Login Method
                            break;
                        case 2:
                            //View Profile Method
                            break;
                        case 3:
                            //Update Profile Method
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                    break;
                case 2:
                    System.out.println("View Daily Report Enter 1\nView Weekly Report Enter 2\nTo BACK Enter 0");
                    int reportChoice = in.nextInt();
                    switch (reportChoice) {
                        case 1:
                            //View Daily Report Method
                            break;
                        case 2:
                            //View Weekly Report Method
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 2");
                            continue;
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose from 0 to 2");
                    continue;
            }
        } while (chosen != 0);
    }
}
