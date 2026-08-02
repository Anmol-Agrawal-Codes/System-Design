package CommandPattern.WithoutCommandPattern;

class TextEditorClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        BoldButton boldButton = new BoldButton(editor);
        ItalicButton itelicButton = new ItalicButton(editor);
        UnderlineButton underlineButton = new UnderlineButton(editor);

        boldButton.click();
        itelicButton.click();
        underlineButton.click();
    }
}


/*
 * Design Problems (Without Command Pattern)
 *
 * 1. Tight Coupling:
 *    Every button is tightly coupled to TextEditor. If the editor API changes,
 *    each button class must also be modified.
 *
 * 2. Code Duplication:
 *    Every new action (Bold, Italic, Underline, Copy, Paste, Undo, etc.)
 *    requires creating another button class with nearly identical code.
 *
 * 3. Violates Open/Closed Principle:
 *    Adding a new editor action requires modifying the UI layer by creating
 *    another button implementation instead of simply plugging in a new behavior.
 *
 * 4. Poor Reusability:
 *    The editing operation cannot be reused by other invokers like menu items,
 *    keyboard shortcuts (Ctrl+B), toolbar icons, macros, or voice commands.
 *    Each invoker would need to duplicate the same logic.
 *
 * 5. Difficult to Support Undo/Redo:
 *    Since actions are just direct method calls, there is no object representing
 *    the operation. Features like Undo, Redo, action history, logging, queuing,
 *    scheduling, or macro recording become difficult to implement.
 *
 * Command Pattern solves these issues by encapsulating every action inside a
 * Command object, separating the Invoker (Button) from the Receiver (TextEditor).
 */