package top.yanquithor.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import top.yanquithor.util.RuntimeParam;
import java.io.File;

public class Applicative extends Application {
    
    private static final RuntimeParam param = RuntimeParam.getObject();
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(new File("src/main/resources/top.yanquithor.fxml/first.fxml").toURI().toURL());
        Scene scene = new Scene(loader.load());
        stage.setTitle(param.getLanguage().getProperty("login.win.title"));
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
