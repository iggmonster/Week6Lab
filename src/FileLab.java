import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLab extends FileLabAbstract {

    @Override
    public long charCount(File file) throws FileNotFoundException {
        int charCount = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.useDelimiter("").hasNextLine()){
            String Line = scanner.useDelimiter("").nextLine();
            charCount += Line.length();
        }
        return charCount;
    }

    @Override
    public long uniqueWordCount(File file) throws FileNotFoundException {
        int wordCount = 0;
        Scanner scanner = new Scanner(file);
        String[] array = new String[0];
        while (scanner.hasNext()){
            array = new String[array.length + 1];
            System.arraycopy(array, 0, array, 0, array.length);
            String word = scanner.next();
            for (int i = 0; i < array.length; i++){
                if (array[i] == word){
                    break;
                }
            }
            array[array.length] = "word";
        }
        return wordCount;
    }

    @Override
    public long fileLength(File file) throws FileNotFoundException {
        return 0;
    }
}
