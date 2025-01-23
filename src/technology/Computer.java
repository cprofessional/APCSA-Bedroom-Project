package technology;

import java.awt.Color;
import java.util.ArrayList;

public class Computer {

    private ArrayList<String> appNames;
    private String model;
    private Color color;

    /**
     * @param appNames the array of app names installed on the computer
     * @param model the model of the computer
     * @param color the color of the computer
     */
    public Computer(ArrayList<String> appNames, String model, Color color) {
        this.appNames = appNames;
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
     * @return the model of the computer
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
     * @return the color of the computer
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
}
