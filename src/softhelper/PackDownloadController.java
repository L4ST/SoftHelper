package softhelper;

import com.jfoenix.controls.JFXButton;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PackDownloadController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton buttonDownload;
    
    @FXML 
    void buttonDownload(ActionEvent event){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://loja.mercuryscreenshare.com.br/wp-content/uploads/2018/07/Pacote_Mercury.zip");
            desktop.browse(oURL);
            } catch (IOException | URISyntaxException e) {
            }   
    }

    @FXML
    void initialize() {
        assert buttonDownload != null : "fx:id=\"buttonDownload\" was not injected: check your FXML file 'packDownload.fxml'.";

    }
}
