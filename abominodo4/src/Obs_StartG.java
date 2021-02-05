import javax.swing.*;
import java.awt.*;

public class Obs_StartG extends Obs_Abstract{

    public Obs_StartG(Obs_Subject obs_Subject){
        this.obs_Subject = obs_Subject;
        this.obs_Subject.attach(this);
    }
    @Override
    public void displayFrame() {
        aardvarkMainGUI.setLayout(new GridLayout(0, 1));
        label = new JLabel(" Welcome To Abominodo - The Best Dominoes Puzzle Game in the Universe ");
        aardvarkMainGUI.add(label);
        label = new JLabel(" Version 1.0 (c), Kevan Buckley, 2010");
        aardvarkMainGUI.add(label);
        aardvarkMainGUI.pack();
        aardvarkMainGUI.setVisible(true);
    }
}
