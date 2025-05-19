package oopproject.view;

import java.util.Scanner;
import oopproject.view.teacher.TeacherFun;

public class Teacher {

    private static TeacherFun t = new TeacherFun();
    private static Scanner in = new Scanner(System.in);
   

    public static void main() throws Exception {

        int chosen;

        System.out.println("Profile Operations Enter 1\nStudent Management Enter 2\nReports and Plans Enter 3\nView Student Reports Enter 4\nTo EXIT Enter 0");
        do {
            chosen = in.nextInt();
            switch (chosen) {
                case 1: {
                    System.out.println("Login Enter 1\nView Profile Enter 2\nUpdate Profile Enter 3\nTo BACK Enter 0");
                    int profileChoice = in.nextInt();
                    switch (profileChoice) {
                        case 1:
                            login();
                            break;
                        case 2:
                            viewProfile();//--
                            break;
                        case 3:
                            updateProfile();//--
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choose from 0 to 3");
                            continue;
                    }
                }
                break;
                case 2: {
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
    public static void login() {
        int id = 0;
        String password = null;
        boolean check;
        do {
            try {
                System.out.println("enter your id");
                id = in.nextInt();
                System.out.println("enter your password");
                password = in.next();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.Login(id, password);
    }

    public static void viewProfile() {
        int id = 0;

        boolean check;
        do {
            try {
                System.out.println("enter teacher id");
                id = in.nextInt();

                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.viewTeacherProfile(id);

    }

    public static void updateProfile() {

    }

    public static void setStudentPresent() {
        int id = 0;
        boolean present = false;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();
                System.out.println("is student present (true/false)");
                present = in.nextBoolean();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.setStudentPresent(id, present);

    }

    public static void setDailySaveRate() {

        int id = 0;
        int rate = 0;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();
                System.out.println("enter rate");
                rate = in.nextInt();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.setDailySaveRate(id, rate);
    }

    public static void setDailyResaveRate() {
        int id = 0;
        int rate = 0;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();
                System.out.println("enter rate");
                rate = in.nextInt();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.setDailyResaveRate(id, rate);
    }

    public static void addStudentNotes() {

        int id = 0;
        String note = null;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();
                System.out.println("enter note");
                note = in.next();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.addStudetnNotes(note, id);
    }

    public static void viewStudentNotes() {
        int id = 0;

        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();

                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.viewStudetnNotes(id);
    }

    public static void viewMonthlyReport() {
        int idcircl = 0;

        boolean check;
        do {
            try {
                System.out.println("enter circl id");
                idcircl = in.nextInt();

                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.viewMonthlyReport(idcircl);

    }

    public static void setPlanForStudent() {

        int id = 0;
        String plan = null;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();
                System.out.println("enter plan student");
                plan = in.next();
                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.addStudetnNotes(plan, id);

    }

    public static void viewStudentDailyReport() throws Exception {
        int id = 0;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();

                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.viewStudentDailyReport(id);

    }

    public static void viewStudentWeeklyReport() throws Exception {
        int id = 0;
        boolean check;
        do {
            try {
                System.out.println("enter student id");
                id = in.nextInt();

                check = false;
            } catch (Exception e) {
                System.out.println(e);
                check = true;
            }
        } while (check);
        t.viewStudentWeeklyReport(id);

    }

}
