import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class must be subclassed to use its functionality.
 * @author Leo Ureel
 */
public abstract class FileLabAbstract implements FileLabInterface {
   /**
    * Counts the total number of words in the file.
    *
    * @param file - the file to read from
    * @return - the number of words in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long wordCount ( File file ) throws FileNotFoundException {
      long count = 0L; // number of words
      Scanner scanner = new Scanner( file );
      while( scanner.hasNext() ) {
         String word = scanner.next();
         count++;
      }
      return count;
   }

   /**
    * Counts the number of lines in the file.
    *
    * @param file - the file to read from
    * @return - the number of lines in the file
    * @throws - FileNotFoundException when the file does not exist.
    */
   public long lineCount ( File file ) throws FileNotFoundException {
      long count = 0L; // number of lines
      Scanner scanner = new Scanner( file );
      while( scanner.hasNextLine() ) {
         String word = scanner.nextLine();
         count++;
      }
      return count;
   }

}
