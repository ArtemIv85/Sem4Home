package less4.view;

import less4.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
       List<Student> sortList = new ArrayList<>(students);
        Collections.sort(sortList);
        System.out.println(sortList);
    }
}
