package oopproject.view;

import java.util.Scanner;

public class Manager {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int chosen;
        System.out.println("Profile Operations Enter 1\nManage Users Enter 2\nManage Circles Enter 3\nSystem Operations Enter 4\nTo EXIT Enter 0");
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
                case 2:
                    System.out.println("Manage Students Enter 1\nManage Teachers Enter 2\nManage Parents Enter 3\nTo BACK Enter 0");
                    int userChoice = in.nextInt();
                    switch (userChoice) {
                        case 1:
                            System.out.println("Add Student Enter 1\nUpdate Student Enter 2\nDelete Student Enter 3\nTransfer Student Enter 4\nTo BACK Enter 0");
                            int studentChoice = in.nextInt();
                            switch (studentChoice) {
                                case 1:
                                    //Add Student Method
                                    break;
                                case 2:
                                    //Update Student Method
                                    break;
                                case 3:
                                    //Delete Student Method
                                    break;
                                case 4:
                                    //Transfer Student Method
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Choose from 0 to 4");
                                    continue;
                            }
                            break;
                        case 2:
                            System.out.println("Add Teacher Enter 1\nUpdate Teacher Enter 2\nDelete Teacher Enter 3\nSet Teacher Present Enter 4\nTo BACK Enter 0");
                            int teacherChoice = in.nextInt();
                            switch (teacherChoice) {
                                case 1:
                                    //Add Teacher Method
                                    break;
                                case 2:
                                    //Update Teacher Method
                                    break;
                                case 3:
                                    //Delete Teacher Method
                                    break;
                                case 4:
                                    //Set Teacher Present Method
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Choose from 0 to 4");
                                    continue;
                            }
                            break;
                        case 3:
                            System.out.println("Add Parent Enter 1\nUpdate Parent Enter 2\nDelete Parent Enter 3\nTo BACK Enter 0");
                            int parentChoice = in.nextInt();
                            switch (parentChoice) {
                                case 1:
                                    //Add Parent Method
                                    break;
                                case 2:
                                    //Update Parent Method
                                    break;
                                case 3:
                                    //Delete Parent Method
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
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                    break;
                case 3:
                    System.out.println("Add Circle Enter 1\nUpdate Circle Enter 2\nDelete Circle Enter 3\nTo BACK Enter 0");
                    int circleChoice = in.nextInt();
                    switch (circleChoice) {
                        case 1:
                            //Add Circle Method
                            break;
                        case 2:
                            //Update Circle Method
                            break;
                        case 3:
                            //Delete Circle Method
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                    break;
                case 4:
                    System.out.println("Reset User Password Enter 1\nTo BACK Enter 0");
                    int sysChoice = in.nextInt();
                    switch (sysChoice) {
                        case 1:
                            //Reset Password Method
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 1");
                            continue;
                    }
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
