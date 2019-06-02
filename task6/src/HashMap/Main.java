package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Map<Passport, Citizen> map = new HashMap<Passport, Citizen>();

        Scanner scan = new Scanner(System.in);


        for (int i=0; i<3; i++) {
            Citizen citizen = enterCitizen(scan, "Enter a " + (i+1) + " citizen, ");
            Passport passport = enterPassport(scan, "Enter a passport of " + (i+1) + " citizen");
            map.put(passport,citizen);
        }

        System.out.println("Values entered:");
        for (Passport passport: map.keySet()) {
            System.out.println(map.get(passport) + ", " + passport);
        }

        Passport passport = enterPassport(scan, "Enter a passport to search");
        if (map.get(passport) != null) {
            System.out.println("This passport belongs to " + map.get(passport));
        } else {
            System.out.println("Citizen not found");
        }

        if (scan != null) {
            scan.close();
        }
    }

    private static Citizen enterCitizen(Scanner scan, String str) {
        Citizen citizen = new Citizen();
        System.out.println(str);
        System.out.print("name - ");
        citizen.setCitizenName(scan.nextLine());
        System.out.print("surname - ");
        citizen.setCitizenSurname(scan.nextLine());
        return citizen;
    }

    private static Passport enterPassport(Scanner scan, String str) {
        Passport passport = new Passport();
        System.out.println(str);
        System.out.print("series - ");
        passport.setSeries(scan.nextLine());
        System.out.print("number - ");
        passport.setSerialNumber(scan.nextLine());
        return passport;
    }






    }


