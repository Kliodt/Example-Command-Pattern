package objects;

/**
 * Класс умеет 2 вещи: <i>включать</i> и <i>выключать</i> красную лампу.
 * В терминах паттерна называется <b>"Приемник команд"</b> (Receiver)
 *
 * @author Vadim Kliodt
 * @version 1.0
 */
public class RedLight {
    public void turnOn() {
        System.out.println("The red lights is on");
    }

    public void turnOff() {
        System.out.println("The red lights is off");
    }
}
