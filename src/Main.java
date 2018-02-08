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

    public void printMessage (String input) {
        String elementName = input.toUpperCase();

        switch (elementName) {
            //TODO: Add all cases for elementName, and modify elementInfo
        }
    }

    Text elementInfo = new Text();

    @Override
    public void start(Stage stage) {

        // Create new TextField
        TextField elementField = new TextField();
        elementField.setPrefColumnCount(12);

        // Create new Button
        Button displayButton = new Button("See Info");
        displayButton.setOnAction (new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
               printMessage(elementField.getText());
           }
        });

        // Create the VBox
        VBox root = new VBox();
        root.getChildren().addAll(elementField, displayButton, elementInfo);
        root.setMinSize(350, 250);

        /*
         * Set the padding of the VBox
         * Set the border-style of the VBox
         * Set the border-width of the VBox
         * Set the border-insets of the VBox
         * Set the border-radius of the VBox
         * Set the border-color of the VBox
         */
        root.setStyle("-fx-padding: 20;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 5;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: black;");

        // Create the Scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Periodic Table");
        stage.show();
    }
}
