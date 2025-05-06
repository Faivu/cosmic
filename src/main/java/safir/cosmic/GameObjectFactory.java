package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;

public class GameObjectFactory {
    public static UIButton createUIButton(GraphicsContext gc, double x, double y, double width, double height, String imagePath, Runnable action) {
        return new UIButton(gc, x, y, width, height, imagePath, action);
    }
    
    public static Background createBackground(GraphicsContext gc, String path) {
        return new Background(gc, 0, 0, path);
    }
}

