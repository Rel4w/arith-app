package hei.school.arith.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdditionServiceTest {

  @InjectMocks private AdditionService additionService;

  @Test
  void add_two_positive_numbers() {
    assertEquals(5L, additionService.add(2L, 3L));
  }

  @Test
  void add_positive_and_negative() {
    assertEquals(-1L, additionService.add(2L, -3L));
  }

  @Test
  void add_two_negatives() {
    assertEquals(-5L, additionService.add(-2L, -3L));
  }

  @Test
  void add_with_zero() {
    assertEquals(7L, additionService.add(7L, 0L));
  }

  @Test
  void add_very_large_numbers() {
    assertEquals(Long.MAX_VALUE - 1, additionService.add(Long.MAX_VALUE / 2, Long.MAX_VALUE / 2));
  }
}
