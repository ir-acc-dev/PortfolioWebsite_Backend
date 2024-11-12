package com.portfolio.backend.service;

import com.portfolio.backend.entity.FaqQuestion;
import com.portfolio.backend.repository.FaqQuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FaqQuestionService {

    private final FaqQuestionRepository faqQuestionRepository;

    public FaqQuestion createFaqQuestion(FaqQuestion faqQuestion) {
        return faqQuestionRepository.save(faqQuestion);
    }

    public List<FaqQuestion> getAllFaqQuestions() {
        return faqQuestionRepository.findAll();
    }

    public FaqQuestion getFaqQuestionById(Long id) {
        return faqQuestionRepository.findById(id).orElse(null);
    }

    public void deleteFaqQuestionById(Long id) {
        faqQuestionRepository.deleteById(id);
    }

    public FaqQuestion updateFaqQuestion(FaqQuestion updatedFaqQuestion, Long id) {
        FaqQuestion existingFaqQuestion = faqQuestionRepository.findById(id).orElse(null);
        existingFaqQuestion.setQuestion(updatedFaqQuestion.getQuestion());
        return faqQuestionRepository.save(existingFaqQuestion);
    }
}
