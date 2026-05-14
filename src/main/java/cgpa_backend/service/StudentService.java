package cgpa_backend.service;

import org.springframework.stereotype.Service;

import cgpa_backend.model.Student;

@Service
public class StudentService {

    public Student calculate(Student s) {

        int total = s.getM1() + s.getM2() + s.getM3() + s.getM4();

        double percentage = total / 4.0;
        double cgpa = percentage / 9.5;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "Fail";

        s.setPercentage(percentage);
        s.setCgpa(cgpa);
        s.setGrade(grade);

        return s;
    }
}