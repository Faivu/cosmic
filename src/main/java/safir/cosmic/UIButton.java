package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class UIButton extends InteractiveObject {
    private Runnable onClick;

    public UIButton(GraphicsContext gc, double x, double y, double width, double height, String imagePath, Runnable onClick) {
        super(gc, x, y, width, height);
        this.img = new Image(getClass().getResource(imagePath).toExternalForm());
        this.onClick = onClick;
    }

    public void draw() {
        gc.drawImage(img, x, y, getWidth(), getHeight());
    }

    
    public boolean handleClick(MouseEvent e) {
        double mx = e.getX();
        double my = e.getY();
        
        boolean isInside =
            mx >= x && mx <= x + getWidth() &&
            my >= y && my <= y + getHeight();

        if (isInside && onClick != null) {
            onClick.run();
            return true;
        }
        return false;
    }
}