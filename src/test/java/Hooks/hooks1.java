package Hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.qameta.allure.Allure;
import org.junit.After;

public class hooks1 {


    @Before
    public void before(){
        Allure.step("Starting the test - Before Hook");  // Logs in Allure

        System.out.println("Before entering into stepdef");
    }
    @After
    public void After(){
        Allure.step("after the test - Before Hook");  // Logs in Allure

        System.out.println("After done with the stepdef");
    }
    @BeforeStep
    public void beforeStep(){
        Allure.step("Starting the test - Before entering into each step");  // Logs in Allure

        System.out.println("Before entering into each step");
    }
    @AfterStep
    public void AfterStep(){
        Allure.step("Starting the test - After done with each step");  // Logs in Allure

        System.out.println("After done with each step");
    }
}
