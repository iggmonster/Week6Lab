import java.io.File;
import java.io.FileNotFoundException;

/**
 * Interface defining several methods for counting various contents of a file.
 * @author Leo Ureel
 */
public interface FileLabInterface {
   /**
    * Counts the number of characters in a file.
    * Count should include whitespace and other non-printing characters.
    * Hint: Scanner.useDelimiter("") can be used to read one character at a time from a file.
    * @param file - the file to read from
    * @return - the number of characters in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long charCount ( File file ) throws FileNotFoundException;

   /**
    * Counts the total number of words in the file.
    * @param file - the file to read from
    * @return - the number of words in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long wordCount ( File file ) throws FileNotFoundException;

   /**
    * Counts the number of unique words in the file.
    * Ignore the case of the words.
    *
    * For example,
    *    if the file contains the string "The quick brown fox jumped over the lazy dog",
    *    Then there are 8 unique words, with the word "the" being repeated.
    *
    * @param file - the file to read from
    * @return - the number of unique words in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long uniqueWordCount ( File file ) throws FileNotFoundException;

   /**
    * Counts the number of lines in the file.
    * @param file - the file to read from
    * @return - the number of lines in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long lineCount ( File file ) throws FileNotFoundException;

   /**
    * @see File
    * @param file - the file to read from
    * @return - the length of the file in bytes
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long fileLength ( File file ) throws FileNotFoundException;
}
