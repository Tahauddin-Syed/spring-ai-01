package com.tahauddin.syed.service.impl;

import com.tahauddin.syed.service.OpenAIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswers() {
        String tellMeADadJoke = openAIService.getAnswers("can you prepare python script to extract data from image?");
        System.out.printf("Response is :: " + tellMeADadJoke);

    }
}