package gov.iti.jets;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class Controller2 implements Initializable {

    @FXML
    Label userName;

    @FXML
    ImageView userImage;

    @FXML 
    TextField messg;

    @FXML
    VBox vBox;
    public void displaySecondScreen(String name, String imagePath) {
        userName.setText(name);
        userImage.setImage(new Image(imagePath));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // userName.setText(Controller.userNameField.getText());
        // userImage.setImage(new Image(Controller.userImage.getImage().getUrl()));
        // System.out.println("-------- Controller 2 intializer --------");

        
    }

    @FXML
    public void newMessage(){
        if( !messg.getText().equals("")){
            Label labs=new Label();
            labs.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");
            labs.setText(messg.getText());
            vBox.getChildren().add(labs);
            messg.setText("");
        }
    }
}

