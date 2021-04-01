package com.app.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.app.fizzbuzz.services.FizzBuzzService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class FizzBuzzServiceTest {

	@Autowired
	private FizzBuzzService service;
	
	@ParameterizedTest
	@CsvSource(value = { 
			"1, 1",
			"2, 2", 
			})
	
	void test_else_cases(int input,String expected) {
		assertThat(service.calculate(input)).isEqualTo(expected);
	}
	@ParameterizedTest
    @ValueSource(ints = {3,6})
    void isDivisible_by_3(int input) {
        assertThat(service.calculate(input)).isEqualTo("Fizz");
    }
	@ParameterizedTest
    @ValueSource(ints = {5,10})
    void iDivisible_by_5(int input) {
        assertThat(service.calculate(input)).isEqualTo("Buzz");
    }
	@ParameterizedTest
    @ValueSource(ints = {15,30})
    void isDivisible_by_3_and_5(int input) {
        assertThat(service.calculate(input)).isEqualTo("FizzBuzz");
    }
}
