// Final
public class MultiMedia
{
    private boolean multiMedia = true;
    private String sound = "Sound On";

    /*giphy celebration page link - https://giphy.com/gifs/sendwishonline-congrats-congro-congratulaion-ZhvduEq5hWKYsmhRAJ
    giphy celebration embedded link - <iframe src="https://giphy.com/embed/ZhvduEq5hWKYsmhRAJ" width="480" height="480" frameBorder="0" class="giphy-embed" allowFullScreen></iframe><p><a href="https://giphy.com/gifs/sendwishonline-congrats-congro-congratulaion-ZhvduEq5hWKYsmhRAJ">via GIPHY</a></p>
     game over gif link - https://tenor.com/8IEI.gif
     RIP link https://tenor.com/bldks.gif*/
    public MultiMedia ()
    {
        //  TODO

        //this.multiMedia = media;

    }

    protected void playWonGame()
    {
        // TODO
        System.out.println(" Multimedia -- Game Over - You won");
    }

    protected void playLossGame()
    {
        // TODO

        System.out.println(" Multimedia -- Game Over - You lost");
    }

    protected void playRightGuess()
    {
        // TODO
        System.out.println("Made a right guess");
    }

    public void playWrongGuess()
    {
        //TODO
        System.out.println("Made a wrong guess");
    }

    protected void setSound(String aSound){
        this.sound = aSound;
    }
}
