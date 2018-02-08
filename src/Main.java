import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import main.periodictable.Element;
import main.periodictable.PeriodicTable;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Text elementInfo = new Text();

    @Override
    public void start(Stage stage) {

        // Create new TextField
        TextField elementField = new TextField();

        // Create new Button
        Button displayButton = new Button("See Info");
        displayButton.setOnAction (new EventHandler<ActionEvent>() {
           public void handle (ActionEvent e) {
               elementInfo.setText(PeriodicTable.getElementInfo(Element.HELIUM));
           }
        });


        VBox root = new VBox();
        root.getChildren().addAll(elementField, displayButton);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }
}
