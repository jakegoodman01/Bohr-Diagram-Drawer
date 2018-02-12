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
        gc.fillText(element.getSymbol(), 120, 130);

        // Drawing the orbits and electrons
        int x = 100;
        int y = 70;
        int width = 100;
        for (int i = 1; i <= element.getNumOfOrbits(); i++) {
            // This loop runs for the number of electrons on the current orbit
            for (int j = 1; j <= element.getElectronDistribution().get(i); j++) {
                switch (j) {
                    case 1:
                        gc.fillOval(x + width / 2 - 8, y - 4, 8, 8);
                        break;
                    case 2:
                        gc.fillOval(x + width / 2 - 8, y + width - 4, 8, 8);
                        break;
                    case 3:
                        gc.fillOval(x + width - 4, y + width / 2 - 8, 8, 8);
                        break;
                    case 4:
                        gc.fillOval(x - 4, y + width / 2 - 8, 8, 8);
                        break;
                    case 5:
                        gc.fillOval(x + width / 2 + 8, y - 4, 8, 8);
                        break;
                    case 6:
                        gc.fillOval(x + width / 2 + 8, y + width - 4, 8, 8);
                        break;
                    case 7:
                        gc.fillOval(x + width - 4, y + width / 2 + 8, 8, 8);
                        break;
                    case 8:
                        gc.fillOval(x - 4, y + width / 2 + 8, 8, 8);
                        break;
                }

            }

            gc.strokeOval(x, y, width, width);
            x -= 20;
            y -= 20;
            width += 40;
        }
    }

    public void drawError(GraphicsContext gc) {
    }
}
