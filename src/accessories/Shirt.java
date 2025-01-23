package accessories;

import java.awt.Color;

public class Shirt {

    private float size;
    private Color color;
    private String brand;

    /**
     * @param size the size of the shirt
     * @param color the color of the shirt
     * @param brand the brand of the shirt
     */
    public Shirt(float size, Color color, String brand) {
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    /**
     * @return the size of the shirt
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the new size of the shirt
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the color of the shirt
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the shirt
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the brand of the shirt
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the new brand of the shirt
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void wearShirt() {
        System.out.println("That shirt is swag");
    }

}
