
import java.lang.reflect.*;
import java.io.FileNotFoundException;

//import static spark.Spark.*;



public class ConsoleTest {
    
    public static void main(String[] args) throws FileNotFoundException {
	Roster classRoster = new Roster();
	TempView viewer = new TempView();

	RosterController control = new RosterController(classRoster, viewer);

	control.addStudent("Mikaylee");
	control.writeRosterToFile("roster.txt");

	control.clearRoster();
	System.out.println("Adding New Students");
	control.addStudent("Kaevin");
	control.addStudent("YourGrace");
	control.addStudent("Melatonin");
	control.displayRoster();

	control.clearRoster();
	System.out.println("Loading students from roster.txt");
	control.loadRosterFromFile("roster.txt");
	control.displayRoster();
	
    }

    public void loadRosterFromFile(String inputFile, Roster r) {

    }
}
