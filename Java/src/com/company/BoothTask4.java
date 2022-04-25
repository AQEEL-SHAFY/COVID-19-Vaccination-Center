package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class BoothTask4{
    static String[] VaccineCenter = new String[6];//array to add the patients
    static int vaccines=150;//vaccines
    static LinkedList<String> waitingList=new LinkedList<>();//link list

    public void initialize() {//initialize empty when the array is null
        for (int i=0;i< VaccineCenter.length;i++){
            VaccineCenter[i]="empty";
        }
    }
//==============================================================================================================================================================================
    public void showBooths() {//method to show the Booths
        System.out.println("--------------------------------Vaccination Booths---------------------------------------");
        System.out.println("");
        for (int show = 0; show < VaccineCenter.length; show++) {
            if (VaccineCenter[show].equals("empty")) {
                System.out.println("Booth " + (show) + ":" + "empty");
            }else{
                System.out.println("Booth " + (show) + ":" + VaccineCenter[show]);
            }

        }System.out.println("");
    }
//==============================================================================================================================================================================
    public void emptyBooths() {//method to show the empty Booths
        System.out.println("-----------------------------------The Empty Booths---------------------------------------");
        System.out.println("");
        for (int empty = 0; empty < VaccineCenter.length; empty++) {
            if (VaccineCenter[empty].equals("empty")) {
                System.out.println("Booth " + (empty) + ":" + "empty");
            }
        }System.out.println("");
    }
//==============================================================================================================================================================================
    public void addPatient() {//method to add Patient to the Booth
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Booth number (0-5) to add a patient :");//booth that can be added 0 to 5
            int addPatient = input.nextInt();
            System.out.print("Enter Patient's name:");
            String patientName = input.next();

            if (!VaccineCenter[addPatient].equals("empty")) {//if a patient is already in the booth and if the user assign a new patient to the same booth the new patient will be added to a waiting list
                System.out.println("-----***patient will be added to waiting list***-----");
                waitingList.add(patientName);


            }

            if (VaccineCenter[addPatient].equals("empty")) {//if the booth is empty it will work as below
                if (waitingList != null) {
                    String[] arrWaiting = waitingList.toArray(new String[6]);//a new array to assign the patient in the link list , to the booth
                    arrWaiting[0] = patientName;
                    VaccineCenter[addPatient] = arrWaiting[0];
                    waitingList.remove(patientName);
                    vaccines--;//vaccines will reduce when the patients are assigning to the booth
                } else {
                    System.out.print("Enter Patient's Name:");
                    VaccineCenter[addPatient] = patientName;


                    if (vaccines < 20) {
                        System.out.println("-----****Vaccines are lower than 20****-----");// displays if vaccines are lower than 20
                    }
                }
            }
        }catch (Exception e){
            System.out.println("-------------------------------Invalid Statement!!!-----------------------------");//if any exception it displays as this
        }
    }

//==============================================================================================================================================================================
    public void removePatient() {//method to remove Patient from the Booth
        try {
            Scanner remove = new Scanner(System.in);
            System.out.print("Enter Number of the booth to remove a Patient : ");
            int patient = remove.nextInt();
            if (waitingList.size() == 0) {//if the link list is null it will assign as empty
                VaccineCenter[patient] = "empty";
            } else {
                String[] arrWaiting = waitingList.toArray(new String[6]);//removes patient from the link list
                VaccineCenter[patient] = arrWaiting[0];
                waitingList.remove();
                vaccines--;//vaccines will reduce when the patients are assigning to the booth

            }
        }catch (Exception e){
            System.out.println("-------------------------------Invalid Statement!!!-----------------------------");//if any exception it displays as this
        }

    }

//==============================================================================================================================================================================
    public void currentStock(){//method to display the current stock
        System.out.print("Remaining Vaccinations : "+vaccines);
        System.out.println("");

    }
//==============================================================================================================================================================================
    public void addStock(){//method to add vaccines to the current stock
        try {
            Scanner addStock = new Scanner(System.in);
            System.out.print("Enter how many vaccines do you need to add : ");//adds the vaccine count as the user input
            int vaccine = addStock.nextInt();
            vaccines = vaccine + vaccines;
        }catch (Exception e) {
            System.out.println("-------------------------------Invalid Statement!!!-----------------------------");//if any exception it displays as this
        }
    }
//==============================================================================================================================================================================
    public void loadProgram() {//method to load program that the user saved
        File myObj = new File("textFile.txt");//the text file name
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());//prints the text file name
            System.out.println("Absolute path: " + myObj.getAbsolutePath());//prints the text file path
        }else {
            System.out.println("The file does not exist.");
        }
    }// got an idea from https://www.w3schools.com/java/java_files_create.asp
//==============================================================================================================================================================================
    public void storeProgram(){//method to save program
        try {
            FileWriter myFile = new FileWriter("textFile.txt");//stores the data to the file
            for (int j=0;j< VaccineCenter.length;j++){
                myFile.write( "Booth " +VaccineCenter[j] +"\n");
            }
            myFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }// got an idea from https://www.w3schools.com/java/java_files_create.asp
//=============================================================================================================================================================================
    public void alphabeticalOrder(){//method to display the alphabetical sorting
        System.out.println("View Patients Sorted in alphabetical order");
        for (int i = 0; i < VaccineCenter.length; i++) {
            for (int j = i + 1; j < VaccineCenter.length; j++) {

                // to compare one string with other strings
                if (VaccineCenter[i].compareTo(VaccineCenter[j]) > 1) {
                    // swapping
                    String temp;
                    temp = VaccineCenter[i];
                    VaccineCenter[i] = VaccineCenter[j];
                    VaccineCenter[j] = temp;
                }
            }

        }
        // print output array
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < VaccineCenter.length; i++) {
            System.out.println("Name " +": " +VaccineCenter[i]);
        }
        //The reference for the alphabetic sorting : https://www.geeksforgeeks.org/

    }
//=============================================================================================================================================================================
    public void exitProgram() {//method to exit the program
        System.out.println("You have Exited the program");
        System.out.println("|=================================================================================================================================================|");
        System.out.println("|=========================================================Thank you!!!============================================================================|");
        System.out.println("|=================================================================================================================================================|");
        System.exit(0);

    }
}



