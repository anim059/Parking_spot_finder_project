/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingspot;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Istiaque Hashem
 */
public class Signup_pageController implements Initializable {
 
    ObservableList<String> rentypevalue=FXCollections.observableArrayList("INSTANCE","MONTHLY","HOURLY");
    ObservableList<String> rentvehiclevalue=FXCollections.observableArrayList("car","micro","bike");
    
   
    
    @FXML
    private ChoiceBox signup_RType_id;
    @FXML
    private ChoiceBox signup_RV_id;
       @FXML
 
       public void ChnageWindowSignIn(ActionEvent event ) throws IOException{
        
        Parent view2=FXMLLoader.load(getClass().getResource("signin_page.fxml"));
        Scene scene2=new Scene(view2);
        
        Stage window2=(Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(scene2);
        window2.show();
    }
        @FXML
    public void ChnageWindowMainpage(ActionEvent event ) throws IOException{
        
        Parent view3=FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        Scene scene3=new Scene(view3);
        
        Stage window3=(Stage)((Node)event.getSource()).getScene().getWindow();
        window3.setScene(scene3);
        window3.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        signup_RType_id.setValue("INSTANCE");
        signup_RType_id.setItems(rentypevalue);
        
        signup_RV_id.setValue("car");
        signup_RV_id.setItems(rentvehiclevalue);
      
        
        
        // TODO
    } 
   
    
    
    
}
