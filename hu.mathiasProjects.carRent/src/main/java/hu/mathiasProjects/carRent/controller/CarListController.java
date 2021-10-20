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
	
	@GetMapping("crs/home/")
	public String viewIndex(Model model) {
		System.out.println("itt a kibaszott főoldal geci");
		return "home";
	}
	
	@GetMapping("crs/rules/")
	public String viewRules(Model model) {
		return "rules";
	}
	
	@GetMapping("crs/faq/")
	public String viewFaq(Model model) {
		return "faq";
	}
	
	@GetMapping("crs/login/")
	public String viewLogin(Model model) {
		return "login";
	}
	
	@GetMapping("crs/reg/")
	public String viewReg(Model model) {
		return "reg";
	}
	
	@GetMapping("crs/contact/")
	public String viewContact(Model model) {
		return "contact";
	}
	
	@GetMapping("crs/admin/cars")
	public String viewAdminCars(Model model) {
		List<Cars> all = cs.getAll();
		model.addAttribute("cars", all);
		return "adminCars";
	}
	
	
}
