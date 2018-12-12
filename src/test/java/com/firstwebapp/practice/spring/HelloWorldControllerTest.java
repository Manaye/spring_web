package com.firstwebapp.practice.spring;
        import static org.junit.Assert.*;


        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

    @Test
    public void testCapitalizeString(){
        assertEquals("This should be capitalized", "THIS SHOULD BE CAPITALIZED", HelloWorldController.capitalizeString("this should be capitalized"));

        assertEquals("This should be hello world", "THIS SHOULD BE HELLO WORLD", HelloWorldController.capitalizeString("This should be hello world"));
    }
}
