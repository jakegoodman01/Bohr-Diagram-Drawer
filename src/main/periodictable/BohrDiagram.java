package main.periodictable;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BohrDiagram {

    private static Element element;

    public BohrDiagram (Element element) {
        this.element = element;
    }

    public static void draw (GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setFont(new Font("Helvetica", 50));

        gc.fillText("He", 120, 160);

        int upperBound = 100;
        int width = 100;
        for (int i = 0; i < element.getNumOfOrbits(); i++) {
            gc.strokeOval(upperBound, upperBound, width, width);
            upperBound -= 20;
            width += 40;
        }
    }
}
