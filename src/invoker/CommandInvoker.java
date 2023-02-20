package invoker;

import commands.*;

/**
 * Некий класс, который будет вызывать команды.
 * В терминах паттерна <b>Вызывающий команды</b> (invoker)
 */
public class CommandInvoker {
    private Command turnOffBlueCommand;
    private Command turnOffGreenCommand;
    private Command turnOffRedCommand;
    private Command turnOnBlueCommand;
    private Command turnOnGreenCommand;
    private Command turnOnRedCommand;

    public CommandInvoker(Command turnOffBlueCommand,
                          Command turnOffGreenCommand,
                          Command turnOffRedCommand,
                          Command turnOnBlueCommand,
                          Command turnOnGreenCommand,
                          Command turnOnRedCommand) {
        this.turnOffBlueCommand = turnOffBlueCommand;
        this.turnOffGreenCommand = turnOffGreenCommand;
        this.turnOffRedCommand = turnOffRedCommand;
        this.turnOnBlueCommand = turnOnBlueCommand;
        this.turnOnGreenCommand = turnOnGreenCommand;
        this.turnOnRedCommand = turnOnRedCommand;
    }

    public void turnOnBlue() {
        turnOnBlueCommand.execute();
    }

    public void turnOnGreen() {
        turnOnGreenCommand.execute();
    }

    public void turnOnRed() {
        turnOnRedCommand.execute();
    }

    public void turnOffBlue() {
        turnOffBlueCommand.execute();
    }

    public void turnOffGreen() {
        turnOffGreenCommand.execute();
    }

    public void turnOffRed() {
        turnOffRedCommand.execute();
    }
}
