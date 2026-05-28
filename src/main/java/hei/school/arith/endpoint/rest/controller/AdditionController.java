package hei.school.arith.endpoint.rest.controller;

import hei.school.arith.model.OperationRequest;
import hei.school.arith.model.OperationResult;
import hei.school.arith.service.AdditionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
@AllArgsConstructor
public class AdditionController {

  private final AdditionService additionService;

  @PostMapping("/addition")
  public OperationResult add(@RequestBody OperationRequest request) {
    return new OperationResult(additionService.add(request.a(), request.b()));
  }
}
