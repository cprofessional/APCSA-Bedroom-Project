package furniture;

import technology.Computer;
import technology.IPhone;
import technology.Monitor;

public class Desk {

    private IPhone phone;
    private Chair chair;
    private Computer[] computers;
    private Monitor[] monitors;

    /**
     * @param phone the IPhone object to set on the desk
     * @param ch the Chair to set as a sub-chair
     * @param c the array of Computer objects to set
     * @param m the array of Monitor objects to set
     */
    public Desk(IPhone phone, Chair ch, Computer[] c, Monitor[] m) {
        this.phone = phone;
        this.chair = ch;
        this.computers = c;
        this.monitors = m;
    }

    /**
     * @return the IPhone object on the desk
     */
    public IPhone getPhone() {
        return phone;
    }

    /**
     * @param phone the new IPhone object to set on the desk
     */
    public void setPhone(IPhone phone) {
        this.phone = phone;
    }

    /**
     * @return the sub-chair object
     */
    public Chair getChair() {
        return chair;
    }

    /**
     * @param chair the new sub-chair to set
     */
    public void setDesk(Chair chair) {
        this.chair = chair;
    }

    /**
     * @return the array of Computer objects
     */
    public Computer[] getComputers() {
        return computers;
    }

    /**
     * @param computers the new array of Computer objects to set
     */
    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    /**
     * @return the array of Monitor objects
     */
    public Monitor[] getMonitors() {
        return monitors;
    }

    /**
     * @param monitors the new array of Monitor objects to set
     */
    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }

    /**
     * @return a simple string representation of the Desk object
     */
    public String toString() {
        return "Desk {" +
                "\n  phone=" + phone +
                "\n  chair=" + chair +
                "\n  " + (computers != null ? computers.length : 0) + " computers" +
                "\n  " + (monitors != null ? monitors.length : 0) + " monitors" +
                "\n}";
    }
}
