package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(roundGrades(grades));
    }

    static List<Integer> roundGrades(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int newGrade = grades.get(i);
            while (newGrade%5 != 0) {
                newGrade++;
            }
            if (newGrade - grades.get(i) < 3 && newGrade>=40) grades.set(i,newGrade);
        }
        return grades;
    }
}
;