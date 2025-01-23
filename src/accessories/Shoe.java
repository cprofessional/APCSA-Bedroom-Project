package accessories;

import java.awt.Color;

public class Shoe {

    private float size;
    private Color color;
    private String brand;

    /**
     * @param size the size of the shoe
     * @param color the color of the shoe
     * @param brand the brand of the shoe
     */
    public Shoe(float size, Color color, String brand) {
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    /**
     * @return the size of the shoe
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the new size of the shoe
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the color of the shoe
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the shoe
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the brand of the shoe
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the new brand of the shoe
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void wearShoe() {
        System.out.println("Those shoes are swag");
    }
}
