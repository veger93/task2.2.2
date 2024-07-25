package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
@RequestMapping()
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "cars")
    String getCars(Model model) {
        model.addAttribute("cars", carService.index());
        return "cars";
    }

    @GetMapping("cars{count}")
    String getCarsNum(@PathVariable("count") int count, Model model) {
        model.addAttribute("cars", carService.carsquantity(count));
        return "cars";
    }
}
