package com.portfolio.backend.repository;

import com.portfolio.backend.entity.FaqQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaqQuestionRepository extends JpaRepository<FaqQuestion, Long> {
}
