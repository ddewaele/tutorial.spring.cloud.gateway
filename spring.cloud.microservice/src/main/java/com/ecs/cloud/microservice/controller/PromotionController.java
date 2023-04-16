package com.ecs.cloud.microservice.controller;

import com.ecs.cloud.microservice.model.Promotion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromotionController {

    @GetMapping("/promotions")
    public List<Promotion> getPromotions() {
        return List.of(
                Promotion.builder().withId(1L).withName("Promotion 1").build(),
                Promotion.builder().withId(2L).withName("Promotion 2").build(),
                Promotion.builder().withId(3L).withName("Promotion 3").build()
        );

    }


}
