
import java.lang.reflect.*;
import java.io.FileNotFoundException;



public class ConsoleTest {
    
    public static void main(String[] args) throws FileNotFoundException {
	Roster classRoster = new Roster();
	TempView viewer = new TempView();

	RosterController control = new RosterController(classRoster, viewer);
	/*
	control.addStudent("Kaevin");
	control.addStudent("YourGrace");
	control.addStudent("Melatonin");
	control.displayRoster();
	control.writeRosterToFile("roster.txt");
	*/

	control.loadRosterFromFile("roster.txt");
	control.displayRoster();
	
    }

    public void loadRosterFromFile(String inputFile, Roster r) {

    }
}
