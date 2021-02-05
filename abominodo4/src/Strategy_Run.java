public class Strategy_Run {
    public static void main(String args[]){

        ContextStrategy contextStrategy = new ContextStrategy(new Strategy_Player1());
        contextStrategy.executeStrategy();


        contextStrategy = new ContextStrategy(new Strategy_Player2());
        contextStrategy.executeStrategy();

        contextStrategy = new ContextStrategy(new Strategy_Player3());
        contextStrategy.executeStrategy();

    }
}
