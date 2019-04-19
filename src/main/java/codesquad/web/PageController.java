package codesquad.web;

import codesquad.service.MenuCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private MenuCategoryService menuCategoryService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", menuCategoryService.findCategories());
        return "index";
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        model.addAttribute("categories", menuCategoryService.findCategories());
        return "admin";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/member/join")
    public String form() {
        return "join";
    }

}
