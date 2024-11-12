package com.portfolio.backend.controller;

import com.portfolio.backend.entity.FaqQuestion;
import com.portfolio.backend.service.FaqQuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/question")
public class FaqQuestionController {

    private final FaqQuestionService faqQuestionService;

    @PostMapping
    public ResponseEntity<FaqQuestion> createFaqQuestion(@RequestBody FaqQuestion faqQuestion) {
        FaqQuestion question = faqQuestionService.createFaqQuestion(faqQuestion);
        return new ResponseEntity<>(question, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FaqQuestion>> getAllFaqQuestions() {
        List<FaqQuestion> questions = faqQuestionService.getAllFaqQuestions();
        return ResponseEntity.ok(questions);
    }

    @GetMapping({"{id}"})
    public ResponseEntity<FaqQuestion> getFaqQuestionById(@PathVariable Long id) {
        FaqQuestion question = faqQuestionService.getFaqQuestionById(id);
        return ResponseEntity.ok(question);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteFaqQuestionById(@PathVariable Long id) {
        faqQuestionService.deleteFaqQuestionById(id);
        return ResponseEntity.ok("Deleted faq question");
    }

    @PutMapping("{id}")
    public ResponseEntity<FaqQuestion> updateFaqQuestion(@RequestBody FaqQuestion faqQuestion, @PathVariable Long id) {
        FaqQuestion question = faqQuestionService.updateFaqQuestion(faqQuestion, id);
        return ResponseEntity.ok(question);
    }

}
