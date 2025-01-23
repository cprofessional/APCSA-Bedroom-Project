package furniture;

import accessories.Pants;
import accessories.Shirt;
import accessories.Shoe;

public class Closet {

    private Pants[] pants;
    private Shirt[] shirts;
    private Shoe[] shoes;

    /**
     * @param pants the array of pants in the closet
     * @param shirts the array of shirts in the closet
     * @param shoes the array of shoes in the closet
     */
    public Closet(Pants[] pants, Shirt[] shirts, Shoe[] shoes) {
        this.pants = pants;
        this.shirts = shirts;
        this.shoes = shoes;
    }

    /**
     * @return the array of pants in the closet
     */
    public Pants[] getPants() {
        return pants;
    }

    /**
     * @param pants the new array of pants to set in the closet
     */
    public void setPants(Pants[] pants) {
        this.pants = pants;
    }

    /**
     * @return the array of shirts in the closet
     */
    public Shirt[] getShirts() {
        return shirts;
    }

    /**
     * @param shirts the new array of shirts to set in the closet
     */
    public void setShirts(Shirt[] shirts) {
        this.shirts = shirts;
    }

    /**
     * @return the array of shoes in the closet
     */
    public Shoe[] getShoes() {
        return shoes;
    }

    /**
     * @param shoes the new array of shoes to set in the closet
     */
    public void setShoes(Shoe[] shoes) {
        this.shoes = shoes;
    }

    /**
    * @return a string representation of the Closet object
    */
    public String toString() {
        return "Closet {" +
                "\n  pants=" + (pants != null ? pants.length : 0) + " pairs of pants" +
                "\n  shirts=" + (shirts != null ? shirts.length : 0) + " shirts" +
                "\n  shoes=" + (shoes != null ? shoes.length : 0) + " pairs of shoes" +
                "\n}";
    }

}
