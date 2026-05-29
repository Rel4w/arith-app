package hei.school.arith.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DivisionServiceTest {

  @InjectMocks private DivisionService divisionService;

  @Test
  void divide_two_positive_numbers() {
    assertEquals(2L, divisionService.divide(6L, 3L));
  }

  @Test
  void divide_with_integer_result() {
    assertEquals(2L, divisionService.divide(5L, 2L));
  }

  @Test
  void divide_positive_by_negative() {
    assertEquals(-3L, divisionService.divide(9L, -3L));
  }

  @Test
  void divide_two_negatives() {
    assertEquals(3L, divisionService.divide(-9L, -3L));
  }

  @Test
  void divide_by_zero_throws_exception() {
    ArithmeticException ex =
        assertThrows(ArithmeticException.class, () -> divisionService.divide(5L, 0L));
    assertEquals("Division by zero is not allowed", ex.getMessage());
  }

  @Test
  void divide_zero_by_number() {
    assertEquals(0L, divisionService.divide(0L, 5L));
  }

  @Test
  void divide_large_numbers() {
    assertEquals(1_000_000L, divisionService.divide(1_000_000_000_000L, 1_000_000L));
  }
}
