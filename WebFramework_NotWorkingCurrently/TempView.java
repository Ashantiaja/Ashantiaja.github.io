import java.io.*;

public class TempView {

    public TempView() {

    }

    public void displayRoster(Roster r) {
	System.out.println("Class roster: ");
	for(int i = 0; i < r.students.size(); i++) {
	    System.out.println("Student " + (i+1) + ": " + r.students.get(i));
	}
    }

    public void writeRosterToFile(Roster r, String outputFile) throws FileNotFoundException {

	File file = new File(outputFile);
	PrintWriter output = new PrintWriter(file);

	for(int i = 0; i < r.students.size(); i++) {
	    output.println(r.students.get(i));
	}

	output.close();
    }
}
