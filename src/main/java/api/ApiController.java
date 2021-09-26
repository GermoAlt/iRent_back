package api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping
    public void login(String username, String password){}

    @GetMapping
    public void getArticulos(){}

    @GetMapping
    public void getArticulos(String username){}

    @PostMapping
    public void publicarArticulo(){}
}
