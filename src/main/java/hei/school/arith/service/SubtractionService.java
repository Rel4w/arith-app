package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
  public long subtract(long a, long b) {
    return a - b;
  }
}
