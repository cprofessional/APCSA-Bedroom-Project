package furniture;

import java.awt.Color;

import accessories.Book;

public class Bookshelf {

    private int numberOfShelves;
    private Color color;
    private Book[][] books;

    /**
     * @param numberOfShelves the number of shelves in the bookshelf
     * @param color the color of the bookshelf
     */
    public Bookshelf(int numberOfShelves, Color color) {
        this.numberOfShelves = numberOfShelves;
        this.color = color;
        this.books = new Book[numberOfShelves][];
    }

    /**
     * @return the number of shelves in the bookshelf
     */
    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    /**
     * @param numberOfShelves the new number of shelves in the bookshelf
     */
    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
        this.books = new Book[numberOfShelves][]; // Resize book storage
    }

    /**
     * @return the color of the bookshelf
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the new color of the bookshelf
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @param shelfIndex the index of the shelf to add the book to
     * @param book the book to add to the shelf
     */
    public void addBookToShelf(int shelfIndex, Book book) {
        if (shelfIndex < 0 || shelfIndex >= numberOfShelves) {
            throw new IndexOutOfBoundsException("Invalid shelf index.");
        }

        if (books[shelfIndex] == null) {
            books[shelfIndex] = new Book[1];
            books[shelfIndex][0] = book;
        } else {
            Book[] updatedShelf = new Book[books[shelfIndex].length + 1];
            System.arraycopy(books[shelfIndex], 0, updatedShelf, 0, books[shelfIndex].length);
            updatedShelf[books[shelfIndex].length] = book;
            books[shelfIndex] = updatedShelf;
        }
    }

    /**
    * @return a string representation of the Bookshelf object
    */
    public String toString() {
        return "Bookshelf {" +
                "\n  numberOfShelves=" + numberOfShelves +
                "\n  color=" + color +
                "\n  books=" + (books != null ? books.length : 0) + " shelves of books"+
                "\n}";
    }
}