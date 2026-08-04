package TemplatePattern.WithTemplatePattern;

public abstract class Parser {
    public void parseFile(){
        openFile();
        parse();
        closeFile();
    }

    public abstract void parse();

    public void openFile(){
        System.out.println("Opening File.");
    }

    public void closeFile(){
        System.out.println("Closing File.");
    }
}
