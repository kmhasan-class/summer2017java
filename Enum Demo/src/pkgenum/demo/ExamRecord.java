/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum.demo;

/**
 *
 * @author kmhasan
 */
public class ExamRecord {
    // Student student
    private String studentId;
    private String courseCode;
    private Grade grade;

    public ExamRecord(String studentId, String courseCode, Grade grade) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.grade = grade;
    }

    public ExamRecord() {
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "ExamRecord{" + "studentId=" + studentId + ", courseCode=" + courseCode + ", grade=" + grade + '}';
    }
}
