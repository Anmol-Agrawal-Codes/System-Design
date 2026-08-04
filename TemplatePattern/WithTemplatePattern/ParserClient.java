package TemplatePattern.WithTemplatePattern;

public class ParserClient {
    public static void main(String[] args) {
        Parser jsonParser = new JsonParser();
        Parser csvParser = new CSVParser();

        jsonParser.parseFile();
        csvParser.parseFile();
    }
}


/*
 * TEMPLATE METHOD PATTERN - CODE STORY
 *
 * Imagine an application that can parse different file formats like JSON, CSV,
 * XML, etc. Although each format has its own parsing logic, every parser follows
 * the same overall workflow:
 *
 *      Open File -> Parse File -> Close File
 *
 * 1. The abstract Parser class defines this fixed workflow inside parseFile().
 *    This method is called the Template Method because it defines the algorithm's
 *    skeleton while leaving some steps to subclasses.
 *
 * 2. The parse() method is abstract because the parsing logic differs for each
 *    file format. Each subclass (JsonParser, CSVParser, etc.) provides its own
 *    implementation of this step.
 *
 * 3. The common operations (opening and closing the file) are implemented once
 *    in the base class, eliminating code duplication and ensuring every parser
 *    follows the same sequence of operations.
 *
 * 4. When parseFile() is called:
 *      Parser -> opens the file
 *      Subclass -> performs format-specific parsing
 *      Parser -> closes the file
 *
 * Execution Flow:
 *
 *      Client
 *         |
 *         v
 *   Parser.parseFile()      <-- Template Method
 *         |
 *         +--> openFile()
 *         |
 *         +--> parse()      <-- Implemented by subclasses
 *         |
 *         +--> closeFile()
 *
 * Key Design Idea:
 * - Abstract Class (Parser): Defines the algorithm skeleton.
 * - Template Method (parseFile): Controls the execution order.
 * - Concrete Classes (JsonParser, CSVParser): Customize only the variable step.
 *
 * Benefits:
 * - Eliminates duplicate code.
 * - Enforces a consistent workflow.
 * - Follows the Open/Closed Principle:
 *   New parsers can be added without modifying the existing algorithm.
 *
 * Think of it like making coffee using different coffee beans:
 * - The recipe is always:
 *      Boil Water -> Brew Coffee -> Pour into Cup
 * - Only the brewing step changes depending on the type of coffee.
 * - The recipe (algorithm) remains the same, while one step is customized.
 */