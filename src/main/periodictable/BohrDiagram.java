package main.periodictable;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BohrDiagram {

    private static Element element;

    public BohrDiagram (Element element) {
        this.element = element;
    }

    public void drawElement(GraphicsContext gc) throws NullPointerException {

        // Clear the canvas
        gc.clearRect(0, 0, 500, 500);

        // Set the color to black and the font to Helvetica
        gc.setStroke(Color.BLACK);
        gc.setFont(new Font("Helvetica", 50));

        // Draws the element symbol
        gc.fillText(element.getSymbol(), 120, 100);

        // Drawing the orbits and electrons
        int x = 100;
        int y = 40;
        int width = 100;
        for (int i = 1; i <= element.getNumOfOrbits(); i++) {
            gc.strokeOval(x, y, width, width);
            x -= 20;
            y -= 20;
            width += 40;

            // This loop runs for the number of electrons on the current orbit
            for (int j = 1; j <= element.getElectronDistribution().get(i); j++) {
                // TODO: Draw the electrons on the corresponding orbits
            }
        }
    }

    public void drawError(GraphicsContext gc) {
    }
}
