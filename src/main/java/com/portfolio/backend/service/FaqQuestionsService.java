package com.portfolio.backend.service;

import com.portfolio.backend.entity.FaqQuestion;
import com.portfolio.backend.repository.FaqQuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FaqQuestionsService {

    private final FaqQuestionRepository faqQuestionRepository;

    public FaqQuestion createFaqQuestion(FaqQuestion faqQuestion) {
        return faqQuestionRepository.save(faqQuestion);
    }
}
