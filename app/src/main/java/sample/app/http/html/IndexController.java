package sample.app.http.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sample.app.http.dtos.IndexDto;

@Controller
@RequestMapping(value = "/")
public class IndexController {

  @GetMapping
  public String index(@ModelAttribute IndexDto index, Model model) {
    model.addAttribute("index", index);
    return "index";
  }
}
