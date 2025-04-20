package TextEditor.CommandPattern.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class TextEditor {
    private String clipboard = "";
    private String text = "Hello Spring World!";
    private String lastText = "";

    public void cut() {
        saveState();
        clipboard = text;
        text = "";
        System.out.println("[Cut] Clipboard: " + clipboard + " | Text: " + text);
    }

    public void copy() {
        clipboard = text;
        System.out.println("[Copy] Clipboard: " + clipboard);
    }

    public void paste() {
        saveState();
        text += clipboard;
        System.out.println("[Paste] Text: " + text);
    }

    public void undo() {
        text = lastText;
        System.out.println("[Undo] Text: " + text);
    }

    private void saveState() {
        lastText = text;
    }
}
