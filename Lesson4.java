package less4;

import less4.controller.StudentController;
import less4.controller.TeatcherController;
import less4.model.Student;
import less4.model.Teatcher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(3, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeatcherController().sendOnConsole();

    }




//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
