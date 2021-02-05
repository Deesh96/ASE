public class Strategy_Player3 implements Strategy{
    @Override
    public void autoPlay() {
        Aardvark aardvark = new Aardvark(3);
        aardvark.playerName = "Player Level - 03";
        aardvark.play();


    }
}
