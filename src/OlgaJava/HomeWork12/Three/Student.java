package OlgaJava.HomeWork12.Three;

import java.util.Arrays;

public class Student {
    private String surName;
    private String initials;
    private int groupNumber;
    private int[] grade = new int[5];

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
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
