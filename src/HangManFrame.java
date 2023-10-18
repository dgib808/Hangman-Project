import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

//Final
public class HangManFrame extends JFrame implements ActionListener
{
    private final DataReader myDataReader = new DataReader("  Scrum Master ");
    private final CommPanel myCommPanel;
    private final KbPanel myKBPanel;
    private final ImagePanel myImagePanel;
    private final JButton btnToggle;
    private final JButton btnReplay;
    private final JButton btnPause;
    private final JButton btnNewGame;
    //private final  JPanel myBtnPanel;
    private final JPanel btnTogglePanel;
    private final FirstPanel myFirstPanel;
    private ArrayList<String> words;
    private int maxMisses;
    private String sound;
    private String theme = "All";
    JLabel btnToggleLabel;
    private String dummy;
    ImageIcon image = new ImageIcon("top.png");

    public HangManFrame() throws java.io.IOException
    {
        // words = new ArrayList<>();


        this.words = myDataReader.getWords();


        myImagePanel = new ImagePanel();
        myCommPanel = new CommPanel(myImagePanel, myDataReader);
        //myCommPanel.setDataReader(myDataReader);
        myKBPanel = new KbPanel(myCommPanel);

        //myBtnPanel = new JPanel();
        btnToggle = new JButton("Play");
        btnReplay = new JButton("Replay");
        btnPause = new JButton("Pause");
        btnNewGame = new JButton("New Game");
        btnTogglePanel = new JPanel();


        try
        {
            myFirstPanel = new FirstPanel();


        } catch (java.io.IOException e)
        {
            throw new RuntimeException(e);
        }


        this.maxMisses = myFirstPanel.getMaxMisses();
        this.theme = myFirstPanel.getTheme();
        this.sound = myFirstPanel.getSound();


        myCommPanel.setMaxMisses(maxMisses);
        myDataReader.setTheme(theme);


        myCommPanel.setVisible(false);


        btnTogglePanel.setLayout(null);
        myFirstPanel.setSize(870, 600);

        btnToggleLabel = new JLabel();
        btnToggleLabel.setBounds(0, 0, 854, 50);
        btnTogglePanel.add(btnToggleLabel);
        btnToggleLabel.setOpaque(true);
        btnToggleLabel.setVisible(true);
        btnToggleLabel.add(btnToggle);

        myKBPanel.setBounds(300, 380, 554, 181);
        myCommPanel.setBounds(300, 50, 554, 400);
        myImagePanel.setBounds(0, 50, 300, 511);
        btnTogglePanel.setBounds(0, 0, 854, 50);
        myFirstPanel.setBounds(0, 0, 870, 600);



        Border border3 = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0x000000), 3);


        btnToggleLabel.setIcon(image);
        myImagePanel.setBorder(border3);


        myCommPanel.setBorder(border3);
        myKBPanel.setBorder(border3);
        myImagePanel.setBackground(Color.WHITE);


        btnToggle.setVisible(true);
        btnReplay.setVisible(false);
        btnPause.setVisible(false);
        btnNewGame.setVisible(false);


        btnNewGame.setFont(new Font("Pixelify Sans", Font.BOLD, 12));
        btnPause.setFont(new Font("Pixelify Sans", Font.BOLD, 13));
        btnToggle.setFont(new Font("Pixelify Sans", Font.BOLD, 13));
        btnReplay.setFont(new Font("Pixelify Sans", Font.BOLD, 13));


        btnPause.setBounds(700, 15, 100, 30);
        btnNewGame.setBounds(585, 15, 100, 30);
        btnReplay.setBounds(470, 15, 100, 30);
        btnToggle.setBounds(355, 15, 100, 30);

        btnToggleLabel.add(btnPause);
        btnToggleLabel.add(btnReplay);
        btnToggleLabel.add(btnNewGame);

        btnTogglePanel.setVisible(true);

        this.add(btnTogglePanel);
        this.setTitle("Hangman");

        this.setSize(870, 600);
        this.setLayout(null);
        this.setBackground(java.awt.Color.CYAN);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });

        this.maxMisses = myFirstPanel.getMaxMisses();
        this.theme = myFirstPanel.getTheme();
        this.sound = myFirstPanel.getSound();


        myFirstPanel.setVisible(true);
        myKBPanel.setVisible(false);
        myImagePanel.setVisible(false);


        this.add(myFirstPanel);
        //this.add(myBtnPanel);
        this.add(myKBPanel);
        this.add(myCommPanel);
        this.add(myImagePanel);
        this.setVisible(true);

        btnToggle.addActionListener(this);
        btnReplay.addActionListener(this);
        btnNewGame.addActionListener(this);
        btnPause.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnToggle)
        {

            maxMisses = myFirstPanel.getMaxMisses();
            sound = myFirstPanel.getSound();
            theme = myFirstPanel.getTheme();

            myCommPanel.setMaxMisses(maxMisses);
            myCommPanel.setSound(sound);
            boolean visible = myFirstPanel.isVisible();
            myFirstPanel.setVisible(!visible);
            myKBPanel.setVisible(visible);
            myCommPanel.setVisible(visible);
            myImagePanel.setVisible(visible);

            if (btnToggle.getText().equals("Play"))
            {
                btnToggle.setText("Back");
                btnReplay.setVisible(true);
                btnPause.setVisible(true);
                btnNewGame.setVisible(true);

                myCommPanel.setMaxMisses(maxMisses);
            } else
            {
                btnToggle.setText("Play");
                btnReplay.setVisible(false);
                btnPause.setVisible(false);
                btnNewGame.setVisible(false);
            }
        } else if (e.getSource() == btnNewGame)
        {
            //config file
            System.out.println("New Game Started");
            myKBPanel.resetButtons();
            int numDashes = 0;
            myCommPanel.setNumDashes(numDashes);
            myCommPanel.setGameEnded(false);

            int cntWrong = 0;
            myCommPanel.setCntWrong(cntWrong);
            // myImagePanel.setCnt(cntWrong);

            int cntDown = 0;
            myCommPanel.setCntDown(cntDown);

            int numMisses = 0;
            myCommPanel.setNumMisses(numMisses);

            this.words.clear();
            this.words = myDataReader.getNewWords(); //TODO Need to create the logic
            myCommPanel.setWords(words);

            myCommPanel.calcNumDashes();
            myCommPanel.createLabels();
            myImagePanel.setImage(0);

        } else if (e.getSource() == btnReplay) {

            System.out.println("Replay the Game");
            myKBPanel.resetButtons();
            int numDashes = 0;
            myCommPanel.setNumDashes(numDashes);
            myCommPanel.setGameEnded(false);

            int cntWrong = 0;
            myCommPanel.setCntWrong(cntWrong);
            // myImagePanel.setCnt(cntWrong);

            int cntDown = 0;
            myCommPanel.setCntDown(cntDown);

            int numMisses = 0;
            myCommPanel.setNumMisses(numMisses);

//            this.words.clear();
//            this.words = myDataReader.getNewWords(); //TODO Need to create the logic
//            myCommPanel.setWords(words);

            myCommPanel.calcNumDashes();
            myCommPanel.createLabels();
            myImagePanel.setImage(0);

        }else if (e.getSource() == btnPause)
        {
            System.out.println("Game Pause");

        }

    }
}







