package com.atsushi.kitazawa.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TestService {

  private final List<String> words = List.of("aaa", "bbb", "ccc");

  public List<String> all() {
    return words;
  }

  public String randomWord() {
    return words.get(new Random().nextInt(words.size()));
  }
}
