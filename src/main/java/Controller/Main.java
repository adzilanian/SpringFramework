package Controller;


import Service.ReadService;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class Main {

    public static void main(String[] args) throws IOException {
         new ReadService().read();
    }
}
