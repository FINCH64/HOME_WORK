package src.home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WarAndPiece {

    private String Story;
    private Set<String> setOfAllWords;
    private List<String> listOfAllWords;
    private Map<String, Integer> counts;
    private MapByValueSorter sorter;
    private long counterOfMap;

    WarAndPiece() throws IOException {
        sorter = new MapByValueSorter();
        Path fileName = Path.of("C:/","War_and_peace.txt");
        Story = Files.readString(fileName);
        setOfAllWords = new HashSet<>();
        listOfAllWords = new ArrayList<>();
        for (String word : Story.split("[\\*,\\.\t\n!\\?\\(\\)\\_ \\;\" \":=\\>\\< ]|-{2,}|\\B-|-\\B|(\\\\)")) {
            listOfAllWords.add(word);
            setOfAllWords.add(word);
        }
    }

    public long getAllWords() {
        return setOfAllWords.size();
    }

    public void findAllRepeats() {
        counts = new TreeMap<String, Integer>();

        for (String str : listOfAllWords) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }
        counts = sorter.sortByValue(counts);
    }


    public void getAllRepeats() {
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public void getNMostRepeatedWords(long count) {
        counterOfMap = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            counterOfMap++;
            if(counterOfMap > counts.entrySet().size() - count) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        WarAndPiece mainClass = new WarAndPiece();
        EasySearch searcher = new EasySearch();
        //Тестирование класса EasySearch
        System.out.println(searcher.search("Мама мыла раму ","Мыл"));

        //System.out.println(mainClass.getAllWords());
        mainClass.findAllRepeats();
//        mainClass.getNMostRepeatedWords(6);
//        mainClass.getAllRepeats();
//        System.out.println(searcher.search(mainClass.Story, " и "));
//        System.out.println(searcher.search(mainClass.Story, "война"));
//        System.out.println(searcher.search(mainClass.Story, "мир"));
    }
}
