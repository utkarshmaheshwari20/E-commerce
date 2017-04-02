package com.niit.utk.controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.niit.utk.dao.CarDAO;
import com.niit.utk.model.Car;

@Controller
public class CarController {

	@Autowired
	CarDAO carDAO;

	public CarController() {
		System.out.println("Instantiating Admin Controller");
	}

	@RequestMapping("/admin/product/getallproducts")
	public String displayAllCar(Model model) {
		List<Car> cars = carDAO.getAllCars();
		model.addAttribute("carlist", cars);
		return "viewallproduct";
	}

	@RequestMapping("/admin/product/showproductform")
	public String showForm(Model model) {
		model.addAttribute("carObj", new Car());
		return "addproductform";
	}

	@RequestMapping("/admin/product/addproduct")
	public String addProduct(@Valid @ModelAttribute("carObj") Car car, BindingResult result) {
		if(result.hasErrors())
			return "addproductform";
		Car newCar=carDAO.insertCar(car);
		MultipartFile carImage=car.getImg();
		if(!carImage.isEmpty())
		{
			Path paths=Paths.get("C:/Users/hp/workspace/CarPortal/src/main/webapp/WEB-INF/resources/images/"+car.getId()+".png");
			try{
				carImage.transferTo(new File(paths.toString()));
			}
			catch(Exception exp){
				exp.printStackTrace();
			}
			
		}
		return "redirect:/admin/product/getallproducts";
	}

	@RequestMapping(value = "/admin/product/removeproduct/{id}")
	public String removeProduct(@PathVariable int id) {
		carDAO.deleteCar(id);
		return "redirect:/admin/product/getallproducts";
	}

}
