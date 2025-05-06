package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Level1 implements Level {
    private Background background;
    private List<Planet> planets = new ArrayList<>();
    private List<PlanetSlot> slots = new ArrayList<>();
    private static final String placeholderImg = "/start_btn.png";

    private double currentMouseX = 0;
    private double currentMouseY = 0;

    @Override
    public void enter(GraphicsContext gc) {
        background = GameObjectFactory.createBackground(gc, "/level_background.png");

        PlanetSlot mercurySlot = GameObjectFactory.createPlanetSlot(gc, 100, 200, 100, 100, "/holder.png", 1);
        Planet mercury = GameObjectFactory.createPlanet(gc, 100, 350, 100, 100, "/mercury.png", "Mercury", 1);

        PlanetSlot venusSlot = GameObjectFactory.createPlanetSlot(gc, 250, 200, 100, 100, "/holder.png", 2);
        Planet venus = GameObjectFactory.createPlanet(gc, 250, 350, 100, 100, "/venus.png", "Venus", 2);

        PlanetSlot earthSlot = GameObjectFactory.createPlanetSlot(gc, 400, 200, 100, 100, "/holder.png", 3);
        Planet earth = GameObjectFactory.createPlanet(gc, 400, 350, 100, 100, "/earth.png", "Earth", 3);

        PlanetSlot marsSlot = GameObjectFactory.createPlanetSlot(gc, 550, 200, 100, 100, "/holder.png", 4);
        Planet mars = GameObjectFactory.createPlanet(gc, 550, 350, 100, 100, "/mars.png", "Mars", 4);

        slots.add(mercurySlot);
        planets.add(mercury);

        slots.add(venusSlot);
        planets.add(venus);

        slots.add(earthSlot);
        planets.add(earth);

        slots.add(marsSlot);
        planets.add(mars);
    }

    @Override
    public void update(GraphicsContext gc) {
        background.update();

        for (PlanetSlot slot : slots) slot.draw();
        for (Planet planet : planets) {
            planet.drag(currentMouseX, currentMouseY);
            planet.draw();
        }
    }

    @Override
    public boolean handleClick(MouseEvent e) {
        currentMouseX = e.getX();
        currentMouseY = e.getY();

        for (Planet planet : planets)
            if (planet.handleClick(e)) return true;

        return false;
    }

    @Override
    public void exit() {
        
    }
}