package TemplatePattern.WithoutTemplatePattern;

public class ParserClient {
    public static void main(String[] args) {
        JsonParsor jsonParsor = new JsonParsor();
        CSVParsor csvParsor = new CSVParsor();

        jsonParsor.parseFile();
        csvParsor.parseFile();
    }
}
