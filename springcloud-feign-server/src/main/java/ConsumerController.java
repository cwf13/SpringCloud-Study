import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name + ",Hello World";
    }
}
