package htw.berlin.webtech.demo.homepage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "homepage";
    }

    @GetMapping("/home")
    public String homeTwo() {
        return "homepage";
    }

}
