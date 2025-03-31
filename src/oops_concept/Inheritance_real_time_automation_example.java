package oops_concept;

public class Inheritance_real_time_automation_example {
   static class BaseTest {
        void setup() {
            System.out.println("Open browser");
        }
        void tearDown() {
            System.out.println("Close browser");
        }
   }

    static class LoginTest extends BaseTest {
        void testLogin() {
            System.out.println("Test Login Functionality");
        }
    }

    public static class Login_feature {
        public static void main(String[] args) {
            LoginTest test = new LoginTest();
            test.setup();      // Inherited from BaseTest
            test.testLogin();  // Own method
            test.tearDown();   // Inherited from BaseTest
        }
    }
}
