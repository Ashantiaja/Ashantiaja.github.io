import java.io.*;
import java.util.Scanner;

public class RosterController {
    private Roster classRoster;
    private TempView viewer;

    public RosterController(Roster r, TempView v) {
	classRoster = r;
	viewer = v;
    }

    public void displayRoster() {
	viewer.displayRoster(classRoster);
    }

    public void writeRosterToFile(String output) throws FileNotFoundException {
	viewer.writeRosterToFile(classRoster, output);
    }

    public void loadRosterFromFile(String input) throws FileNotFoundException {
    File inputFile = new File(input);
    Scanner inFile = new Scanner(inputFile);

    while(inFile.hasNext()) {
	//System.out.println(inFile.next());
	classRoster.addStudent(inFile.next());
    }

    inFile.close();
}

    public void addStudent(String newStudentName) {
	classRoster.addStudent(newStudentName);
    }

    public void removeStudent(String toRemove) {
	classRoster.removeStudent(toRemove);
    }

    public void clearRoster() {
	classRoster.clear();
    }
}
