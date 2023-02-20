package commands;

/**
 * Интерфейс, который должны реализовывать все команды
 * В терминах паттерна называется <b>"Команда"</b> (Command)
 */
public interface Command {
    void execute();
}
