package commands;

import objects.GreenLight;

/**
 * Команда для включения зелёной лампы (инкапсулированный в отдельный класс метод класса GreenLight)
 */
public class TurnOnGreenCommand implements Command {
    private final GreenLight LIGHT;

    public TurnOnGreenCommand(GreenLight light) {
        this.LIGHT = light;
    }

    public void execute() {
        LIGHT.turnOn();
    }
}
