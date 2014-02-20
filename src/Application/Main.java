/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author epc-sarkis
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene=new Scene(grid,275,275);
		
		Text scenetitle=new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
		grid.add(scenetitle, 0, 0,2,1);
		scenetitle.getStyleClass().add("scenetitle");
		
		Label userName=new Label("User Name:");
		grid.add(userName, 0, 1);
		
		TextField userTextField=new TextField();
		grid.add(userTextField,1,1);
		
		Label pw=new Label("Password");
		grid.add(pw, 0, 2);
		
		PasswordField pwBox=new PasswordField();
		grid.add(pwBox, 1, 2);
		
		grid.setGridLinesVisible(true);
		primaryStage.setScene(scene);
		scene.getStylesheets().add(getClass()
                     .getResource("application.css").toExternalForm());
		primaryStage.show();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
}
