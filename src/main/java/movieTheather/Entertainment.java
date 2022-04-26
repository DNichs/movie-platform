package movieTheather;

import java.util.Locale;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        //getting input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hello & Welcome, Choose a Movie Theatre ===");
        System.out.print("AMC | Emagine | Ipic | Regal | \t-->\t: ");
        String theater = scanner.nextLine().toLowerCase();

        MovieService service = null;

        switch (theater) {
            case "amc":
                service = new AMC(100, 5, 2, true,
                        false, true, true);
                break;
            case "emagine":
                service = new Emagine(75, 5, 4, false,
                        true, false, "Welcoming Special Event");
                break;

            case "ipic":
                service = new Ipic(150, 7, 5, false,
                        true, false, true);
                break;
            case "regal":
                service = new Regal(500, 15, 10, true,
                        true, true, "Second Floors Service");
             break;
            default:
                System.out.println("Please make sure only ENTER A THEATRE NAME!");
        }//end switch

        service.welcomeCustomer();
        while (true) {
            System.out.print("Movies | Seats | Info | Quit \t-->\t: ");
            String option = scanner.nextLine().toLowerCase(Locale.ROOT);

            if (option.equalsIgnoreCase("movies")) {
                service.showAvailableMovies();
                System.out.println("==========================================================");

            } else if (option.equalsIgnoreCase("seats")) {
                System.out.print("Pick a movie name --> : ");
                String movieName = scanner.nextLine();
                service.showAvailableSeat(movieName);

            } else if (option.equalsIgnoreCase("info")) {
                System.out.println("");
                service.showTheaterInfo();

            } else if (option.equalsIgnoreCase("quit")) {
                break;

            } else {
                System.out.println("INVALID ENTER, PLEASE TRY AGAIN!");
            }
        }//while

    }//end main
}
