package TextEditor.CommandPattern.command;

import TextEditor.CommandPattern.Model.TextEditor;

public class PasteCommand implements Command {
    private final TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }

    @Override
    public void undo() {
        editor.undo();
    }
}
