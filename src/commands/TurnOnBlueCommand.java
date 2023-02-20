package commands;

import objects.BlueLight;

/**
 * Команда для включения синей лампы (инкапсулированный в отдельный класс метод класса BlueLight)
 */
public class TurnOnBlueCommand implements Command {
    private final BlueLight LIGHT;

    public TurnOnBlueCommand(BlueLight light) {
        this.LIGHT = light;
    }

    public void execute() {
        LIGHT.turnOn();
    }
}
