public class Controller_MVC {
    private Model_MVC model;
    private View_MVC view;

    public Controller_MVC(Model_MVC model, View_MVC view){
        this.model = model;
        this.view = view;
    }

    public void setPlyrName(String playerName){
        model.setName(playerName);
    }

    public String getPlyrName(){
        return model.getName();
    }

    public void updateView() {
        view.MainGUI();
    }
}
