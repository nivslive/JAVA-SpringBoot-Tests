package com.example.demo;

import com.example.demo.controller.NewController;
import com.example.demo.dto.UserDTO;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
                  NewController body = new NewController();
	@Test
	void testingStringOnGetHTTP() {
                    Map<String, String> b = this.body.testing();
                    Assertions.assertTrue(b.size() == 4);
                      System.out.println(b);
	}
   	@Test
	void testingMapOnGetHTTP() {
                    Map<String, String> b = this.body.testing();
                    System.out.println(b + "testando");
                    Assertions.assertEquals(3, b.size(), "The method should be returned 3 key maps");
                    // Assertions.assertLinesMatch(b, b);
                    //b.forEach((k, e) 
                    //            -> System.out.println(k + e));
                    //Assertions.assertEquals("Olá mundo!", b);
                     // System.out.println(b);
	}
             
        

}
