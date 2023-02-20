package objects;

/**
 * Класс умеет 2 вещи: <i>включать</i> и <i>выключать</i> синюю лампу.
 * В терминах паттерна называется <b>"Приемник команд"</b> (Receiver)
 *
 * @author Vadim Kliodt
 * @version 1.0
 */
public class BlueLight {
    public void turnOn() {
        System.out.println("The blue lights is on");
    }

    public void turnOff() {
        System.out.println("The blue lights is off");
    }
}