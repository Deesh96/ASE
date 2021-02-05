import java.util.ArrayList;
import java.util.List;

public class Obs_Subject {
    private List<Obs_Abstract> observers = new ArrayList<Obs_Abstract>();

    public void attach(Obs_Abstract observer){
        observers.add(observer);
    }

    public void Obs_notifing(){
        for(Obs_Abstract observer : observers){
            observer. displayFrame();
        }
    }

	
}
