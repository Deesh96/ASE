public class Strategy_Player2 implements Strategy{
    @Override
    public void autoPlay() {
        Aardvark aardvark = new Aardvark(2);
        aardvark.playerName = "Player Level - 02";
        aardvark.play();
    }
}
