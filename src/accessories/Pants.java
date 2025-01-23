package accessories;

import java.awt.Color;

public class Pants {

    private float size;
    private Color color;
    private String brand;

    /**
     * @param size the size of the pants
     * @param color the color of the pants
     * @param brand the brand of the pants
     */
    public Pants(float size, Color color, String brand) {
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    /**
     * @return the size of the pants
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the new size of the pants
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the color of the pants
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the pants
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the brand of the pants
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the new brand of the pants
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void wearPants() {
        System.out.println("Those pants are swag");
    }
}
