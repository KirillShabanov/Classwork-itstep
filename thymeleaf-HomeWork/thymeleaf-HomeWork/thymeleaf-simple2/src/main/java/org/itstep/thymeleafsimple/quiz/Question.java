package org.itstep.thymeleafsimple.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private Long id;
    private String question;
    private List<String> answers;
    private int correctAnswer;
}
