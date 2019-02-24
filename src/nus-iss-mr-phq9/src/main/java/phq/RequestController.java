package phq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {

    @GetMapping("/start")
    public String start(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("name", name);
        PersonalInfoDto personalInfo = new PersonalInfoDto();
        model.addAttribute("personal_info", personalInfo);
        return "personal_info";
    }

    @GetMapping("/next")
    public String nextQuestion(@RequestParam(name="currentQ", defaultValue="0") int currentQ, Model model) {
        model.addAttribute("currentQ", currentQ);
        return "q"+(currentQ+1);
    }

    @GetMapping("/submit")
    public String submit(Model model) {
        return "complete";
    }

    @GetMapping("/genericAnswer")
    public String getGenericAnswer() {
        return "genericAnswer";
    }

    @GetMapping("/q10Answer")
    public String getQ10Answer() {
        return "q10Answer";
    }

    /*@GetMapping("/finalAnswer")
    public String getFinalAnswer() {
        return "finalAnswer";
    }*/
}
