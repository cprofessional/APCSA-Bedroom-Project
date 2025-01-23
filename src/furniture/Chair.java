package furniture;

import java.awt.Color;

public class Chair {

    private Color color;
    private int size;
    private String model;

    /**
     * @param color the color of the chair
     * @param size the size of the chair
     * @param model the model of the chair
     */
    public Chair(Color color, int size, String model) {
        this.color = color;
        this.size = size;
        this.model = model;
    }

    /**
     * @return the color of the chair
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the chair
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the size of the chair
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the new size of the chair
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the model of the chair
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the new model of the chair
     */
    public void setModel(String model) {
        this.model = model;
    }

    public void sit() {
        System.out.println("You sat in the chair!");
    }

    /**
 * @return a string representation of the Chair object
 */
    public String toString() {
        return "Chair {" +
                "color=" + color +
                ", size=" + size +
                ", model='" + model + '\'' +
                '}';
    }
}
