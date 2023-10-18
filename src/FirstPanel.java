import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
//final
public class FirstPanel extends JPanel implements ActionListener
{

    private JLabel firstLabel;//Opening label that is displayed
    private JLabel gameLabel;//Label the game is played on
    private JLabel levelLabel;//small label for the level
    private JLabel themeLabel;//small label for themes
    private JLabel soundLabel;//small label for sound options

    private int maxMisses = -1;
    private String theme;
    private String sound;
    private String dummy;


    private JComboBox levelComboBox;
    private JComboBox themeComboBox;
    private JComboBox soundComboBox;

    ImageIcon icon = new ImageIcon("label.png");
    Border border = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0x00ccff), 3);
    // Border border2 = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0x00ccff), 10);

    JPanel frontPanel = new JPanel();

    public FirstPanel() throws IOException
    {
        String[] levels = {"Easy", "Medium", "Hard"};
        String[] themes = {"All", "Movies", "Sports", "Food", "Geography"};
        String[] sounds = {"Sound On", "Sound Off"};

        levelLabel = new javax.swing.JLabel();
        levelLabel.setVisible(true);
        levelLabel.setBounds(35, 51, 120, 25);
        levelLabel.setSize(120, 25);
        levelLabel.setText("       Difficulty ");

        themeLabel = new javax.swing.JLabel();
        themeLabel.setVisible(true);
        themeLabel.setBounds(35, 170, 120, 25);
        themeLabel.setSize(120, 25);
        themeLabel.setText("        Themes ");

        soundLabel = new javax.swing.JLabel();
        soundLabel.setVisible(true);
        soundLabel.setBounds(35, 310, 120, 25);
        soundLabel.setSize(120, 25);
        soundLabel.setText("   Sound Option ");

        levelComboBox = new javax.swing.JComboBox(levels);
        levelComboBox.setSelectedIndex(1);  //Select the default Difficulty level to medium
        levelComboBox.addActionListener(this);
        maxMisses = 6;

        themeComboBox = new javax.swing.JComboBox(themes);
        themeComboBox.setSelectedIndex(0); //This sets the default Theme to All
        themeComboBox.addActionListener(this);
        theme = "All";

        soundComboBox = new javax.swing.JComboBox(sounds);
        soundComboBox.setSelectedIndex(0);
        soundComboBox.addActionListener(this);
        sound = "Sound On";

        levelComboBox.setBounds(35, 76, 120, 25);
        themeComboBox.setBounds(35, 195, 120, 25);
        soundComboBox.setBounds(35, 335, 120, 25);


        levelLabel.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        levelLabel.setVerticalTextPosition(javax.swing.JLabel.TOP);
        levelLabel.setForeground(java.awt.Color.BLACK);
        levelLabel.setIconTextGap(0);
        levelLabel.setBorder(border);
        levelLabel.setOpaque(true);
        //levelLabel.setFont(new Font("MV Boli", Font.BOLD, 14));

        themeLabel.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        themeLabel.setVerticalTextPosition(javax.swing.JLabel.TOP);
        themeLabel.setForeground(java.awt.Color.BLACK);
        themeLabel.setIconTextGap(0);
        themeLabel.setBorder(border);
        themeLabel.setOpaque(true);

        soundLabel.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        soundLabel.setVerticalTextPosition(javax.swing.JLabel.TOP);
        soundLabel.setForeground(java.awt.Color.BLACK);
        soundLabel.setIconTextGap(0);
        soundLabel.setBorder(border);
        soundLabel.setOpaque(true);

        firstLabel = new javax.swing.JLabel();
        firstLabel.add(soundComboBox);
        firstLabel.add(themeComboBox);
        firstLabel.add(levelComboBox);
        firstLabel.setIcon(icon);


        firstLabel.setSize(870, 600);
        firstLabel.setBounds(0, 0, 855, 562);
        //firstLabel.setBorder(border2);
        firstLabel.add(levelLabel);
        firstLabel.add(themeLabel);
        firstLabel.add(soundLabel);
        firstLabel.setOpaque(true);
        firstLabel.setVisible(true);


        gameLabel = new JLabel();
        gameLabel.setSize(870, 600);
        icon.getImage().flush();
        gameLabel.setIcon(icon);
        this.add(firstLabel);
        this.setLayout(null);
        this.setSize(870, 600);
        this.setBounds(0, 0, 870, 600);
        this.setVisible(true);
        //frontPanel.add(commPanel);
    }

    public int getMaxMisses()
    {
        return maxMisses;
    }

    public String getTheme(){
        return theme;
    }

    public String getSound(){
        return sound;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == levelComboBox)
        {

            String level = String.valueOf(levelComboBox.getSelectedItem());
            if (level.equalsIgnoreCase("Easy"))
            {
                maxMisses = 8;
            } else if (level.equalsIgnoreCase("medium"))
            {
                maxMisses = 6;
            } else if (level.equalsIgnoreCase("Hard"))
            {
                maxMisses = 4;
            }
            System.out.println("You selected " + levelComboBox.getSelectedItem() + " level");
        } else if (e.getSource() == themeComboBox)
        {
            theme = String.valueOf(themeComboBox.getSelectedItem());
            System.out.println("You selected " + themeComboBox.getSelectedItem() + " theme");
        } else if (e.getSource() == soundComboBox)

        {
            sound = String.valueOf(soundComboBox.getSelectedItem());
            System.out.println("You selected " + soundComboBox.getSelectedItem());
        }
    }
}


