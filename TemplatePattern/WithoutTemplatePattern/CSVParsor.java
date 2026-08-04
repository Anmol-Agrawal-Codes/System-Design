package TemplatePattern.WithoutTemplatePattern;

public class CSVParsor {

    public CSVParsor(){

    }

    public void parseFile(){
        start();
        parse();
        close();
    }

    public void parse(){
        System.out.println("Parsing to CSV format.");
    }

    public void start(){
        System.out.println("Start Parsing.");
    }
    
    public void close(){
        System.out.println("Parsing Done.");
    }
}
