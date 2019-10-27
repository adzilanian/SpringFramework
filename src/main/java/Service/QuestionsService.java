package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsService {


    public String questions(){
        List<String> list = new ArrayList<String>();
        list.add("What is your name?");
        list.add("How are you?");
        list.add("How old are you?");
        list.add("Where are you from?");
        list.add("What is your favorite food?");
        list.add("What day is it today?");
        list.add("What time is it?");
        return list.get(new Random().nextInt(6));

    }
}
