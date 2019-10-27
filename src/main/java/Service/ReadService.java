package Service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReadService {

    String row;
    String filePath = "D://Projects//originChain//springframeworkad//spring-framework-03//src//main//resources//questions.csv";
    Map<String, String> questionsAnswer = new HashMap<String, String>();

    private WriteService writeService = new WriteService();

    public void read() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            questionsAnswer.put(data[0], data[1]);
        }
        writeService.write(questionsAnswer);
        csvReader.close();
    }
}
