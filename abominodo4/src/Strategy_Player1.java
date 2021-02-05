public class Strategy_Player1 implements Strategy{
    @Override
    public void autoPlay() {
        Aardvark aardvark = new Aardvark(1);
        aardvark.playerName = "Player Level - 01";
        aardvark.play();
    }
}
