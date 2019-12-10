
import java.lang.reflect.*;
import java.io.FileNotFoundException;

//import static spark.Spark.*; // Taken from documentation with the assumption that spark is INSTALLED
import spark.*;


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

	get("/hello", (req, res) -> "Hellow World");
	
    }

}
