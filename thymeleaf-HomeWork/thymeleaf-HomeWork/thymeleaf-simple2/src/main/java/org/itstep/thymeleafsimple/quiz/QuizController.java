package org.itstep.thymeleafsimple.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class QuizController {
    private Question question;

    @RequestMapping("/quiz")
    public String quiz (Model model){

        question = new Question(1L, "Question?",
                Arrays.asList("Wrong answer",
                        "Right answer",
                        "Wrong answer"), 1);
        model.addAttribute("question", question);
        return "quiz";
    }

    @RequestMapping( value="/check", method = RequestMethod.POST)
    public String check (@RequestBody Answer answer,
                         Model model){
        if (answer.getAnswer()==question.getCorrectAnswer())
            System.out.println("Correct");
        else
            System.err.println("Wrong");
        return "redirect:/quiz";
    }
}
