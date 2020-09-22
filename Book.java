/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Zach Theis
 * @version Sept 21, 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * This satisfies part of 2.83
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
        /**
     * Provide access to the string holding the book's title
     * This satisfies part of 2.83
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Provides access to the integer value stored in pages
     * This satisfies 2.85
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Tells the use the name of the book's author
     * This satisfies part of 2.84
     */
    public void printAuthor()
    {
        System.out.println("The author of this book is " + author);
    }
 
    /**
     * Tells the use the name of the book's title
     * This satisfies part of 2.84
     */    
    public void printTitle()
    {
        System.out.println("The title of this book is " + title);
    }
    
    
    
    
    
}
