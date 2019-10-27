package Service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;

@Service
public class WriteService {


    public String write(Map<String, String> questions) {

        Scanner sc = new Scanner(System.in);
        if (!questions.isEmpty()) {
            for (Map.Entry<String,String> question : questions.entrySet()) {
                System.out.println(question.getValue());
                String input = sc.next();
                if (input.equals(question.getKey())){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
                return input;
            }
        }
        sc.close();
      return "OK";
    }


}
