package furniture;

import java.awt.Color;

public class Bed {

    private Color color;
    private int size;
    private String model;

        /**
     * @param color the color of the bed
     * @param size the size of the bed
     * @param model the model of the bed
     */

    public Bed() {
        this.color = new Color(0, 0, 0);
        this.size = 10;
        this.model = "Sony";
    }

    public Bed(Color color, int size, String model) {
        this.color = color;
        this.size = size;
        this.model = model;
    }

    /**
     * @return the color of the bed
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the bed
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the size of the bed
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the new size of the bed
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the model of the bed
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the new model of the bed
     */
    public void setModel(String model) {
        this.model = model;
    }

    public void sleep() {
        System.out.println("You slept the night away!");
    }

    /**
    * @return a string representation of the Bed object
    */
    public String toString() {
        return "Bed {" +
                "\n  color=" + color +
                "\n  size=" + size +
                "\n  model='" + model + '\'' +
                "\n}";
    }
}