public class TextEditorClient {
    public static void main(String[] args) {
        // Resonsible for storing the snapshots of editor without knowing any thing about it.
        Caretaker caretaker = new Caretaker();

        TextEditor editor = new TextEditor();

        editor.setContent("Hello");
        caretaker.saveSnapshot(editor);

        editor.setContent("Hello World");
        caretaker.saveSnapshot(editor);

        System.out.println(editor.getContent());
        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }
}


/*
 * MEMENTO PATTERN - CODE STORY
 *
 * Imagine a text editor where the user keeps typing and expects Undo to work.
 *
 * 1. The TextEditor owns the current content. Since it knows its complete state,
 *    only it can create a snapshot (save()) and restore itself (restore()).
 *
 * 2. Each snapshot is stored inside an EditorMemento. The memento is immutable,
 *    so once a snapshot is created, it can never be accidentally modified.
 *
 * 3. The Caretaker does not know anything about the editor's content. It simply
 *    keeps a history of snapshots, similar to an Undo stack. This separation
 *    allows the editor to focus on editing while the caretaker focuses on
 *    history management (Single Responsibility Principle).
 *
 * 4. When saveSnapshot() is called:
 *      Editor -> creates snapshot
 *      Caretaker -> stores snapshot
 *
 * 5. When undo() is called:
 *      - Remove the current snapshot (current state is no longer needed)
 *      - Restore the previous snapshot, if one exists
 *
 * Data Flow:
 *
 *      User edits text
 *             |
 *             v
 *      TextEditor (Originator)
 *             |
 *          save()
 *             |
 *             v
 *     EditorMemento (Snapshot)
 *             |
 *     Caretaker stores history
 *             |
 *          undo()
 *             |
 *             v
 *      TextEditor.restore()
 *
 * Key Design Idea:
 * - Originator (TextEditor): Knows HOW to save and restore its state.
 * - Memento: Stores a read-only snapshot of that state.
 * - Caretaker: Knows WHEN to save, undo, or redo, but never knows WHAT is inside the snapshot.
 *
 * Think of it like a Camera and a Photo Album:
 * - Camera (Editor) takes photos.
 * - Photo (Memento) stores the moment.
 * - Album (Caretaker) organizes the photos and lets you go back to an older one.
 */