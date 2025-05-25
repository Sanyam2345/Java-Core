/**
 * @author SANYAM
 * @version 2.O
 * @since 2025
 */
package JavaDocAndAnnotation;

/**
 * @author SANYAM
 * Class for Library Book
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parametrized Constructor
     * @param s This is book name
     */
    public Book(String s) {}

    /**
     * Issue a book to a student
     * @param roll Roll no of a student
     * @throws Exception Throws Exception if book is not available
     */
    public void issue(int roll) throws Exception {}

    /**
     * Check if book is available
     * @param str Book name
     * @return if book is available then returns true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Gets the name of the Book
     * @param id Book id
     * @return returns book name
     */
    public String getName (int id) {
        return "";
    }
}
