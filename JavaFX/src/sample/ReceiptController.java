package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.util.Random;

    public class ReceiptController {

        @FXML
        Label firstLBL;//label for first name
        @FXML
        Label surLBL;//label for Sur name
        @FXML
        Label ageLBL;//label for age
        @FXML
        Label cityLBL;//label for city
        @FXML
        Label nicLBL;//label for NIC and Passport
        @FXML
        Label vaccineLBL;//label for vaccine name
        @FXML
        Label boothLBL;//label for booth number
        @FXML
        private Button btnClose;//button to close the program
        @FXML
        Label DateAndTimeLBL;//label for Date and name

        public void displayFirstName(String name) {//method to displays the First Name entered

            firstLBL.setText( name);
        }
        public void displaySurName(String sur) {//method to displays the Sur Name entered

            surLBL.setText( sur);
        }
        public void displayAge(String age) {//method to displays the age entered

            ageLBL.setText( age);
        }
        public void displayCity(String city) {//method to displays the city entered
            cityLBL.setText( city);

        }
        public void navClose() {
            Stage StageClose = (Stage) btnClose.getScene().getWindow();//button to close the program
            StageClose.close();
        } public void displayVaccine(String vaccine){////displays the vaccine name entered
            vaccineLBL.setText( vaccine);
        }
        public void displayBooth(String booth){//displays the booth number entered
            boothLBL.setText( booth);
        }
        public void displayNIC(String nic) {//displays the NIC or Passport number entered
            nicLBL.setText( nic);


    //randomly generates the time and the date
            Random DateAndTime = new Random();
            int dateFinal = DateAndTime.nextInt(31-1) + 1;//randomly generates the date
            int monthFinal = DateAndTime.nextInt(12-8) + 8;//randomly generates the month
            int YearFinal = DateAndTime.nextInt(2021-2020) + 2020;//randomly generates the year
            int hourFinal = DateAndTime.nextInt(17-8) + 8;//randomly generates the hour
            int timeFinal = DateAndTime.nextInt(59-0) + 0;//randomly generates the time

            DateAndTimeLBL.setText(String.valueOf(dateFinal+"/"+monthFinal+"/"+YearFinal+" | "+hourFinal+":"+timeFinal));

        }



    }

