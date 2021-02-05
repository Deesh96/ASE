import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Obs_Abstract extends JFrame implements ActionListener {

    static JTextField text;
    static JFrame aardvarkMainGUI = new JFrame("Aardvark");
    static JFrame aardvarkmainMenuGUI = new JFrame("Aardvark Main Menu");
    static JFrame aardvarkSelectDifficulty = new JFrame("Aardvark Difficulty Menu");
    static JButton button;
    static JLabel label;
    static Model_MVC model = new Model_MVC();
    static View_MVC view = new View_MVC();
    static Controller_MVC controller = new Controller_MVC(model, view);
    static protected Aardvark aardvark;
    static int level;

    protected Obs_Subject obs_Subject;

    public abstract void displayFrame();

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Ok")) {
            controller.setPlyrName(text.getText().trim());
            aardvark.playerName = model.getName();
            aardvarkMainGUI.dispose();
            aardvarkmainMenuGUI.setVisible(true);
        } else if (s.equals("Play")){
            aardvarkSelectDifficulty.setVisible(true);
        } else if (s.equals("View Rules")){
            aardvark.viewRules();
        } else if (s.equals("View High Scores")){
            aardvark.viewHighScores();
        } else if (s.equals("Quit")){
            aardvark.quit();
        } else if (s.equals("Simples")){
            level = 1;
            aardvark.play();
        } else if (s.equals("Not-so-simples")){
            level = 2;
            aardvark.play();
        } else if (s.equals("Super-duper-shuffled")){
            level = 3;
            aardvark.play();
        }
    }
}
