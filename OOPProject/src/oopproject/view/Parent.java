package oopproject.view;

import java.util.Scanner;

public class Parent {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int chosen;
        System.out.println("Profile Operations Enter 1\nTo EXIT Enter 0");
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
                            //View Profile Method (getMe)
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
                case 0:
                    break;
                default:
                    System.out.println("Choose from 0 to 1");
                    continue;
            }
        } while (chosen != 0);
    }
}
