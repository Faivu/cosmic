package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Background extends GameObject {

    public Background(GraphicsContext gc, double x, double y, String imagePath) {
        super(gc, x, y);
        this.img = new Image(getClass().getResource(imagePath).toExternalForm());
    }

    @Override
    public void update() {
        gc.drawImage(img, x, y, 800, 600);  // Draw background full screen
    }
}