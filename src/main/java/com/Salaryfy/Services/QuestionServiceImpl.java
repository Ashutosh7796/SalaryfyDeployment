package com.Salaryfy.Services;

import com.Salaryfy.Dto.QuestionDTO;
import com.Salaryfy.Entity.ExamQuestion;
import com.Salaryfy.Exception.SomethingWentWrong;
import com.Salaryfy.Interfaces.QuestionService;
import com.Salaryfy.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    @Override
    public void postQuestions(QuestionDTO questionDTO) {

        if (questionDTO.getQuestion()!= null) {
            ExamQuestion question = new ExamQuestion(questionDTO);
            questionRepo.save(question);
        }else {
            throw new SomethingWentWrong("Some thing went wrong");
        }
    }
}