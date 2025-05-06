package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;

public class GameObjectFactory {
    public static UIButton createUIButton(GraphicsContext gc, double x, double y, double width, double height, String imagePath, Runnable action) {
        return new UIButton(gc, x, y, width, height, imagePath, action);
    }
    
    public static Background createBackground(GraphicsContext gc, String imagePath) {
        return new Background(gc, 0, 0, imagePath);
    }
    
    public static Planet createPlanet(GraphicsContext gc, double x, double y, double width, double height, String imagePath, String name, int correctSlot) {
        return new Planet(gc, x, y, width, height, imagePath, name, correctSlot);
    }

    public static PlanetSlot createPlanetSlot(GraphicsContext gc, double x, double y, double width, double height, String imagePath, int slot) {
        return new PlanetSlot(gc, x, y, width, height, imagePath, slot);
    }
}

