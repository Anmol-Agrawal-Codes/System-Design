package StatePattern.WithStatePattern;

public class Client {
    public static void main(String[] args) {
        Document document = new Document();
        
        document.publish();
        document.publish();
        document.publish();
        document.publish();
    }    
}

/*
 * STATE PATTERN - CODE STORY
 *
 * Imagine a document publishing system like Google Docs, Notion, or Confluence.
 * Every document passes through a workflow before it becomes publicly available.
 *
 *      Draft  --->  Moderation  --->  Published
 *
 * Problem:
 * --------
 * The behavior of the document changes depending on its current state.
 *
 * For example:
 * - A Draft document should move to Moderation.
 * - A document in Moderation should become Published.
 * - A Published document should not be published again.
 *
 * A common implementation is to store the state as an enum/string and write:
 *
 *      if(state == DRAFT) { ... }
 *      else if(state == MODERATION) { ... }
 *      else if(state == PUBLISHED) { ... }
 *
 * As more states are introduced (Archived, Rejected, Scheduled, etc.),
 * these conditionals become difficult to maintain and violate the
 * Open/Closed Principle.
 *
 * Solution:
 * ---------
 * Instead of asking "What state am I in?",
 * let each State object decide what should happen.
 *
 * 1. The Document (Context) owns the current state.
 *    It delegates every publish request to its current State object.
 *
 * 2. Each State class contains only the behavior for that specific state.
 *    It also decides which state should come next.
 *
 * 3. The Context never contains if-else or switch statements for state
 *    transitions. It simply forwards the request.
 *
 * 4. When publish() is called:
 *
 *      Document.publish()
 *              |
 *              v
 *      Current State handles the request
 *
 *      DraftState
 *          -> Prints "Moving Document to Moderation."
 *          -> Changes state to ModerationState
 *
 *      ModerationState
 *          -> Prints "Publishing Document"
 *          -> Changes state to PublishState
 *
 *      PublishState
 *          -> Prints "Document already published."
 *          -> State remains unchanged
 *
 * Data Flow:
 *
 *      Client
 *         |
 *         v
 *   Document.publish()
 *         |
 *         v
 *   Current State Object
 *         |
 *   Performs business logic
 *         |
 *   Changes Document's state (if required)
 *         |
 *         v
 *     Next State
 *
 * Key Design Idea:
 * ----------------
 * - Context (Document): Holds the current state and delegates behavior.
 * - State Interface: Defines behavior common to all states.
 * - Concrete States: Implement state-specific behavior and state transitions.
 *
 * Think of it like a Traffic Signal:
 * - The Traffic Light (Context) knows only its current color.
 * - Each color (State) decides what the next color should be.
 * - Red -> Green
 * - Green -> Yellow
 * - Yellow -> Red
 *
 * The Traffic Light never contains a giant if-else statement to determine
 * the next color—it simply asks the current State to handle the transition.
 *
 * Benefits:
 * ---------
 * ✔ Eliminates complex if-else/switch statements.
 * ✔ Follows the Open/Closed Principle.
 * ✔ Each state has a single responsibility.
 * ✔ Easy to introduce new states (Archived, Rejected, Review, Scheduled)
 *   without modifying existing state classes.
 * ✔ Makes state transitions explicit, maintainable, and scalable.
 */