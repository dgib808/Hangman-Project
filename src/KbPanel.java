import javax.swing.*;
import java.awt.*;

/**
 *
 * @author xx
 */

//final
public class KbPanel extends javax.swing.JPanel implements java.awt.event.ActionListener {

    // Instance Fields
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton cBtn ;
    private javax.swing.JButton dBtn ;
    private javax.swing.JButton eBtn ;
    private javax.swing.JButton fBtn ;
    private javax.swing.JButton gBtn ;
    private javax.swing.JButton hBtn ;
    private javax.swing.JButton iBtn ;
    private javax.swing.JButton jBtn ;
    private javax.swing.JButton kBtn ;
    private javax.swing.JButton lBtn ;
    private javax.swing.JButton mBtn ;
    private javax.swing.JButton nBtn ;
    private javax.swing.JButton oBtn ;
    private javax.swing.JButton pBtn ;
    private javax.swing.JButton qBtn ;
    private javax.swing.JButton rBtn ;
    private javax.swing.JButton sBtn ;
    private javax.swing.JButton tBtn ;
    private javax.swing.JButton uBtn ;
    private javax.swing.JButton vBtn ;
    private javax.swing.JButton wBtn ;
    private javax.swing.JButton xBtn ;
    private javax.swing.JButton yBtn ;
    private javax.swing.JButton zBtn ;

    private java.awt.Color buttonColor;
    private JLabel commLabel;



    // End of variables declaration

    String userChoice = "";
    CommPanel myCommPanel;

    ImageIcon icon2 = new ImageIcon("comm.png");
    /**
     * Creates new form KbGUIPanel
     */
    public KbPanel(CommPanel aCommPanel)
    {

        commLabel = new JLabel();
        commLabel.setIcon(icon2);
        commLabel.setVisible(true);
        this.add(commLabel);
        this.setSize(560,200);
        this.setBounds(300,380,560, 190);
        this.myCommPanel = aCommPanel;
        initComponents();


    }

