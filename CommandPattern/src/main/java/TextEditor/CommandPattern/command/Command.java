package TextEditor.CommandPattern.command;

public interface Command {
    void execute();
    void undo();
}