package hei.school.arith.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubtractionServiceTest {

  @InjectMocks private SubtractionService subtractionService;

  @Test
  void subtract_two_positive_numbers() {
    assertEquals(1L, subtractionService.subtract(3L, 2L));
  }

  @Test
  void subtract_gives_negative() {
    assertEquals(-1L, subtractionService.subtract(2L, 3L));
  }

  @Test
  void subtract_two_negatives() {
    assertEquals(1L, subtractionService.subtract(-2L, -3L));
  }

  @Test
  void subtract_zero() {
    assertEquals(5L, subtractionService.subtract(5L, 0L));
  }

  @Test
  void subtract_same_numbers() {
    assertEquals(0L, subtractionService.subtract(7L, 7L));
  }

  @Test
  void subtract_very_large_numbers() {
    assertEquals(0L, subtractionService.subtract(Long.MAX_VALUE, Long.MAX_VALUE));
  }
}
