package TextEditor.CommandPattern.service;

import TextEditor.CommandPattern.command.*;
import TextEditor.CommandPattern.invoker.CommandInvoker;
import TextEditor.CommandPattern.Model.TextEditor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TextEditorService {
    private final TextEditor editor;
    private final CommandInvoker invoker;

    public void cut() {
        invoker.executeCommand(new CutCommand(editor));
    }

    public void copy() {
        invoker.executeCommand(new CopyCommand(editor));
    }

    public void paste() {
        invoker.executeCommand(new PasteCommand(editor));
    }

    public void undo() {
        invoker.undo();
    }

    public String getText() {
        return editor.getText();
    }

    public String getClipboard() {
        return editor.getClipboard();
    }
}
