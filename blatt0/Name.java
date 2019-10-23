package blatt0;

/**
 * Program call via terminal: navigate into /src directory (or whatever your directory with .java files is called),
 * open terminal in that directory and type "javac blatt0/Name.java" for compiling and 
 * "java -cp . blatt0.Name 1 3" for executing.
 */

public class Name {

    public static void main(String[] args) {
		
		// vereinfachte Lsg

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Wichtig: klammern

        System.out.println("Hallo " + (a + b) + "!");
    }
}
