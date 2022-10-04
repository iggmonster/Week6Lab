import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Test Suite for the Week 5 Lab
 */
public class FileLabTest {
   // -----------------------------------
   // Create tests for fileLab.wordCount
   // -----------------------------------

   public long wordCount(File file) throws FileNotFoundException {
      return 0;
   }
   // -----------------------------------------
   // Create tests for fileLab.uniqueWordCount
   // -----------------------------------------

   public long uniqueWordCount(File file) throws FileNotFoundException {
      return 0;
   }


   // DO NOT CHANGE ANYTHING BELOW THIS LINE
   // =======================================================================

   // -----------------------------------------
   // Create tests for fileLab.charCount
   // -----------------------------------------
   /**
    * Tests file file_that_does_not_exist, expects FileNotFoundException
    * @throws FileNotFoundException
    */
   @Test
   public void charCount0 ( ) {
      FileLabInterface fileLab = new FileLab();
      String filename = "FILE_THAT_DOES_NOT_EXIST"; // DO NOT ADD THIS FILE TO YOUR FILE SYSTEM
      File file = new File( filename );
      try {
         long result = fileLab.charCount( file );
         fail( String.format(
              "FAIL: fileLab.charCount(FILE: %s) returned %d, expected a FileNotFoundException.",
              filename, result ) );
      } catch (FileNotFoundException e) {
         // Expected - do nothing
      }
   }

   /**
    * Tests file empty.txt, expects 0 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount1 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "empty.txt";
      File file = new File( filename );
      long expected = 0;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file MarcAntony.txt, expects 1417 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount2 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "MarcAntony.txt";
      File file = new File( filename );
      long expected = 1417;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file one0line.txt, expects 43 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount3 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "one-line.txt";
      File file = new File( filename );
      long expected = 43;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file PhoneBook.txt, expects 84 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount4 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "PhoneBook.txt";
      File file = new File( filename );
      long expected = 84;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file pirate_dictionary.txt, expects 1702 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount5 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "pirate_dictionary.txt";
      File file = new File( filename );
      long expected = 1702;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file xanadu.txt, expects 148 characters
    * @throws FileNotFoundException
    */
   @Test
   public void charCount6 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "xanadu.txt";
      File file = new File( filename );
      long expected = 148;
      long result = fileLab.charCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.charCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   // -----------------------------------------
   // Create tests for fileLab.lineCount
   // -----------------------------------------
   /**
    * Tests file file_that_does_not_exist, expects FileNotFoundException
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount0 ( ) {
      FileLabInterface fileLab = new FileLab();
      String filename = "FILE_THAT_DOES_NOT_EXIST"; // DO NOT ADD THIS FILE TO YOUR FILE SYSTEM
      File file = new File( filename );
      try {
         long result = fileLab.lineCount( file );
         fail( String.format(
              "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected a FileNotFoundException.",
              filename, result ) );
      } catch (FileNotFoundException e) {
         // Expected - do nothing
      }
   }

   /**
    * Tests file empty.txt, expects 0 lines
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount1 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "empty.txt";
      File file = new File( filename );
      long expected = 0;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file MarcAntony.txt, expects 35 lines
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount2 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "MarcAntony.txt";
      File file = new File( filename );
      long expected = 35;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file one-line.txt, expects 1 line
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount3 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "one-line.txt";
      File file = new File( filename );
      long expected = 1;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file PhoneBook.txt, expects 5 lines
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount4 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "PhoneBook.txt";
      File file = new File( filename );
      long expected = 5;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file pirate_dictionary.txt, expects 116 lines
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount5 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "pirate_dictionary.txt";
      File file = new File( filename );
      long expected = 116;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file xanadu.txt, expects 5 lines
    * @throws FileNotFoundException
    */
   @Test
   public void lineCount6 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "xanadu.txt";
      File file = new File( filename );
      long expected = 5;
      long result = fileLab.lineCount( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.lineCount(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   // -----------------------------------------
   // Create tests for fileLab.fileLength
   // -----------------------------------------
   /**
    * Tests file file_that_does_not_exist, expects FileNotFoundException
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength0 ( ) {
      FileLabInterface fileLab = new FileLab();
      String filename = "FILE_THAT_DOES_NOT_EXIST"; // DO NOT ADD THIS FILE TO YOUR FILE SYSTEM
      File file = new File( filename );
      try {
         long result = fileLab.fileLength( file );
         fail( String.format(
              "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected a FileNotFoundException.",
              filename, result ) );
      } catch (FileNotFoundException e) {
         // Expected - do nothing
      }
   }

   /**
    * Tests file empty.txt, expects 0 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength1 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "empty.txt";
      File file = new File( filename );
      long expected = 0;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file MarcAntony.txt, expects 1425 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength2 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "MarcAntony.txt";
      File file = new File( filename );
      long expected = 1425;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file one-line.txt, expects 43 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength3 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "one-line.txt";
      File file = new File( filename );
      long expected = 43;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file PhoneBook.txt, expects 84 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength4 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "PhoneBook.txt";
      File file = new File( filename );
      long expected = 84;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file pirate_dictionary.txt, expects 1730 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength5 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "pirate_dictionary.txt";
      File file = new File( filename );
      long expected = 1730;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

   /**
    * Tests file xanadu.txt, expects 148 bytes
    * @throws FileNotFoundException
    */
   @Test
   public void fileLength6 ( ) throws FileNotFoundException {
      FileLabInterface fileLab = new FileLab();
      String filename = "xanadu.txt";
      File file = new File( filename );
      long expected = 148;
      long result = fileLab.fileLength( file );
      if ( result != expected ) {
         fail( String.format( "FAIL: fileLab.fileLength(FILE: %s) returned %d, expected %d.", filename, result, expected ) );
      }
   }

}