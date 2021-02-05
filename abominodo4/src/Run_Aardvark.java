public class Run_Aardvark {
    public static void main(String[] args){
        Model_MVC model = new Model_MVC();
        View_MVC view = new View_MVC();
        Controller_MVC controller = new Controller_MVC(model, view);
        controller.updateView();
    }
}
