package hei.school.arith.endpoint.rest.controller;

import hei.school.arith.model.OperationRequest;
import hei.school.arith.model.OperationResult;
import hei.school.arith.service.SubtractionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
@AllArgsConstructor
public class SubtractionController {

  private final SubtractionService subtractionService;

  @PostMapping("/subtraction")
  public OperationResult subtract(@RequestBody OperationRequest request) {
    return new OperationResult(subtractionService.subtract(request.a(), request.b()));
  }
}
