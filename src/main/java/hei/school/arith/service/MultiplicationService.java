package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
  public long multiply(long a, long b) {
    return a * b;
  }
}
