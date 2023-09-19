package com.senac.TesteCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCacheController {

    private final TesteCacheService testeCacheService;

    @Autowired
    public TesteCacheController(TesteCacheService testeCacheService) {
        this.testeCacheService = testeCacheService;
    }

    @GetMapping("/getCachevalor")
    public String getCacheValue(@RequestParam String valor) {
        return testeCacheService.getvalor(valor);
    }

    @PostMapping("/limparCache")
    public void clearCache() {
        testeCacheService.limparCache();
    }
}
