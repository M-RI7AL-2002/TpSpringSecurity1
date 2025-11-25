package ma.ens.spring_security.conntroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Page Home";
    }
    @GetMapping("user/dashboard")
    public String userDashboard() {
        return "Page User Dashboard";
    }
    @GetMapping("admin/dashboard")
    public String adminDashboard() {
        return "Page Admin Dashboard";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "login";

    }
}
