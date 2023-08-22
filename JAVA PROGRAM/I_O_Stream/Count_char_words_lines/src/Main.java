import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader  reader = new BufferedReader(new FileReader("xyz.txt"));

        //Initializing char1, word and line to 0

        int char1= 0;

        int word = 0;

        int line = 0;

        try
        {
            //Reading the first line into str

            String str = reader.readLine();

            while (str != null)
            {
                //Updating the line

                line++;

                //Getting number of words in str

                String[] words = str.split(" ");

                //Updating the word

                word = word + words.length;

                //Iterating each word

                for (String wordAll : words)
                {
                    //Updating the char1

                    char1 = char1 + wordAll.length();
                }

                //Reading next line into str

                str = reader.readLine();
            }

            //Printing char1, word and line

            System.out.println("Number Of Characters in a File : "+char1);

            System.out.println("Number Of Words in a  File : "+word);

            System.out.println("Number Of Lines in a File : "+line);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e)
            {
                System.out.println(e);;
            }
        }
    }