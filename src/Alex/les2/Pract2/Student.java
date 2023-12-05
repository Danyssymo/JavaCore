package Alex.les2.Pract2;

import java.util.Arrays;

public class Student {
    public String name;
    public int group;
    public int grade;

    public int[]otmetka;

    public Student(String name, int group, int grade, int[] otmetka) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.otmetka = otmetka;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", grade=" + grade +
                ", otmetka=" + Arrays.toString(otmetka) +
                '}';
    }
}
