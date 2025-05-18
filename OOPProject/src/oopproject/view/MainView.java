package oopproject.view;

import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chosen;
        do {

            System.out.print("""
                            1. login as Student
                            2. login as Teacher
                            3. login as Manager
                            4. login as Parent
                            0. to exit
                            Enter your choose: 
                           """);
//            System.out.println("To Login As Student Enter 1\nTo Login As Teacher Enter 2\nTo Login As Manager Enter 3\nTo Login As Parent Enter 4\nTo EXIT Enter 0");
            chosen = in.nextInt();
            switch (chosen) {
                case 1:
                    Student.main();
                    break;
                case 2:
                    Teacher.main();
                    break;
                case 3:
                    Manager.main();
                    break;
                case 4:
                    Parent.main();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose from 0 to 4");
                    continue;
            }
        } while (chosen != 0);
    }
}
