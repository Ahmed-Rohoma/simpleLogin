package gov.iti.jets;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Controller implements Initializable {

    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    ImageView userImage;

    @FXML
    TextField userNameField;

    @FXML
    void join(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML.fxml"));
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).setScene(new Scene(loader.load()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userNameField.textProperty().bindBidirectional(UserModel.INSTANCE.getName());
        userImage.imageProperty().bindBidirectional(UserModel.INSTANCE.getImage());
    }

    @FXML
    void openFileExToChooseImage(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("imageFilter","*.png","*.jpg");
        chooser.getExtensionFilters().add(filter);

        chooser.setTitle("Choose Image");
        File selectedFile = chooser.showOpenDialog(stage);

        if (selectedFile != null){
            String imagePath = selectedFile.getAbsolutePath().toString();
            userImage.setImage(new Image(imagePath));
        }
        else {
            // show dialog 
        }
    }

}
