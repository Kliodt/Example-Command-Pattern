package run;

import objects.*;
import commands.*;
import invoker.CommandInvoker;

public class Main {
    public static void main(String[] args) {
        var blueLight = new BlueLight();
        var redLight = new RedLight();
        var greenLight = new GreenLight();

        Command redOn = new TurnOnRedCommand(redLight);
        Command redOff = new TurnOffRedCommand(redLight);
        Command greenOn = new TurnOnGreenCommand(greenLight);
        Command greenOff = new TurnOffGreenCommand(greenLight);
        Command blueOn = new TurnOnBlueCommand(blueLight);
        Command blueOff = new TurnOffBlueCommand(blueLight);

        var invoker = new CommandInvoker(blueOff, greenOff, redOff, blueOn, greenOn, redOn);

        invoker.turnOnGreen();
        invoker.turnOnRed();
        invoker.turnOffBlue();
        invoker.turnOffRed();
    }
}
