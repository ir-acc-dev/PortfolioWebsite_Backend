CREATE TABLE faq_questions
(
    id       BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    question VARCHAR(255),
    CONSTRAINT pk_faqquestions PRIMARY KEY (id)
);