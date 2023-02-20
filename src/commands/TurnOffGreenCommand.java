package commands;

import objects.GreenLight;

/**
 * Команда для выключения зелёной лампы (инкапсулированный в отдельный класс метод класса GreenLight)
 */
public class TurnOffGreenCommand implements Command {
    private final GreenLight LIGHT;

    public TurnOffGreenCommand(GreenLight light) {
        this.LIGHT = light;
    }

    public void execute() {
        LIGHT.turnOff();
    }
}
