package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
  public long add(long a, long b) {
    return a + b;
  }
}
