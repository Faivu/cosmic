package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;

public class InteractiveObject extends GameObject {
	public InteractiveObject(GraphicsContext gc, double x, double y, double width, double height) {
		super(gc, x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	private double width;
	private double height;

}
