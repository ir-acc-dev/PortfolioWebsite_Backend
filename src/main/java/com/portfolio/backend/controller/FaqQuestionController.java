package com.portfolio.backend.controller;

import com.portfolio.backend.entity.FaqQuestion;
import com.portfolio.backend.service.FaqQuestionsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/question")
public class FaqQuestionController {

    private final FaqQuestionsService faqQuestionsService;

    @PostMapping
    public ResponseEntity<FaqQuestion> createFaqQuestion(@RequestBody FaqQuestion faqQuestion) {
        FaqQuestion question = faqQuestionsService.createFaqQuestion(faqQuestion);
        return new ResponseEntity<>(question, HttpStatus.CREATED);
    }


}
