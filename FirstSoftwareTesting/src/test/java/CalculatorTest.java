import static org.junit.Assert.*;

import com.demo.Calculator;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class CalculatorTest {
	@DisplayName("Add operation test")
    @RepeatedTest(5)
	@Test
	public void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {

        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }
	@BeforeAll
    public static void init(){
        System.out.println("BeforeAll init() method called");
    }

    @AfterEach
    public void initEach1(){
        System.out.println("afterEach initEach() method called");
    }
    @AfterAll
    public static void init1(){
        System.out.println("afterAll init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("BeforeEach initEach() method called");
    }
}
