package TextEditor.CommandPattern.command;

import TextEditor.CommandPattern.Model.TextEditor;

public class CutCommand implements Command {
    private final TextEditor editor;

    public CutCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.cut();
    }

    @Override
    public void undo() {
        editor.undo();
    }
}
