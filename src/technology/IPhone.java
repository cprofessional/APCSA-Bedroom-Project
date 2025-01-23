package technology;

import java.awt.Color;
import java.util.ArrayList;

public class IPhone {

    private ArrayList<String> appNames;
    private String model;
    private Color color;

    /**
     * @param appNames the array of app names installed on the IPhone
     * @param model the model of the IPhone
     * @param color the color of the IPhone
     */
    public IPhone(ArrayList<String> appNames, String model, Color color) {
        this.appNames = appNames;
        this.model = model;
        this.color = color;
    }

    /**
     * @param model the model of the IPhone
     * @param color the color of the IPhone
     */
    public IPhone(String model, Color color) {
        this.model = model;
        this.color = color;
    } 

    /**
     * @return the array of app names
     */
    public ArrayList<String> getAppNames() {
        return appNames;
    }

    /**
     * @param appNames the new array of app names to set
     */
    public void setAppNames(ArrayList<String> appNames) {
        this.appNames = appNames;
    }

    /**
     * @return the model of the IPhone
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the new model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color of the IPhone
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public void useApp() {
        int index = (int)(appNames.size()-1 * Math.random());
        System.out.println("You are now using " + appNames.get(index));
    }

    /**
 * @return a string representation of the IPhone object
 */
    public String toString() {
        return "IPhone {" +
                "appNames=" + appNames +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
