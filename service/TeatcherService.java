package less4.service;

import less4.model.Teatcher;

public class TeatcherService {
    public Teatcher CreateTeatcher(int id, String name, String last){
        return new Teatcher(id,name,last);
    }

    public void editTeatcher(Teatcher teatcher,String name,String last){
        teatcher.setName(name);
        teatcher.setLastName(last);
    }
}
