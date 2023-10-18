import java.util.ArrayList;

// This DataReader class returns an ArrayList words for use a game of Hang man.
//Final
public class DataReader
{
    String theme = "";

    private ArrayList<String> words = new ArrayList<String>();

    /*
     *
     *
     */
    public DataReader(String inString)
    {
        splitStr(inString);
    }

    private void splitStr(String wordStr){
        String[] arrayOfStr = wordStr.trim().split(" +");

        for (int i = 0; i < arrayOfStr.length; i++)
        {
            words.add(arrayOfStr[i]);
        }
    }

    /*

     */
    public ArrayList<String> getWords()
    {
        return words;
    }

    protected void setTheme(String aTheme){
        this.theme = aTheme;
    }

    public ArrayList<String> getNewWords()
    {
        String nextPhrase = "  Life   is like a    box of     chocolates";
        splitStr(nextPhrase);
        return words;
    }
}

