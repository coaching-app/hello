package arq.wakana.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping(path = "/auth-service")
public class Controller {

  @GetMapping(path = "/hello")
  public @ResponseBody String hello() {
    return "Hello from Wakana's Basecampdddd";
  }

}
