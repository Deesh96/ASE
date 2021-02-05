public class Cmd_AardvarkMain {
    public static void main(String args[]){
        Aardvark aardvark = new Aardvark();

        Cmd_Aardvark aardvarkPlaceDominoCommand = new Cmd_Aardvark(aardvark);

        Cmd_AardvarkInvoker aardvarkCommandInvoker = new Cmd_AardvarkInvoker(aardvarkPlaceDominoCommand);
        aardvarkCommandInvoker.forwardGame();

        System.out.println("Do you need to undo(Y : yes , N : no) :");
        String undo = IOLibrary.getString();
        if(undo.equalsIgnoreCase("Y")) {
            aardvarkCommandInvoker.backwardGame();
        }
    }
}
