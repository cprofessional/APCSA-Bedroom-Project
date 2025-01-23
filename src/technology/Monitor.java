package technology;

import java.awt.Color;

public class Monitor {

    private float resolution;
    private Color color;
    private String model;

    /**
     * @param resolution the resolution of the monitor
     * @param color the color of the monitor
     * @param model the model of the monitor
     */
    public Monitor(float resolution, Color color, String model) {
        this.resolution = resolution;
        this.color = color;
        this.model = model;
    }

    /**
     * @return the resolution of the monitor
     */
    public float getResolution() {
        return resolution;
    }

    /**
     * @param resolution the new resolution of the monitor
     */
    public void setResolution(float resolution) {
        this.resolution = resolution;
    }

    /**
     * @return the color of the monitor
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the monitor
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the model of the monitor
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the new model of the monitor
     */
    public void setModel(String model) {
        this.model = model;
    }
}
