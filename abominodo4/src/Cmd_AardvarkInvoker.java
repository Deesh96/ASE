public class Cmd_AardvarkInvoker {
    private Cmd_AardvarkInterface placeDomino;

    public Cmd_AardvarkInvoker(Cmd_Aardvark aardvarkPlaceDominoCommand){
        this.placeDomino = aardvarkPlaceDominoCommand;
    }

    public void forwardGame(){
        placeDomino.playGame();
    }

    public void backwardGame(){
        placeDomino.undoGame();
    }
}
