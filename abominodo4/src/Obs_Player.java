import javax.swing.*;

public class Obs_Player extends Obs_Abstract{

    public Obs_Player(Obs_Subject obs_Subject){
        this.obs_Subject = obs_Subject;
        this.obs_Subject.Attaching(this);
    }

    @Override
    public void displayFrame() {
        label = new JLabel(MultiLinugualStringTable.getMessage(0));
        aardvarkMainGUI.add(label);
        text = new JTextField(25);
        aardvarkMainGUI.add(text);
        button = new JButton("PLAY!");
        aardvarkMainGUI.add(button);
        button.addActionListener(this);
        aardvarkMainGUI.pack();
    }
}
