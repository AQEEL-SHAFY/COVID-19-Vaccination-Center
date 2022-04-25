package com.company;
//--------------------------------------------task3-----------------------------------------------
import java.util.Scanner;

public class VaccinationCenterExtended {
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


        BoothExtended newBoothExtend=new BoothExtended();//call the methods in BoothExtended class
        newBoothExtend.initialize();//calls the initialize method class

        while(true) {
            System.out.print("Enter a number to perform : ");//menu user input
            String userInput = input.nextLine();

            switch (userInput) {
                case "100":
                case "VVB":
                    newBoothExtend.showBooths();//calls the showBooth method in BoothExtended class
                    break;

                case "101":
                case "VEB":
                    newBoothExtend.emptyBooths();//calls the emptyBooth method in BoothExtended class
                    break;

                case "102":
                case "APB":
                    newBoothExtend.addPatient();//calls the addPatient method in BoothExtended class
                    break;

                case "103":
                case "RPB":
                    newBoothExtend.removePatient();//calls the removePatient method in BoothExtended class
                    break;

                case "104":
                case "VPS":
                    newBoothExtend.alphabeticalOrder();//calls the alphabeticalOrder method in BoothExtended class
                    break;

                case "105":
                case "SPD":
                    newBoothExtend.storeProgram();//calls the storeProgram method in BoothExtended class
                    break;

                case "106":
                case "LPD":
                    newBoothExtend.loadProgram();//calls the loadProgram  method in BoothExtended class
                    break;

                case "107":
                case "VRV":
                    newBoothExtend.currentStock();//calls the currentStock  method in BoothExtended class
                    break;

                case "108":
                case "AVS":
                    newBoothExtend.addStock();//calls the addStock method in BoothExtended class
                    break;

                case "999":
                case "EXT":
                    newBoothExtend.exitProgram();//calls the exitProgram method in BoothExtended class
                    break;

                default:
                    System.out.println("---------****Invalid input****---------");//displays Invalid input when the the user doesn't add the correct menu number or name
                    break;

            }
        }
    }
}
