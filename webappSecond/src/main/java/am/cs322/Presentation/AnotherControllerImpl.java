package am.cs322.Presentation;


import am.cs322.AnotherService;
import am.cs322.Presentation.model.CreateAnotherRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/another")
public class AnotherControllerImpl implements AnotherController {
    AnotherService anotherService;
    public AnotherControllerImpl(AnotherService anotherService) {
        this.anotherService = anotherService;
    }




    @Override
    @PostMapping
    public String createAccount(@RequestBody CreateAnotherRequest request) {
        return null;
    }
}
