import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ehsun on 31/01/2021.
 */
public class ParsingData {

    public static void main (String[] args) throws Exception
    {
        //File is saved at the below location
        File file=new File("C:\\Users\\ehsn\\IdeaProjects\\ReadingfromFile\\src\\main\\resources\\car_input.txt");

        //Read the file using scanner object
        Scanner scanner=new Scanner(file);

        StringBuilder stringBuilder=new StringBuilder();
        while (scanner.hasNext())
        {
          // Convert the scanner object into string
            stringBuilder.append(scanner.nextLine().toString());
        }



        //Extract the registration number using pattern
        Pattern pattern =Pattern.compile("[A-Z0-9]{3,7}");

        Matcher matcher=pattern.matcher(stringBuilder);

        while(matcher.find())

        {
            System.out.print(matcher.group()+" ");

        }
    }
}
