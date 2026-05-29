package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
  public long divide(long a, long b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return a / b;
  }
}
