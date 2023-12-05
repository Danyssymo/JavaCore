package Alex.les2.Pract2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> myList = new ArrayList<>();
        Student vasya = new Student("Вася", 401, 2, new int[]{2, 4, 7});
        Student petya = new Student("Петя", 401, 3, new int[]{1, 1, 1});
        Student olya = new Student("Оля", 402, 1, new int[]{9, 5, 9});
        Student oleg = new Student("Олег", 402, 2, new int[]{5, 2, 2});
        myList.add(vasya);
        myList.add(petya);
        myList.add(olya);
        myList.add(oleg);
        checkAverage(vasya);
        checkAverage(petya);
        checkAverage(olya);
        checkAverage(oleg);
        System.out.println(myList);
        printStudents(myList, 3);


    }

    public static void checkAverage(Student student) {
        int counter = 0;
        for (int i = 0; i < student.otmetka.length; i++) {
            counter = counter + student.otmetka[i];
        }
        if ((counter / student.otmetka.length) >= 3) {
            student.grade++;
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (course == student.grade) {
                System.out.println(student);
            }
        }
    }

}
