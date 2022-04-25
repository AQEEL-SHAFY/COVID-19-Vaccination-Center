package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {


    @FXML
    TextField FirstName;//text field for first name
    @FXML
    TextField SurName;//text field for sur name
    @FXML
    TextField City;//text field for city
    @FXML
    TextField Age;//text field for age
    @FXML
    TextField NIC;//text field for NIC or Passport
    @FXML
    TextField VACC;//text field for vaccine name
    @FXML
    TextField Booth;//text field for booth name


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void receipt(ActionEvent actionEvent) throws IOException {// display details when the generate receipt button click

        String name = FirstName.getText();//assigning variables
        String sur = SurName.getText();
        String city = City.getText();
        String age = Age.getText();
        String nic = NIC.getText();
        String vaccine =VACC.getText();
        String booth =Booth.getText();


        Stage preStage = new Stage();//stage to display the new stage(THE RECEIPT)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Receipt.fxml"));
        root = loader.load();
        preStage.setTitle("THE RECEIPT");//the title of the receipt
        preStage.setScene(new Scene(root, 500, 500));
        preStage.show();
        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();//close the previous stage and open the new stage(THE RECEIPT)
        previousStage.close();



        ReceiptController nameFull = loader.getController();
        nameFull.displayFirstName(name);//calls the displayFirstName method in the Receipt controller

        ReceiptController nameSur = loader.getController();
        nameSur.displaySurName(sur);//calls the displaySurName method in the Receipt controller

        ReceiptController area = loader.getController();
        area.displayCity(city);//calls the displayCity method in the Receipt controller

        ReceiptController userAge = loader.getController();
        userAge.displayAge(age);//calls the displayAge method in the Receipt controller

        ReceiptController userNIC = loader.getController();
        userNIC.displayNIC(nic);//calls the displayNIC method in the Receipt controller

        ReceiptController vaccineName = loader.getController();
        vaccineName.displayVaccine(vaccine);//calls the displayVaccine method in the Receipt controller

        ReceiptController boothNo = loader.getController();
        boothNo.displayBooth(booth);//calls the displayBooth method in the Receipt controller



        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);



    }

}