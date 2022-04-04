package security.contrloller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAll(){
        return "view_info_for_all";
    }
    @GetMapping("/game")
    public String game(){
        return "view_game";
    }

    @GetMapping("/admin")
    public String admin() {
        return "view_admin";
    }

}
