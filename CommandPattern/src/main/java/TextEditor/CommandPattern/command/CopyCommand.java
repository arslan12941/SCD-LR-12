package TextEditor.CommandPattern.command;

import TextEditor.CommandPattern.Model.TextEditor;

public class CopyCommand implements Command {
    private final TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }

    @Override
    public void undo() {
        System.out.println("[Undo Copy] Nothing to undo.");
    }
}
