package movieTheather;

import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        //getting input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello & Welcome, Choose a Movie Theatre");
        System.out.println("AMC | Regal | Emagine | Ipic");
        String theater = scanner.nextLine();

        switch (theater) {
            case "AMC":
                break;
            case "Emagine":
                break;
            case "Ipic":
                break;
            case "Regal":
                break;
            default:

        }


    }//end main
}
