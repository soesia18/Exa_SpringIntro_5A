package at.kaindorf.intro.web;

import at.kaindorf.intro.pojos.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/cars")
public class CarController {
    @GetMapping
    public String showCarForm (Model model) {
        Car car = new Car();
        model.addAttribute("car", car);

        log.info("GET request to /cars");
        return "cars";
    }

    @PostMapping
    public String processCarForm (@ModelAttribute(name = "car") Car car) {
        log.info("POST request tp /cars: " + car);
        return "showCarDetails";
    }
}
