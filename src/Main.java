import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import main.periodictable.Element;
import main.periodictable.PeriodicTable;

public class Main extends Application {

    private Text elementInfo = new Text();

    // Sets the text of elementInfo to the information of the element entered by the user
    private void printMessage (String input) {
        String elementName = input.toUpperCase();
        Element element;

        switch (elementName) {
            case "HYDROGEN":
                element = Element.HYDROGEN;
                break;
            case "HELIUM":
                element = Element.HELIUM;
                break;
            case "LITHIUM":
                element = Element.LITHIUM;
                break;
            case "BERYLLIUM":
                element = Element.BERYLLIUM;
                break;
            case "BORON":
                element = Element.BORON;
                break;
            case "CARBON":
                element = Element.CARBON;
                break;
            case "NITROGEN":
                element = Element.NITROGEN;
                break;
            case "OXYGEN":
                element = Element.OXYGEN;
                break;
            case "FLUORINE":
                element = Element.FLUORINE;
                break;
            case "NEON":
                element = Element.NEON;
                break;
            case "SODIUM":
                element = Element.SODIUM;
                break;
            case "MAGNESIUM":
                element = Element.MAGNESIUM;
                break;
            case "ALUMINUM":
                element = Element.ALUMINUM;
                break;
            case "SILICON":
                element = Element.SILICON;
                break;
            case "PHOSPHOROUS":
                element = Element.PHOSPHOROUS;
                break;
            case "SULFUR":
                element = Element.SULFUR;
                break;
            case "CHLORINE":
                element = Element.CHLORINE;
                break;
            case "ARGON":
                element = Element.ARGON;
                break;
            default:
                element = null;
        }

        // An exception is thrown when the user enters a non-existing element
        // In this case, elementInfo is set to "%s is not an element!"
        try {
            elementInfo.setText(PeriodicTable.getElementInfo(element));
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
            System.out.println(npe.getStackTrace());
            elementInfo.setText(String.format("%s is not an element!", input.toLowerCase()));
        }
    }

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

    public static void main(String[] args) {
        launch(args);
    }
}
