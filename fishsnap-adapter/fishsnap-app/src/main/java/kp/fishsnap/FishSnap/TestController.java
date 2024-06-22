package kp.fishsnap.FishSnap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class TestController {

    @GetMapping("/test")
    String test(){
        return "index";
    }
}
