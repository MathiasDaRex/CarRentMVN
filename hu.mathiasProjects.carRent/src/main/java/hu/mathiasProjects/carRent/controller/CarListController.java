package hu.mathiasProjects.carRent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hu.mathiasProjects.carRent.entity.Cars;
import hu.mathiasProjects.carRent.service.CarService;

@Controller
public class CarListController {

	@Autowired
	private CarService cs;
	
	@GetMapping("crs/list/")
	public String viewList(Model model) {
		System.out.println("szia! ez működik");
		System.out.println("GECEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		List<Cars> all = cs.getAll();
		for (Cars item : all) {
			System.out.println(item.getCarBrand());
		}
		model.addAttribute("cars", all);
		return "carList";

	}
	
}
