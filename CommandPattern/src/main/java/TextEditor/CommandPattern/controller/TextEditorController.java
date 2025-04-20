package TextEditor.CommandPattern.controller;

import TextEditor.CommandPattern.service.TextEditorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editor")
@RequiredArgsConstructor
public class TextEditorController {

    private final TextEditorService service;

    @PostMapping("/cut")
    public String cut() {
        service.cut();
        return "Cut performed. Current text: " + service.getText();
    }

    @PostMapping("/copy")
    public String copy() {
        service.copy();
        return "Copy performed. Clipboard: " + service.getClipboard();
    }

    @PostMapping("/paste")
    public String paste() {
        service.paste();
        return "Paste performed. Current text: " + service.getText();
    }

    @PostMapping("/undo")
    public String undo() {
        service.undo();
        return "Undo performed. Current text: " + service.getText();
    }
}
