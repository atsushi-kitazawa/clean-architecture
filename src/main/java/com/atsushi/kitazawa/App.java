package com.atsushi.kitazawa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.atsushi.kitazawa.service.TestService;

@Component
@ComponentScan(basePackages="com.atsushi.kitazawa")
public class App {

  @Autowired private TestService testService;

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    context.getBean(App.class).run();
    context.close();
  }

  public void run() {
    List<String> words = testService.all();
    words.stream().forEach(word -> System.out.println(word));
  }
}
