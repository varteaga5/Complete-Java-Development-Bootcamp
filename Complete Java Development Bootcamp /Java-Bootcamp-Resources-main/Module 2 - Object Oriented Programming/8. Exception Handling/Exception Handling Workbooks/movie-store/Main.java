import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Movie;
import models.Store;

public class Main {

    static Store s = new Store();
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        
        try {
            loadMovies("movies.txt");
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIES LOADED\n\n" + s );
        }
        manageMovies();

    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */
    public static void manageMovies () {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nWould you like to \n\ta) purchase\n\tb) rent \n\tc) return.");
            if (scan.nextLine().equalsIgnoreCase("a")) {
                System.out.println("please enter the name of the movie: ");
                s.action(scan.next(), "sell");
                System.out.println("\n\nUPDATED MOVIES\n\n" + s);
            } else if (scan.nextLine().equalsIgnoreCase("b")) {
                System.out.println("please enter the name of the movie: ");
                s.action(scan.next(), "rent");
                System.out.println("\n\nUPDATED MOVIES\n\n" + s);
            } else if (scan.nextLine().equalsIgnoreCase("c")) {
                System.out.println("please enter the name of the movie: ");
                s.action(scan.next(), "return");
                System.out.println("\n\nUPDATED MOVIES\n\n" + s);
            }
        }
        // scan.close();
    }


    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */

     public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            String entireLine = scanFile.nextLine();
            String[] splitLine = entireLine.split("--");
            double rtgDbl = Double.parseDouble(splitLine[2]);
            s.addMovie(new Movie(splitLine[0], splitLine[1], rtgDbl));
        }
        scanFile.close();
     }

}
