package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PlanetSlot extends InteractiveObject {
    private int slotId;

    public PlanetSlot(GraphicsContext gc, double x, double y, double width, double height, String imagePath, int slotId) {
        super(gc, x, y, width, height);
        this.slotId = slotId;
        this.img = new Image(getClass().getResource(imagePath).toExternalForm());
    }

    public void draw() {
        gc.drawImage(img, x, y, getWidth(), getHeight());
    }

    public int getSlotId() {
        return slotId;
    }
}