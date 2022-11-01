package ua.lviv.iot;

import ua.lviv.iot.manager.DictionaryReader;
import ua.lviv.iot.manager.Solver;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        LinkedList<String> dictionary = DictionaryReader.
                getDictionaryFrom("src/main/resources/wchain.in1.txt");
        Solver.solve(dictionary);
    }
}
