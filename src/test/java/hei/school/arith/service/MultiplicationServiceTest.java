package hei.school.arith.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MultiplicationServiceTest {

  @InjectMocks private MultiplicationService multiplicationService;

  @Test
  void multiply_two_positive_numbers() {
    assertEquals(6L, multiplicationService.multiply(2L, 3L));
  }

  @Test
  void multiply_positive_and_negative() {
    assertEquals(-6L, multiplicationService.multiply(2L, -3L));
  }

  @Test
  void multiply_two_negatives() {
    assertEquals(6L, multiplicationService.multiply(-2L, -3L));
  }

  @Test
  void multiply_by_zero() {
    assertEquals(0L, multiplicationService.multiply(99L, 0L));
  }

  @Test
  void multiply_by_one() {
    assertEquals(5L, multiplicationService.multiply(5L, 1L));
  }

  @Test
  void multiply_large_numbers() {
    assertEquals(1_000_000_000_000L, multiplicationService.multiply(1_000_000L, 1_000_000L));
  }
}
