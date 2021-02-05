import javax.swing.*;
import java.awt.*;

public class Obs_SelectDifficulty extends Obs_Abstract{

    public Obs_SelectDifficulty(Obs_Subject obs_Subject){
        this.obs_Subject = obs_Subject;
        this.obs_Subject.attach(this);
    }
    @Override
    public void displayFrame() {
        aardvarkSelectDifficulty.setLayout(new GridLayout(0, 1));
        button = new JButton("Simples");
        aardvarkSelectDifficulty.add(button);
        button.addActionListener(this);
        button = new JButton("Not-so-simples");
        aardvarkSelectDifficulty.add(button);
        button.addActionListener(this);
        button = new JButton("Super-duper-shuffled");
        aardvarkSelectDifficulty.add(button);
        button.addActionListener(this);
        aardvarkSelectDifficulty.pack();
        aardvark = new Aardvark(level);
    }
}
