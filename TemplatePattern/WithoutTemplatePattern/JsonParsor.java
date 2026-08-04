package TemplatePattern.WithoutTemplatePattern;

public class JsonParsor {

    public JsonParsor(){
        
    }

    public void parseFile(){
        start();
        parse();
        close();
    }

    public void parse(){
        System.out.println("Parsing to JSON format.");
    }

    public void start(){
        System.out.println("Start Parsing.");
    }
    
    public void close(){
        System.out.println("Parsing Done.");
    }
}
