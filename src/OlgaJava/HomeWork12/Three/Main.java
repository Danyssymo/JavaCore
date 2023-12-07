package OlgaJava.HomeWork12.Three;

public class Main {
    public static Student[] students = new Student[10];

    public static void main(String[] args) {
        getStudentInfo();
        getBestStudents();
    }

    private static Student[] getStudentInfo() {
        Student student1 = new Student("Вася", "A.O.", 123, new int[]{10, 10, 10, 10, 10});
        Student student2 = new Student("Петя", "A.O.", 123, new int[]{9, 9, 10, 10, 8});
        Student student3 = new Student("Оля", "A.O.", 124, new int[]{9, 10, 10, 10, 10});
        Student student4 = new Student("Олег", "A.O.", 124, new int[]{1, 2, 2, 2, 3});
        Student student5 = new Student("Даник", "A.O.", 127, new int[]{4, 2, 3, 10, 7});
        Student student6 = new Student("Денис", "A.O.", 127, new int[]{10, 10, 10, 10, 10});
        Student student7 = new Student("Влад", "A.O.", 129, new int[]{5, 2, 8, 9, 9});
        Student student8 = new Student("Маша", "A.O.", 129, new int[]{9, 9, 9, 9, 9});
        Student student9 = new Student("Алиса", "A.O.", 121, new int[]{1, 2, 1, 1, 10});
        Student student10 = new Student("Максим", "A.O.", 121, new int[]{10, 10, 9, 10, 9});
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[9] = student10;
        return students;
    }

    private static void getBestStudents() {
        System.out.println("Наши лучшие студенты: ");
        for (int i = 0; i < students.length; i++) {
            boolean check = false;
            for (int j = 0; j < 5; j++) {
                if (students[i].getGrade()[j] < 9) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.println(students[i].getSurName() + " " + students[i].getGroupNumber());
            }
        }
    }
}
