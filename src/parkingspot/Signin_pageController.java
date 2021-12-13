/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingspot;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Istiaque Hashem
 */
public class Signin_pageController implements Initializable {
    
          @FXML
    public void ChnageWindowSignup(ActionEvent event ) throws IOException{
        
        Parent view2=FXMLLoader.load(getClass().getResource("signup_page.fxml"));
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
        
    }    
    
}
