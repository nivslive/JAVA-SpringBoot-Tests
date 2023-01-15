package com.example.demo;

import com.example.demo.controller.NewController;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
                  NewController body = new NewController();
	@Test
	void testingStringOnGetHTTP() {
                    String b = this.body.home();
                    Assertions.assertEquals("Olá mundo!", b);
                      System.out.println(b);
	}
   	@Test
	void testingMapOnGetHTTP() {
                    Map<String, String> b = this.body.testHash();
                    System.out.println(b.size());
                    b.forEach((k, e) 
                                -> System.out.println(k + e));
                    //Assertions.assertEquals("Olá mundo!", b);
                      System.out.println(b);
	}
             
        

}
