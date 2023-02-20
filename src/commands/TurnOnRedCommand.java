package commands;

import objects.RedLight;

/**
 * Команда для включения красной лампы (инкапсулированный в отдельный класс метод класса RedLight)
 */
public class TurnOnRedCommand implements Command {
    private final RedLight LIGHT;

    public TurnOnRedCommand(RedLight light) {
        this.LIGHT = light;
    }

    @Override
    public void execute() {
        LIGHT.turnOn();
    }
}
