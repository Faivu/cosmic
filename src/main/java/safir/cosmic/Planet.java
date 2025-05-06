package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class Planet extends InteractiveObject {
    private int correctSlotId;
    private boolean beingDragged = false;

    public Planet(GraphicsContext gc, double x, double y, double width, double height, String imagePath, String name, int correctSlotId) {
        super(gc, x, y, width, height);
        this.img = new Image(getClass().getResource(imagePath).toExternalForm());
        this.correctSlotId = correctSlotId;
    }

    public void draw() {
        gc.drawImage(img, x, y, getWidth(), getHeight());
    }

    public boolean handleClick(MouseEvent e) {
        double mx = e.getX();
        double my = e.getY();
        boolean clicked = mx >= x && mx <= x + getWidth() && my >= y && my <= y + getHeight();
        if (clicked) {
            beingDragged = !beingDragged;
            return true;
        }
        return false;
    }

    public void drag(double mouseX, double mouseY) {
        if (beingDragged) {
            this.x = mouseX - getWidth() / 2;
            this.y = mouseY - getHeight() / 2;
        }
    }

    public int getCorrectSlotId() {
        return correctSlotId;
    }
}