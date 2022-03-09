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
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIES LOADED\n\n" + s );
            manageMovies();
        }

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
            String response = scan.nextLine();
            if (!(response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c"))) {
                scan.close();
                break;
            }
            
            System.out.print("Enter the name of the movie: ");
            String name = scan.nextLine();
            if (s.getMovies(name) == null) {
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
            }
            switch(response) {
                case "a": 
                if (!(s.getMovies(name).isAvailable())) {
                    System.out.println("\n\n\n\nThe movie is not available for purchase. Please try again\n");
                    continue;
                }
                s.action(name, "sell"); break;
                case "b": s.action(name, "rent"); break;
                case "c": s.action(name, "return"); break;
            }
            System.out.println("\n\nUPDATED MOVIES\n\n" + s);
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
