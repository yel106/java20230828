package ch12api.book.exam04;

import java.util.Objects;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    //Alt + insert눌러서 완성하기
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return studentNum != null ? studentNum.hashCode() : 0;
    }
}
