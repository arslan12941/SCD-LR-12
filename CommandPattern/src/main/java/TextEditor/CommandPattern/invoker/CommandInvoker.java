package TextEditor.CommandPattern.invoker;

import TextEditor.CommandPattern.command.Command;
import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class CommandInvoker {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}
