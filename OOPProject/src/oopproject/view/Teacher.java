package oopproject.view;

import java.util.Scanner;
import oopproject.view.manager.Manager;

public class Teacher {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int chosen;
        Manager m = new Manager();
        System.out.println("Profile Operations Enter 1\nStudent Management Enter 2\nReports and Plans Enter 3\nView Student Reports Enter 4\nTo EXIT Enter 0");
        do {
            chosen = in.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println("Login Enter 1\nView Profile Enter 2\nUpdate Profile Enter 3\nTo BACK Enter 0");
                    int profileChoice = in.nextInt();
                    switch (profileChoice) {
                        case 1:
                            m.addTeacher(teacherData);
                            break;
                        case 2:
                            viewProfile();
                            break;
                        case 3:
                            updateProfile();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                    break;
                case 2:
                    System.out.println("Set Student Present Enter 1\nManage Student Rates Enter 2\nManage Student Notes Enter 3\nTo BACK Enter 0");
                    int studentChoice = in.nextInt();
                    switch (studentChoice) {
                        case 1:
                            setStudentPresent();
                            break;
                        case 2:
                            System.out.println("Set Daily Save Rate Enter 1\nSet Daily Resave Rate Enter 2\nTo BACK Enter 0");
                            int rateChoice = in.nextInt();
                            switch (rateChoice) {
                                case 1:
                                    setDailySaveRate();
                                    break;
                                case 2:
                                    setDailyResaveRate();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Choose from 0 to 2");
                                    continue;
                            }
                            break;
                        case 3:
                            System.out.println("Add Student Note Enter 1\nView Student Notes Enter 2\nTo BACK Enter 0");
                            int notesChoice = in.nextInt();
                            switch (notesChoice) {
                                case 1:
                                    addStudentNotes();
                                    break;
                                case 2:
                                    viewStudentNotes();
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
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                    break;
                case 3:
                    System.out.println("View Monthly Report Enter 1\nSet Plan For Student Enter 2\nTo BACK Enter 0");
                    int reportChoice = in.nextInt();
                    switch (reportChoice) {
                        case 1:
                            viewMonthlyReport();
                            break;
                        case 2:
                            setPlanForStudent();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 2");
                            continue;
                    }
                    break;
                case 4:
                    System.out.println("View Student Daily Report Enter 1\nView Student Weekly Report Enter 2\nTo BACK Enter 0");
                    int studentReportChoice = in.nextInt();
                    switch (studentReportChoice) {
                        case 1:
                            viewStudentDailyReport();
                            break;
                        case 2:
                            viewStudentWeeklyReport();
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
                    System.out.println("Choose from 0 to 4");
                    continue;
            }
        } while (chosen != 0);
    }

    // Add method implementations here
    public static void login() {}
    public static void viewProfile() {}
    public static void updateProfile() {}
    public static void setStudentPresent() {}
    public static void setDailySaveRate() {}
    public static void setDailyResaveRate() {}
    public static void addStudentNotes() {}
    public static void viewStudentNotes() {}
    public static void viewMonthlyReport() {}
    public static void setPlanForStudent() {}
    public static void viewStudentDailyReport() {}
    public static void viewStudentWeeklyReport() {}
}
