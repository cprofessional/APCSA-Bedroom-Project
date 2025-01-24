import java.awt.Color;
import java.util.ArrayList;

import accessories.Book;
import accessories.Pants;
import accessories.Shirt;
import accessories.Shoe;
import furniture.Bed;
import furniture.Bookshelf;
import furniture.Chair;
import furniture.Closet;
import furniture.Desk;
import technology.Computer;
import technology.IPhone;
import technology.Monitor;

/**
 * The Bedroom class represents a room containing furniture, accessories, and technology.
 * It provides methods to construct and display the components of the bedroom.
 */
class Bedroom {

    private Bed bed;
    private Closet closet;
    private Desk desk;
    private Bookshelf bookshelf;

    /**
     * The main method to demonstrate the construction of a Bedroom object.
     */
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom();

        bedroom.constructBedroom();

        System.out.println(bedroom);
    }

    /**
     * Constructs the main components of the bedroom: bed, closet, desk, and bookshelf.
     */
    public void constructBedroom() {
        this.bed = new Bed(new Color(135, 206, 250), 14, "Purple");
        this.closet = constructCloset();
        this.desk = constructDesk();
        this.bookshelf = constructBookshelf();
    }

    /**
     * Constructs a Bookshelf object and populates it with books.
     * 
     * @return A fully constructed Bookshelf object.
     */
    public Bookshelf constructBookshelf() {
        Bookshelf bookshelf = new Bookshelf(8, new Color(0, 0, 0));

        bookshelf.addBookToShelf(1, new Book("1984", "George Orwell", 328));
        bookshelf.addBookToShelf(2, new Book("To Kill a Mockingbird", "Harper Lee", 281));
        bookshelf.addBookToShelf(0, new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));

        return bookshelf;
    }

    /**
     * Constructs a Desk object with associated components like a chair, phone, computers, and monitors.
     * 
     * @return A fully constructed Desk object.
     */
    public Desk constructDesk() {
        Chair chair = new Chair(new Color(0, 0, 0), 2, "Walker");

        // ArrayList
        ArrayList<String> globalApps = new ArrayList<String>();
        globalApps.add("Roblox");
        globalApps.add("VS-Code");
        globalApps.add("Google Classroom");
        globalApps.add("Fortnite");

        IPhone phone = new IPhone(globalApps, "15 Pro Max", new Color(0, 0, 0));

        Computer mac = new Computer(globalApps, "Apple", new Color(225, 225, 225));
        Computer windows = new Computer(globalApps, "Custom", new Color(0, 0, 0));
        Computer lunix = new Computer(globalApps, "Custom", new Color(0, 0, 0));

        // 1D Array
        Computer[] computerArr = {mac, windows, lunix};

        Monitor monitor = new Monitor(60, new Color(0, 0, 0), "Dell");
        Monitor[] monitorArr = new Monitor[3];

        // I own three of the same monitor!
        for (int i = 0; i < 3; i++) {
            monitorArr[i] = monitor;
        }

        return new Desk(phone, chair, computerArr, monitorArr);
    }

    /**
     * Constructs a Closet object with shirts, pants, and shoes.
     * 
     * @return A fully constructed Closet object.
     */
    public Closet constructCloset() {
        Shirt whiteShirt = new Shirt(15, new Color(225, 225, 225), "Nike");
        Shirt blackShirt = new Shirt(15, new Color(0, 0, 0), "Puma");

        Pants whitePants = new Pants(15, new Color(225, 225, 225), "Nike");
        Pants blackPants = new Pants(15, new Color(0, 0, 0), "Puma");

        Shoe jordans = new Shoe(12, new Color(0, 123, 232), "Nike");

        Shirt[] shirtArr = {whiteShirt, blackShirt};
        Pants[] pantsArr = {whitePants, blackPants};
        Shoe[] shoeArr = {jordans};

        return new Closet(pantsArr, shirtArr, shoeArr);
    }

    /**
     * Provides a string representation of the Bedroom object, including all its components.
     * 
     * @return A string representation of the bedroom's components.
     */
    public String toString() {
        return desk.toString() +
            "\n" + bookshelf.toString() +
            "\n" + closet.toString() +
            "\n" + bed.toString();
    }
}
