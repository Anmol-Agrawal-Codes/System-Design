package CommandPattern.WithCommandPattern;

public class TextEditorClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button boldButton = new Button(new BoldCommand(editor));
        Button italicButton = new Button(new ItalicCommand(editor));
        // button.setCommand(new BoldCommand(editor));
        boldButton.click();
        italicButton.setCommand(new ItalicCommand(editor));
        italicButton.click();
    }
}

/*
 * Benefits of Command Pattern
 *
 * 1. Loose Coupling:
 *    The Button does not know anything about TextEditor.
 *    It only knows how to execute a Command.
 *
 * 2. Easy to Add New Features:
 *    To add a new action (Copy, Paste, Undo, etc.),
 *    simply create a new Command class.
 *    The Button class does not need to change.
 *
 * 3. Reusable Commands:
 *    The same Command can be used by different invokers
 *    like buttons, menu items, keyboard shortcuts, or toolbars.
 *
 * 4. Dedicated Button for Each Action:
 *    Each Button is created with the Command it should perform.
 *
 *        Button boldButton = new Button(new BoldCommand(editor));
 *        Button italicButton = new Button(new ItalicCommand(editor));
 *
 *    Calling click() executes the assigned command.
 *
 *        boldButton.click();    // Makes text bold
 *        italicButton.click();  // Makes text italic
 *
 * 5. Flexible if Needed:
 *    Although each button has its own command, the command can
 *    still be changed later using setCommand() if the application's
 *    behavior needs to change at runtime.
 *
 * 6. Easier to Extend:
 *    Since every action is represented as a Command object,
 *    features like Undo/Redo, macro recording, logging,
 *    scheduling, and command history become much easier to implement.
 *
 * Command Pattern separates responsibilities:
 * - Button      -> Invoker (triggers the action)
 * - Command     -> Encapsulates the action
 * - TextEditor  -> Receiver (performs the actual work)
 * - TextEditorClient -> Creates and connects everything together
 */