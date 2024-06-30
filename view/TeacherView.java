package less4.view;

import less4.model.Student;
import less4.model.Teatcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teatcher> {

    @Override
    public void sendOnConsole(List<Teatcher> teachers) {
        List<Teatcher> sortList = new ArrayList<>(teachers);
        Collections.sort(sortList);
        System.out.println(sortList);
    }

}
