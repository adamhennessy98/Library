package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);


        //Comedy Books
        Scanner Com = new Scanner(new File("Comedy.txt"));
        ArrayList<String> comedy = new ArrayList<>();
        while (Com.hasNextLine()) {
            comedy.add(Com.nextLine());
        }

        //Crime Books
        Scanner Crm = new Scanner(new File("Crime.txt"));
        ArrayList<String> crime = new ArrayList<>();
        while (Crm.hasNextLine()) {
            crime.add(Crm.nextLine());
        }

        //Family
        Scanner Fmly = new Scanner(new File("Family.txt"));
        ArrayList<String> family = new ArrayList<>();
        while (Fmly.hasNextLine()) {
            family.add(Fmly.nextLine());
        }

        //Thriller
        Scanner Thrl = new Scanner(new File("Thriller.txt"));
        ArrayList<String> thriller = new ArrayList<>();
        while (Thrl.hasNextLine()) {
            thriller.add(Thrl.nextLine());
        }

        //Romance
        Scanner Rmc = new Scanner(new File("Romance.txt"));
        ArrayList<String> romance = new ArrayList<>();
        while (Rmc.hasNextLine()) {
            romance.add(Rmc.nextLine());
        }

        //Sci-fi
        Scanner Scfi = new Scanner(new File("Sci-fi.txt"));
        ArrayList<String> scifi = new ArrayList<>();
        while (Scfi.hasNextLine()) {
            scifi.add(Scfi.nextLine());
        }

        ArrayList<String> requests = new ArrayList<>();

        System.out.println("Hello and welcome to Nath's Library");

        System.out.println("You have four options");
        System.out.println("1:View Book Genres 2:Withdraw a book 3:Donate a book 4:Get the fuck out");

        int choose;
        int count = 0;

        while(count < 4) {
            choose = scan.nextInt();
            if (choose == 1) {
                genre(comedy, crime, family, thriller, romance, scifi);
                System.out.println();
                System.out.println("What now?");
                //count = choose;
            }
            else if (choose == 2) {
                withdraw(comedy, crime, family, thriller, romance, scifi);
                System.out.println();
                System.out.println("What now?");
                count = choose;
            }
            if (choose == 3) {
                donate(comedy, crime, family, thriller, romance, scifi);
                System.out.println();
                System.out.println("What now?");
                count = choose;
            }
            else if (choose == 4){
                System.out.println("Goodbye");
                break;
            }
            count = 0;
        }
    }

    public static void genre(ArrayList<String> comedy, ArrayList<String> crime, ArrayList<String> family, ArrayList<String> thriller, ArrayList<String> romance, ArrayList<String> scifi ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose what genre you would like");
        System.out.println("Our options are: 1: Comedy, 2: Crime, 3: Family, 4: Thriller, 5: Romance, 6: Scfi-fi");
        int input = scan.nextInt();

        if(input == 1) {
            for (int i = 0; i < comedy.size(); i++) {
                System.out.println(comedy.get(i));
            }
        }
        else if(input == 2){
            for(int i = 0; i < crime.size(); i++){
                System.out.println(crime.get(i));
            }
        }
        else if(input == 3){
            for(int i = 0; i < crime.size(); i++){
                System.out.println(family.get(i));
            }
        }
        else if(input == 4){
            for(int i = 0; i < thriller.size(); i++){
                System.out.println(thriller.get(i));
            }
        }
        else if(input == 5){
            for(int i = 0; i < romance.size(); i++){
                System.out.println(romance.get(i));
            }
        }
        else if(input == 6){
            for(int i = 0; i < scifi.size(); i++){
                System.out.println(scifi.get(i));
            }
        }
        else {
            System.out.println("Wrong Number");
        }
    }


    public static void withdraw(ArrayList<String> comedy, ArrayList<String> crime, ArrayList<String> family, ArrayList<String> thriller, ArrayList<String> romance, ArrayList<String> scifi ){
    Scanner scan = new Scanner(System.in);
    System.out.println("What book would you like to request?");
    String input = scan.nextLine();


    if(comedy.contains(input)){
        comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
    }
    else if(crime.contains(input)){
        comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
    }
    else if(family.contains(input)){
            comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
        }
    else if(thriller.contains(input)){
        comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
    }
    else if(romance.contains(input)){
        comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
    }
    else if(scifi.contains(input)){
        comedy.remove(input);
        System.out.println("You now own " + input + " book for 21 days");
    }
    else
    {
        System.out.println("It does not appear that we have the book " + input);
    }

    }

    public static void donate(ArrayList<String> comedy, ArrayList<String> crime, ArrayList<String> family, ArrayList<String> thriller, ArrayList<String> romance, ArrayList<String> scifi ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose which genre you would like to donate to");
        System.out.println("Our options are: 1: Comedy, 2: Crime, 3: Family, 4: Thriller, 5: Romance, 6: Scfi-fi");
        int input = scan.nextInt();
        String book;

        if(input == 1){
            System.out.println();
            System.out.println("and what book would you like to add?");
            book = scan.next();
            comedy.add(book);
        }
        else if(input == 2){
            System.out.println();
            System.out.println("and what book would you like to add?");
             book = scan.nextLine();
            crime.add(book);
        }
        else if(input == 3){
            System.out.println();
            System.out.println("and what book would you like to add?");
            book = scan.nextLine();
            family.add(book);
        }
        else if(input == 4){
            System.out.println();
            System.out.println("and what book would you like to add?");
            book = scan.nextLine();
            thriller.add(book);
        }
        else if(input == 5){
            System.out.println();
            System.out.println("and what book would you like to add?");
            book = scan.nextLine();
            romance.add(book);
        }
        else if(input == 6){
            System.out.println();
            System.out.println("and what book would you like to add?");
            book = scan.nextLine();
            scifi.add(book);
        }


    }
}