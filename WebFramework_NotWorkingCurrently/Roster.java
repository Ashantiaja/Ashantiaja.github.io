
import java.util.ArrayList;
import java.util.List;

public class Roster {

    List<String> students = new ArrayList<>();

    public Roster() {

    }

    public void addStudent(String newStudentName) {
	students.add(newStudentName);
    }

    public void removeStudent(String toRemove) {
	
	int i = students.indexOf(toRemove);
	students.remove(i);
    }

    public void clear() {
	students.clear();
    }
};
