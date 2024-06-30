package less4.controller;

import less4.model.Student;
import less4.model.Teatcher;
import less4.model.User;
import less4.view.StudentView;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.ArrayList;
import java.util.List;

public class TeatcherController implements UserController {

    private UserView<Teatcher> view = new TeacherView();
    List<Teatcher> teatchers;

    public TeatcherController() {
        teatchers = new ArrayList<>(List.of(
                new Teatcher(1,"Semen","Slepakov"),
                new Teatcher(2,"Mariya","Petrovna")
        );
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole() {
        view.sendOnConsole(teatchers);
    }




}
