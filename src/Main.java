// Final
public class Main
{
    private void showGUI()
    {
        HangManFrame hangManFrame = null;
        try
        {
            hangManFrame = new HangManFrame();
        } catch (java.io.IOException e)
        {
            throw new RuntimeException(e);
        }
        hangManFrame.setVisible(true);
    }


    public static void main(String[] args)
    {
        final Main main = new Main();
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            // @Override
            public void run()
            {
                main.showGUI();
            }
        });
    }
}
