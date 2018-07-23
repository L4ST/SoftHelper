package softhelper;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainSoftHelperController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private JFXButton googleButton;
    
        @FXML
    private JFXTextField txtClient;

    @FXML
    private Label txtString;

    @FXML
    private JFXButton mostrarString;
    
    @FXML
    private JFXTextField txtSearch;
    
    
    @FXML
    private JFXButton mostrarString1;

    
    @FXML
    private JFXButton buttonYT;
    
    @FXML
    private JFXButton everything;

    @FXML
    void handleButtonAction(ActionEvent event) {
        
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.google.com");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }

    }
    @FXML
    void ytButton(ActionEvent event){
      try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.youtube.com/");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }  
    }
    @FXML 
    void everyButton(ActionEvent event){
       try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.voidtools.com/Everything-1.4.1.895.x86-Setup.exe");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }   
    }
    
        @FXML
    void ActionClickTesting(ActionEvent event){
    if(txtClient.getText().toLowerCase().contains("vape")){
         txtString.setText("cI(9  / kc((k");
            
    }if(txtClient.getText().toLowerCase().contains("demon")){
         txtString.setText("Blatant  /  =BEHKN");
    }if(txtClient.getText().toLowerCase().contains("avix")){
         txtString.setText("me/aristhena/client/");
    }if(txtClient.getText().toLowerCase().contains("kurium")){
         txtString.setText("dinkio");
    }
    if(txtClient.getText().toLowerCase().contains("bape")){
         txtString.setText("ggc0;FFFF)V");
    }
    if(txtClient.getText().toLowerCase().contains("bit")){
        txtString.setText("c_.class");
    }
         
    
        if(txtClient.getText().toLowerCase().contains("cyanide")){
         txtString.setText("us/cuck/core/module/");   
        }
            if(txtClient.getText().toLowerCase().contains("nervoso")){
         txtString.setText("Melhor q lawlex");   
        }
             if(txtClient.getText().toLowerCase().contains("lawlex")){
         txtString.setText("sem moral");   
        }
                          if(txtClient.getText().toLowerCase().contains("nappe")){
         txtString.setText("semi kid");   
        }
                           if(txtClient.getText().toLowerCase().contains("clicker")){
         txtString.setText("dwm - robot/clicker");   
        }                         
                          
         
     if(txtClient.getText().toLowerCase().contains("gucci")){
        txtString.setText("(12): Gcheat");
    }    
    if(txtClient.getText().toLowerCase().contains("hillary")){
         txtString.setText("(15): 'G$K");   
        } 
    if(txtClient.getText().toLowerCase().contains("fusk")){
         txtString.setText("(13): kBVCIRLXPS");   
        } 
    
    if(txtClient.getText().toLowerCase().contains("harambe")){
         txtString.setText("t/t/A");   
        } 
    if(txtClient.getText().toLowerCase().contains("vea")){
         txtString.setText("kohi/tcpnodelaymod/aUx");   
        } 
    if(txtClient.getText().toLowerCase().contains("drip")){
         txtString.setText("xZGJtaeSlTaN");   
        } 
    if(txtClient.getText().toLowerCase().contains("gorilla")){
         txtString.setText("gorilla/Main");   
        } 
    if(txtClient.getText().toLowerCase().contains("l4st")){
        txtString.setText("owner/creator");   
       } 
     if(txtClient.getText().toLowerCase().contains("incognito")){
        txtString.setText("czaarek99");   
       } 
     if(txtClient.getText().toLowerCase().contains("drek")){
        txtString.setText("cHV0");   
       } 
     if(txtClient.getText().toLowerCase().contains("autoupdate")){
        txtString.setText("getURLUpdate");   
       } 
     if(txtClient.getText().toLowerCase().contains("version")){
        txtString.setText("v0.3");   
       } 
     if(txtClient.getText().toLowerCase().contains("javaedit")){
        txtString.setText("bjb/bjc/bje.class");   
       } 
     if(txtClient.getText().toLowerCase().contains("timechanger")){
        txtString.setText("urldecoder / decompiler");
     }
     if(txtClient.getText().toLowerCase().contains("cosmic")){
        txtString.setText("Decompilar o arquivo!");
     }
      if(txtClient.getText().toLowerCase().contains("executar")){
        txtString.setText("recent / prefetch");
     }
      if(txtClient.getText().toLowerCase().contains("win r") || txtClient.getText().toLowerCase().contains("winr") || txtClient.getText().toLowerCase().contains("win+r")){
        txtString.setText("Digite executar!");
        
     }
       if(txtClient.getText().toLowerCase().contains("iridium") || txtClient.getText().toLowerCase().contains("winr") || txtClient.getText().toLowerCase().contains("win+r")){
        txtString.setText("&AD4(X");

     }
     
    }
    @FXML
    void searchButton(ActionEvent event){
      try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://" + txtSearch + "/");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }  
    }
     @FXML
    void bypassButton(ActionEvent event){
        try {
            Runtime.getRuntime().exec("cmd /c start \"\" sc.bat");
        } catch (IOException ex) {
            Logger.getLogger(MainSoftHelperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @FXML
    void anyDesk(ActionEvent event){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://anydesk.pt/download/");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }
        
    }
    @FXML
    void processHacker(ActionEvent event){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://processhacker.sourceforge.io/");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }
        
    }
        @FXML
    void packDownload(ActionEvent event) throws Exception{
        Parent root4 = FXMLLoader.load(getClass().getResource("packDownload.fxml"));
       
        Scene scene = new Scene(root4);
        Stage stage = new Stage();
        stage.setTitle("Mercury Download Pack");
        stage.getIcons().add(new Image("/imagens/Logo.jpg_256x256.png"));
    }
   

    @FXML
    void initialize() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'MainSoftHelper.fxml'.";
        assert googleButton != null : "fx:id=\"googleButton\" was not injected: check your FXML file 'MainSoftHelper.fxml'.";

    }
    }
