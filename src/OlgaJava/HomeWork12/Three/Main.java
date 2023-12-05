package OlgaJava.HomeWork12.Three;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Student[] students = new Student[10];
    boolean check = false;

    public static void main(String[] args) {
        getStudentInfo();
        getBestStudents();
    }

    private static Student[] getStudentInfo() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            System.out.println("Студент № " + (i + 1));
            System.out.println(" ");
            System.out.println("Введите фамилию: ");
            String surname = sc.next();
            student.setSurName(surname);
            System.out.println("Введите инициалы: ");
            String initials = sc.next();
            student.setInitials(initials);
            System.out.println("Введите номер группы: ");
            int groupNum = sc.nextInt();
            student.setGroupNumber(groupNum);
            int[] grades = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Введите оценку №: " + (j + 1));
                int x = sc.nextInt();
                grades[j] = x;
            }
            student.setGrade(grades);
            students[i] = student;
        }
        System.out.println(Arrays.toString(students));
        return students;
    }

    private static void getBestStudents() {
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (students[i].getGrade()[j] < 9) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Наши лучшие студенты: ");
                System.out.println(students[i].getSurName() + " " + students[i].getGroupNumber());
            }
        }
    }
}
