package com.company;
//--------------------------------------------task2-----------------------------------------------
import java.util.Scanner;

public class VaccinationCenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------****VACCINATION CENTER****----------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-----------------------------------------------100 or VVB: View all Vaccination Booths-----------------------------------------------------------|");
        System.out.println("|-----------------------------------------------101 or VEB: View all Empty Booths-----------------------------------------------------------------|");
        System.out.println("|-----------------------------------------------102 or APB: Add Patient to a Booth----------------------------------------------------------------|");
        System.out.println("|-----------------------------------------------103 or RPB: Remove Patient from a Booth-----------------------------------------------------------|");
        System.out.println("|-----------------------------------------------104 or VPS: View Patients Sorted in alphabetical order--------------------------------------------|");
        System.out.println("|-----------------------------------------------105 or SPD: Store Program Data into file----------------------------------------------------------|");
        System.out.println("|-----------------------------------------------106 or LPD: Load Program Data from file-----------------------------------------------------------|");
        System.out.println("|-----------------------------------------------107 or VRV: View Remaining Vaccinations-----------------------------------------------------------|");
        System.out.println("|-----------------------------------------------108 or AVS: Add Vaccinations to the Stock---------------------------------------------------------|");
        System.out.println("|-----------------------------------------------999 or EXT: Exit the Program----------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------|");


        Booth newBooth=new Booth();//call the methods in Booth class

        newBooth.initialize();//calls the initialize method in Booth class

        while(true) {
            System.out.print("Enter a number to perform : ");//menu user input
            String userInput = input.nextLine();

            switch (userInput) {
                case "100":
                case "VVB":
                    newBooth.showBooths();//calls the showBooth method in Booth class
                    break;

                case "101":
                case "VEB":
                    newBooth.emptyBooths();//calls the emptyBooths method in Booth class
                    break;

                case "102":
                case "APB":
                    newBooth.addPatient();//calls the addPatient method in Booth class
                    break;

                case "103":
                case "RPB":
                    newBooth.removePatient();//calls the removePatient method in Booth class
                    break;

                case "104":
                case "VPS":
                    newBooth.alphabeticalOrder();//calls the alphabeticalOrder method in Booth class
                    break;

                case "105":
                case "SPD":
                    newBooth.storeProgram();//calls the storeProgram method in Booth class
                    break;

                case "106":
                case "LPD":
                    newBooth.loadProgram();//calls the loadProgram method in Booth class
                    break;

                case "107":
                case "VRV":
                    newBooth.currentStock();//calls the currentStock method in Booth class
                    break;

                case "108":
                case "AVS":
                    newBooth.addStock();//calls the addStock method in Booth class
                    break;

                case "999":
                case "EXT":
                    newBooth.exitProgram();//calls the exitProgram method in Booth class
                    break;

                default:
                    System.out.println("---------****Invalid input****---------");//displays Invalid input when the the user doesn't add the correct menu number or name
                    break;

            }
        }
    }
}