    private void initComponents()
    {

        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        fBtn = new javax.swing.JButton();
        gBtn = new javax.swing.JButton();
        hBtn = new javax.swing.JButton();
        iBtn = new javax.swing.JButton();
        jBtn = new javax.swing.JButton();
        kBtn = new javax.swing.JButton();
        lBtn = new javax.swing.JButton();
        mBtn = new javax.swing.JButton();
        nBtn = new javax.swing.JButton();
        oBtn = new javax.swing.JButton();
        pBtn = new javax.swing.JButton();
        qBtn = new javax.swing.JButton();
        rBtn = new javax.swing.JButton();
        sBtn = new javax.swing.JButton();
        tBtn = new javax.swing.JButton();
        uBtn = new javax.swing.JButton();
        vBtn = new javax.swing.JButton();
        wBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        yBtn = new javax.swing.JButton();
        zBtn = new javax.swing.JButton();

        aBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        aBtn.setText("A");
        aBtn.addActionListener(this);
        this.add(aBtn);

        //***************
        buttonColor = aBtn.getBackground();

        bBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        bBtn.setText("B");
//        bBtn.setBounds(85,5,50,50);
        bBtn.addActionListener(this);
        this.add(bBtn);

        cBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cBtn.setText("C");
//        cBtn.setBounds(130,5,100,50);
        cBtn.addActionListener(this);
        this.add(cBtn);

        dBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        dBtn.setText("D");
//        dBtn.setBounds(130,5,100,50);
        dBtn.addActionListener(this);
        this.add(dBtn);

        eBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        eBtn.setText("E");
//        eBtn.setBounds(130,5,100,50);
        eBtn.addActionListener(this);
        this.add(eBtn);

        fBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        fBtn.setText("F");
//        fBtn.setBounds(130,5,100,50);
        fBtn.addActionListener(this);
        this.add(fBtn);

        gBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        gBtn.setText("G");
//        gBtn.setBounds(130,5,100,50);
        gBtn.addActionListener(this);
        this.add(gBtn);

        hBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        hBtn.setText("H");
//        hBtn.setBounds(130,5,100,50);
        hBtn.addActionListener(this);
        this.add(hBtn);

        iBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        iBtn.setText("I");
//        iBtn.setBounds(130,5,100,50);
        iBtn.addActionListener(this);
        this.add(iBtn);

        jBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBtn.setText("J");
//        jBtn.setBounds(130,5,100,50);
        jBtn.addActionListener(this);
        this.add(jBtn);

        kBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        kBtn.setText("K");
//        kBtn.setBounds(130,5,100,50);
        kBtn.addActionListener(this);
        this.add(kBtn);

        lBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lBtn.setText("L");
//        lBtn.setBounds(130,5,100,50);
        lBtn.addActionListener(this);
        this.add(lBtn);

        mBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        mBtn.setText("M");
//        mBtn.setBounds(130,5,100,50);
        mBtn.addActionListener(this);
        this.add(mBtn);

        nBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        nBtn.setText("N");
//        nBtn.setBounds(130,5,100,50);
        nBtn.addActionListener(this);
        this.add(nBtn);

        oBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        oBtn.setText("O");
//        oBtn.setBounds(130,5,100,50);
        oBtn.addActionListener(this);
        this.add(oBtn);

        pBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        pBtn.setText("P");
//        pBtn.setBounds(130,5,100,50);
        pBtn.addActionListener(this);
        this.add(pBtn);

        qBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        qBtn.setText("Q");
//        qBtn.setBounds(130,5,100,50);
        this.add(qBtn);
        qBtn.addActionListener(this);

        rBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        rBtn.setText("R");
//        rBtn.setBounds(130,5,100,50);
        this.add(rBtn);
        rBtn.addActionListener(this);

        sBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        sBtn.setText("S");
//        sBtn.setBounds(130,5,100,50);
        this.add(sBtn);
        sBtn.addActionListener(this);

        tBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tBtn.setText("T");
//        tBtn.setBounds(130,5,100,50);
        this.add(tBtn);
        tBtn.addActionListener(this);

        uBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        uBtn.setText("U");
//        uBtn.setBounds(130,5,100,50);
        this.add(uBtn);
        uBtn.addActionListener(this);

        vBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        vBtn.setText("V");
//        vBtn.setBounds(130,5,100,50);
        this.add(vBtn);
        vBtn.addActionListener(this);

        wBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        wBtn.setText("W");
//        wBtn.setBounds(130,5,100,50);
        this.add(wBtn);
        wBtn.addActionListener(this);

        xBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        xBtn.setText("X");
//        xBtn.setBounds(130,5,100,50);
        this.add(xBtn);
        xBtn.addActionListener(this);

        yBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        yBtn.setText("Y");
//        yBtn.setBounds(130,5,100,50);
        this.add(yBtn);
        yBtn.addActionListener(this);

        zBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        zBtn.setText("Z");
        this.add(zBtn);
        zBtn.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(kBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(qBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(wBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(xBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(zBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aBtn)
                                        .addComponent(bBtn)
                                        .addComponent(cBtn)
                                        .addComponent(dBtn)
                                        .addComponent(eBtn)
                                        .addComponent(fBtn)
                                        .addComponent(gBtn)
                                        .addComponent(hBtn)
                                        .addComponent(iBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBtn)
                                        .addComponent(kBtn)
                                        .addComponent(lBtn)
                                        .addComponent(mBtn)
                                        .addComponent(nBtn)
                                        .addComponent(oBtn)
                                        .addComponent(pBtn)
                                        .addComponent(qBtn)
                                        .addComponent(rBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(zBtn)
                                        .addComponent(vBtn)
                                        .addComponent(sBtn)
                                        .addComponent(tBtn)
                                        .addComponent(uBtn)
                                        .addComponent(wBtn)
                                        .addComponent(xBtn)
                                        .addComponent(yBtn))
                                .addGap(30, 30, 30))
        );
    }// End of initComponents()

    // Override Method
    public void actionPerformed(java.awt.event.ActionEvent evt)
    {
        //if (evt.getSource() == b1)
        {
            javax.swing.JButton theButton = (javax.swing.JButton) evt.getSource();
            String userChoice = theButton.getText();

            theButton.setEnabled(false);
            theButton.setBackground(java.awt.Color.DARK_GRAY);

            myCommPanel.checkChoice(userChoice);
            boolean gameEnded = myCommPanel.getGameEnded();


            if(gameEnded)
            {
                System.out.println("kB Game over");
                disableButtons();
                userChoice = "";

            }
        }
    }

    protected void resetButtons(){
        aBtn.setEnabled(true);
        aBtn.setBackground(buttonColor);

        bBtn.setEnabled(true);
        bBtn.setBackground(buttonColor);

        cBtn.setEnabled(true);
        cBtn.setBackground(buttonColor);

        dBtn.setEnabled(true);
        dBtn.setBackground(buttonColor);

        eBtn.setEnabled(true);
        eBtn.setBackground(buttonColor);

        fBtn.setEnabled(true);
        fBtn.setBackground(buttonColor);

        gBtn.setEnabled(true);
        gBtn.setBackground(buttonColor);

        hBtn.setEnabled(true);
        hBtn.setBackground(buttonColor);

        iBtn.setEnabled(true);
        iBtn.setBackground(buttonColor);

        jBtn.setEnabled(true);
        jBtn.setBackground(buttonColor);

        kBtn.setEnabled(true);
        kBtn.setBackground(buttonColor);

        lBtn.setEnabled(true);
        lBtn.setBackground(buttonColor);

        mBtn.setEnabled(true);
        mBtn.setBackground(buttonColor);

        nBtn.setEnabled(true);
        nBtn.setBackground(buttonColor);

        oBtn.setEnabled(true);
        oBtn.setBackground(buttonColor);

        pBtn.setEnabled(true);
        pBtn.setBackground(buttonColor);

        qBtn.setEnabled(true);
        qBtn.setBackground(buttonColor);

        rBtn.setEnabled(true);
        rBtn.setBackground(buttonColor);

        sBtn.setEnabled(true);
        sBtn.setBackground(buttonColor);

        tBtn.setEnabled(true);
        tBtn.setBackground(buttonColor);

        uBtn.setEnabled(true);
        uBtn.setBackground(buttonColor);

        vBtn.setEnabled(true);
        vBtn.setBackground(buttonColor);

        wBtn.setEnabled(true);
        wBtn.setBackground(buttonColor);

        xBtn.setEnabled(true);
        xBtn.setBackground(buttonColor);

        yBtn.setEnabled(true);
        yBtn.setBackground(buttonColor);

        zBtn.setEnabled(true);
        zBtn.setBackground(buttonColor);
    }

    private void disableButtons(){
        System.out.println("Disabling Keyboard Buttons");
        aBtn.setEnabled(false);
        aBtn.setBackground(buttonColor);

        bBtn.setEnabled(false);
        bBtn.setBackground(buttonColor);

        cBtn.setEnabled(false);
        cBtn.setBackground(buttonColor);

        dBtn.setEnabled(false);
        dBtn.setBackground(buttonColor);

        eBtn.setEnabled(false);
        eBtn.setBackground(buttonColor);

        fBtn.setEnabled(false);
        fBtn.setBackground(buttonColor);

        gBtn.setEnabled(false);
        gBtn.setBackground(buttonColor);

        hBtn.setEnabled(false);
        hBtn.setBackground(buttonColor);

        iBtn.setEnabled(false);
        iBtn.setBackground(buttonColor);

        jBtn.setEnabled(false);
        jBtn.setBackground(buttonColor);

        kBtn.setEnabled(false);
        kBtn.setBackground(buttonColor);

        lBtn.setEnabled(false);
        lBtn.setBackground(buttonColor);

        mBtn.setEnabled(false);
        mBtn.setBackground(buttonColor);

        nBtn.setEnabled(false);
        nBtn.setBackground(buttonColor);

        oBtn.setEnabled(false);
        oBtn.setBackground(buttonColor);

        pBtn.setEnabled(false);
        pBtn.setBackground(buttonColor);

        qBtn.setEnabled(false);
        qBtn.setBackground(buttonColor);

        rBtn.setEnabled(false);
        rBtn.setBackground(buttonColor);

        sBtn.setEnabled(false);
        sBtn.setBackground(buttonColor);

        tBtn.setEnabled(false);
        tBtn.setBackground(buttonColor);

        uBtn.setEnabled(false);
        uBtn.setBackground(buttonColor);

        vBtn.setEnabled(false);
        vBtn.setBackground(buttonColor);

        wBtn.setEnabled(false);
        wBtn.setBackground(buttonColor);

        xBtn.setEnabled(false);
        xBtn.setBackground(buttonColor);

        yBtn.setEnabled(false);
        yBtn.setBackground(buttonColor);

        zBtn.setEnabled(false);
        zBtn.setBackground(buttonColor);
    }
}


