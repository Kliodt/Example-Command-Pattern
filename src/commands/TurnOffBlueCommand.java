package commands;

import objects.BlueLight;

/**
 * Команда для выключения синей лампы (инкапсулированный в отдельный класс метод класса BlueLight)
 */
public class TurnOffBlueCommand implements Command {
    private final BlueLight LIGHT;

    public TurnOffBlueCommand(BlueLight light) {
        this.LIGHT = light;
    }

    public void execute() {
        LIGHT.turnOff();
    }
}
