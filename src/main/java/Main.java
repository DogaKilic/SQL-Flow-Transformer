import processor.JDBCProcessor;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        JDBCProcessor jdbcProcessor = new JDBCProcessor();
        String path;
        if(args.length == 0) {
            path = "";
        }
        else {
            path = args[0];
        }
        //absolute path, change as you need
        jdbcProcessor.processClass("C:\\Users\\dogas\\IdeaProjects\\TestProj\\src\\main\\resources", "Scratch4", path);
    }
}