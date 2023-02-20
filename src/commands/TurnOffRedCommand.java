package commands;

import objects.RedLight;

/**
 * Команда для выключения красной лампы (инкапсулированный в отдельный класс метод класса RedLight)
 */
public class TurnOffRedCommand implements Command {
    private final RedLight LIGHT;

    public TurnOffRedCommand(RedLight light) {
        this.LIGHT = light;
    }

    @Override
    public void execute() {
        LIGHT.turnOff();
    }
}
