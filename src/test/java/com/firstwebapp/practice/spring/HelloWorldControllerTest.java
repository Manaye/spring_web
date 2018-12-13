<<<<<<< HEAD
package com.firstwebapp.practice.spring;
        import static org.junit.Assert.*;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

public class HelloWorldControllerTest {

    @Test
    public void testCapitalizeString(){
        assertEquals("This should be capitalized", "THIS SHOULD BE CAPITALIZED", HelloWorldController.capitalizeString("this should be capitalized"));

    }
}
=======
package com.firstwebapp.practice.spring;
        import static org.junit.Assert.*;


        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

public class HelloWorldControllerTest {

    @Test
    public void testCapitalizeString(){
        assertEquals("This should be capitalized", "THIS SHOULD BE CAPITALIZED", HelloWorldController.capitalizeString("this should be capitalized"));



    }
}
>>>>>>> a85237e8510777043f3e4a5fffe9316be82fb4bd
