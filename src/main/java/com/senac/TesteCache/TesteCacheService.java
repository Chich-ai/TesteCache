package com.senac.TesteCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TesteCacheService {

    @Cacheable(value = "teste", key = "#valor")
    public String getvalor(String valor){
        return "retorno é: " + valor;
    }
    @CacheEvict(value = "teste", allEntries = true)
    public void limparCache() {

    }
}
