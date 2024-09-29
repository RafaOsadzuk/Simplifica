package com.example.demo.service;

import com.example.demo.models.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizService {

    public List<Question> getAllQuestions() {
        return Arrays.asList(
            new Question(1, "Qual o tipo de variável para valores inteiros?", "int"),
            new Question(2, "Qual é a extensão padrão de arquivos JavaScript?", ".js"),
            new Question(3, "Em Python, como você imprime algo na tela?", "print()")
        );
    }
}