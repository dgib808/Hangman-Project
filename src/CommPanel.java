import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;






//Final

/**
 * @author
 */
public class CommPanel extends javax.swing.JPanel
{




    //<<<<<<< HEAD
    private ArrayList<String> words;
    private DataReader dataReader;
    private JLabel[] commLabel;
    private int numDashes = 0;
    private int cntWrong = 0;
    private int cntRight = 0;
    private int cntDown = 0;
    private KbPanel myKbPanel;
    private MultiMedia myMultiMedia = new MultiMedia();;
    private JButton backButton = new JButton();
    private JButton pauseBUtton = new JButton();
    //    private ImagePanel myImagePanel = new ImagePanel();
    private ImagePanel myImagePanel;
    private int maxLtrs = 50;



    private int maxMisses = 0;
    private String theme;  //May not be needed.  Evaluate TODO
    private String sound;


    private boolean gameEnded = false;
    // End of Field variables declaration




    /**
     * Creates new form CommJPanel
     */
//   public CommPanel(ArrayList<String> aWords, JPanel aImagePanel)
    public CommPanel(ImagePanel  aImagePanel, DataReader aDataReader)
    {
        this.setBackground(java.awt.Color.white);
        this.myImagePanel = aImagePanel;
        this.dataReader = aDataReader;
        //dataReader = new DataReader("This is   a    Test");
        this.words = dataReader.getWords();
        initComponents();
    }

    protected void setGameEnded(boolean aBool){
        this.gameEnded = aBool;
    }


    protected void setWords(ArrayList<String> aWords){
        this.words = aWords;
    }


    protected ArrayList<String> getWord(){
        return words;
    }




    protected void setDataReader(DataReader aDataReader ){
        this.dataReader = aDataReader;
    }




    private void initComponents()
    {
//        myMultiMedia = new MultiMedia();
        this.setLayout(null);
        calcNumDashes();

        commLabel = new JLabel[maxLtrs]; // Create empty array of labels

        for (int i = 0; i <= maxLtrs - 1; i++){
            commLabel[i] = new javax.swing.JLabel();
        }

        createLabels();
    }


    public void setMaxMisses(int aMaxMisses)
    {
        this.maxMisses = aMaxMisses;
    }

    private void setTheme(String aTheme)
    {
        this.theme = aTheme;
    }


    protected void calcNumDashes()
    {
        // Calculate the number dashes needed for the game

        for (int i = 0; i < words.size(); i++)
        {
            for (int j = 0; j < words.get(i).length(); j++)
            {
                numDashes += 1;
            }
        }
    }


//    //protected void myCommPanel
//    protected void setGameEnded()
//    {
//        gameEnded = true;
//    }




    protected boolean getGameEnded()
    {
        return gameEnded;
    }




    protected void setSound(String aSound)
    {
        this.sound = aSound;
        myMultiMedia.setSound(sound);
    }

    protected void createLabels()
    {

        int myLetterCnt = 0;
        //       int wordCnt = 0;
        int xPos = 30;
        int yPos = 100;
        int width = 25;
        int height = 65;

        //***debug
        this.setVisible(true);

        for (int l = 0; l < words.size(); l++)
        {
            for (int k = 0; k < words.get(l).length(); k++)
            {
                commLabel[myLetterCnt].setText("_");
                commLabel[myLetterCnt].setFont(new java.awt.Font("Dialog", 1, 36)); //36
                commLabel[myLetterCnt].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                commLabel[myLetterCnt].setVerticalAlignment(javax.swing.SwingConstants.TOP);
                commLabel[myLetterCnt].setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                commLabel[myLetterCnt].setVerifyInputWhenFocusTarget(false);
                commLabel[myLetterCnt].setVerticalTextPosition(SwingConstants.TOP);
                commLabel[myLetterCnt].setBounds(xPos, yPos, width, height);
                commLabel[myLetterCnt].setVisible(false);
                commLabel[myLetterCnt].setVisible(true);

                add(commLabel[myLetterCnt]);
                xPos += 30;
                myLetterCnt++;
            }
            //           wordCnt++;
            xPos += 20;

            if (myLetterCnt >= 11 && yPos == 100)
            {
                yPos += 60;
                xPos = 40;
            } else if ((myLetterCnt >= 22 && yPos == 160))
            {
                yPos += 60;
                xPos = 50;
            }
        }

        this.setVisible(false);
        this.setVisible(true);
    } //end of method createLabel




    public void checkChoice(String aChoice)
    {
        boolean isCorrect = false;
        int ltrIdx = 0;
//        int char_at = -1;
        String charStr = "";




        ArrayList<String> labelArray = new ArrayList<>();


        for (int i = 0; i < words.size(); i++)
        {
            for (int j = 0; j < words.get(i).length(); j++)
            {
                charStr = words.get(i).substring(j, j + 1);




                if (aChoice.equalsIgnoreCase(charStr))
                {
                    commLabel[ltrIdx].setText(charStr);
                    int x = commLabel[ltrIdx].getX();
                    int y = commLabel[ltrIdx].getY();
                    int w = commLabel[ltrIdx].getWidth();
                    int h = commLabel[ltrIdx].getHeight();
                    commLabel[ltrIdx].setFont(new Font("Dialog", 1, 22));
                    commLabel[ltrIdx].setBounds(x, y, w, h);
                    isCorrect = true;




                    cntDown += 1;
                }
                ltrIdx++;
            }
        }




        if (!isCorrect)
        {
            cntWrong += 1;
            myImagePanel.setCnt(cntWrong);




            if (cntWrong == maxMisses)
            {
                setGameEnded(true);
                myMultiMedia.playLossGame();
                System.out.println("This CommPanel is Game over loss " + cntWrong + "    " + maxMisses);
            } else
            {
                myMultiMedia.playWrongGuess();
                System.out.println("This CommPanel is wrong guess game continue");
            }
        }
        else
        {


            if (numDashes == cntDown)
            {
                setGameEnded(true);
                myMultiMedia.playWonGame();
                System.out.println("This CommPanel is Game over Win " + cntDown + "    " + numDashes);
            } else
            {
                myMultiMedia.playRightGuess();
                System.out.println("This CommPanel is Right guess - game continues  -" + cntDown + "  " + numDashes);


            }


        }


    }


    public void setNumDashes(int aNumDashes) {
        this.numDashes = aNumDashes;
    }


    public void setCntWrong(int aCntWrong) {
        this.cntWrong = aCntWrong;
    }


    public void setCntDown(int aCntDown) {
        this.cntDown = aCntDown;
    }


    public void setNumMisses(int aCntWrong) {
        this.cntWrong = aCntWrong;
    }
}



