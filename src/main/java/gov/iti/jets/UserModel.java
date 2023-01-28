package gov.iti.jets;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public enum UserModel{
    
    INSTANCE ; 
    StringProperty name = new SimpleStringProperty();
    Property<Image> image = new SimpleObjectProperty<>();

    public StringProperty getName() {
        return name;
    }

    public Property<Image> getImage() {
        return image;
    }

}
