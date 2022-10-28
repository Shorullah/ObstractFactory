package company;

public class Main {
    public static void main(String[] args) {
       ElectronicDevice newDevice = TvRemote.getDevice();
       //-------------------------Turn ON TV----------------------------

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //-------------------------Turn Volume UP-----------------------

        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
        DeviceButton upPressed = new DeviceButton(volUpCommand);
        upPressed.press();
        upPressed.press();
        upPressed.press();
        //------------------------Turn Volume Down----------------------
        TurnTVUp volDownCommand = new TurnTVUp(newDevice);
        DeviceButton downPressed = new DeviceButton(volDownCommand);
        downPressed.pressUndo();
        downPressed.pressUndo();
     //-------------------------Turn OFF TV-----------------------------
       TurnTVOn offCommand = new TurnTVOn(newDevice);
       DeviceButton offPressed = new DeviceButton(offCommand);
       offPressed.pressUndo();
    }
}