package Com.controller;
import com.java.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
 
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping("/hello/{name}")
    public Message message(@PathVariable String name) {
 
        Message msg = new Message(name, "Hello " + name);
        return msg;
    }
}
