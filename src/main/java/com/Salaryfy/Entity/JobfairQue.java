package com.Salaryfy.Entity;

import com.Salaryfy.Dto.JobFairQue.JobFairQueDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobfairque")
public class JobfairQue{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobFairQ1Id", nullable = false)
    private Integer JobFairQ1Id;

    @Column(name = "Question", length = 45)
    private String question;

    @Column(name = "QuestionType")
    private String questionType;

    @Column(name = "SetNo", length = 45)
    private String setNo;

    public JobfairQue() {
    }

    public JobfairQue(JobFairQueDto jobFairQueDto){
        this.question = jobFairQueDto.getQuestion();
        this.questionType = jobFairQueDto.getQuestionType();
        this.setNo = jobFairQueDto.getSetNo();
    }
}