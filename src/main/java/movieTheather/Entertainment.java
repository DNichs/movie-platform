package movieTheather;

import java.util.Locale;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        //getting input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hello & Welcome, Choose a Movie Theatre ===");
        System.out.print("AMC | Regal | Emagine | Ipic | \t-->\t: ");
        String theater = scanner.nextLine().toLowerCase();

        MovieService service = null;

        switch (theater) {
            case "amc":
                service = new AMC(100,5,2,true,false,true,true);
                service.welcomeCustomer();

                while (true){
                    System.out.print("Movies | Seats | Info | Quit \t-->\t: ");
                    String option = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(option.equalsIgnoreCase("movies")){
                        service.showAvailableMovies();
                        System.out.println("==========================================================");

                    }else if(option.equalsIgnoreCase("seats")){
                        System.out.print("Pick a movie name --> : ");
                        String movieName = scanner.nextLine();
                        service.showAvailableSeat(movieName);

                    }else if(option.equalsIgnoreCase("info")){
                        System.out.println("");
                        service.showTheaterInfo();

                    } else if(option.equalsIgnoreCase("quit")){
                        break;

                    }else{
                        System.out.println("INVALID ENTER, PLEASE TRY AGAIN!");
                    }

                }
                break;
            case "emagine":
                break;
            case "ipic":
                break;
            case "regal":
                break;
            default:

        }


    }//end main
}
