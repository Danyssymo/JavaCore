package OlgaJava.HomeWork12.Three;

import java.util.Arrays;

public class Student {
    private String surName;
    private String initials;
    private int groupNumber;
    private int[] grade;

    public Student(String surName, String initials, int groupNumber, int[] grade) {
        this.surName = surName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public String getSurName() {
        return surName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", initials='" + initials + '\'' +
                ", groupNumber=" + groupNumber +
                ", grade=" + Arrays.toString(grade) +
                '}';
    }
}
