package TextEditor.CommandPattern.command;

import TextEditor.CommandPattern.invoker.CommandInvoker;

public class UndoCommand implements Command {

    private final CommandInvoker invoker;

    public UndoCommand(CommandInvoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void execute() {
        invoker.undo();
    }

    @Override
    public void undo() {
        System.out.println("[UndoCommand] Cannot undo an Undo.");
    }
}
