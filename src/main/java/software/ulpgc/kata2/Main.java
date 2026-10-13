package software.ulpgc.kata2;

import java.io.*;
import java.util.List;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("monsters.csv");
             OutputStream outputStream = System.out){
            MonsterLoader loader = new CsvMonsterLoader();
            List<Monster> monsters = loader.load(inputStream);
            Map<String, Long> summary = MonsterAnalyzer.countMonsterBySourcebook(monsters);
            MonsterWriter.writerSummary(summary, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
