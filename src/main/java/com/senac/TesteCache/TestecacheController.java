package com.senac.TesteCache;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestecacheController {

    private final TesteCacheService testeCacheService;

    public TestecacheController() {
        testeCacheService = null;
    }


}
