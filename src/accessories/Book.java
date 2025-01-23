package accessories;

public class Book {

    private String title;
    private String author;
    private int pages;

    /**
     * @param title the title of the book
     * @param author the author of the book
     * @param pages the number of pages in the book
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    /**
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    public void readBook() {
        System.out.println("You just read " + title);
    }

    /**
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the number of pages in the book
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the new number of pages in the book
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}
