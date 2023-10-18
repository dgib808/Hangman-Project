import javax.swing.*;


class ImagePanel extends JPanel
{
    ImageIcon image0 = new ImageIcon("gallow0.png");
    ImageIcon image1 = new ImageIcon("gallow1.png");
    ImageIcon image2 = new ImageIcon("gallow2.png");
    ImageIcon image3 = new ImageIcon("gallow3.png");
    ImageIcon image4 = new ImageIcon("gallow4.png");
    ImageIcon image5 = new ImageIcon("gallow5.png");
    ImageIcon image6 = new ImageIcon("gallow6.png");
    //
    private final JLabel[] imageLabel = new JLabel[7];
    private int cnt;
    //ImageIcon image7 = new ImageIcon("gallow7.png");
    //ImageIcon image8 = new ImageIcon("gallow8.png");


    public ImagePanel()
    {
        imageLabel[0] = new JLabel();
        imageLabel[0].setIcon(image0);


        imageLabel[1] = new JLabel();
        imageLabel[1].setIcon(image1);


        imageLabel[2] = new JLabel();
        imageLabel[2].setIcon(image2);


        imageLabel[3] = new JLabel();
        imageLabel[3].setIcon(image3);


        imageLabel[4] = new JLabel();
        imageLabel[4].setIcon(image4);


        imageLabel[5] = new JLabel();
        imageLabel[5].setIcon(image5);


        imageLabel[6] = new JLabel();
        imageLabel[6].setIcon(image6);


        imageLabel[0].setVisible(true);
        imageLabel[1].setVisible(false);
        imageLabel[2].setVisible(false);
        imageLabel[3].setVisible(false);
        imageLabel[4].setVisible(false);
        imageLabel[5].setVisible(false);
        imageLabel[6].setVisible(false);


        this.add(imageLabel[0]);
        this.add(imageLabel[1]);
        this.add(imageLabel[2]);
        this.add(imageLabel[3]);
        this.add(imageLabel[4]);
        this.add(imageLabel[5]);
        this.add(imageLabel[6]);


    }


    public void setImage(int aCnt)
    {
        imageLabel[aCnt].setVisible(true);
        if (aCnt >= 1)
        {
            imageLabel[aCnt - 1].setVisible(false);
        }
    }


    protected void setCnt(int aCnt)
    {
        this.cnt = aCnt;
        setImage(this.cnt);
    }
}
