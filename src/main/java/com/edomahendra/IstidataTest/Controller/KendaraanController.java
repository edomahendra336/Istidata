package com.edomahendra.IstidataTest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edomahendra.IstidataTest.Model.Kendaraan;
import com.edomahendra.IstidataTest.Service.KendaraanService;

import org.springframework.ui.Model;

@Controller
public class KendaraanController {

	@Autowired
	private KendaraanService kendaraanService;
	//display List Kendaraan
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listKendaraan", kendaraanService.getAllKendaraan());
		return "index";
	}
	
	@GetMapping("/showNewKendaraanForm")
	public String showNewKendaraanForm(Model model) {
		Kendaraan kendaraan = new Kendaraan();
		model.addAttribute("kendaraan", kendaraan);
		return "new_kendaraan";
	}
	
	@PostMapping("/saveKendaraan")
	public String saveKendaraan(@ModelAttribute("kendaraan")Kendaraan kendaraan) {
		//Simpan Data Kendaraan Baru
		kendaraanService.saveKendaraan(kendaraan);
		return "redirect:/";
	}
	
	
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
		//Get Data
		Kendaraan kendaraan = kendaraanService.getKendaraanById(id);
		
		//Set Data
		model.addAttribute("kendaraan", kendaraan);
		return "update_kendaraan";
	}
	
	@GetMapping("/deleteKendaraan/{id}")
	public String deleteKendaraan(@PathVariable(value="id")long id, Model model) {
		// Delete
		this.kendaraanService.deleteKendaraanById(id);
		return "redirect:/";
	}
	@GetMapping("/showFormForDetail/{id}")
	public String showFormForDetail(@PathVariable(value="id") long id, Model model) {
		//Get Data
		Kendaraan kendaraan = kendaraanService.getKendaraanById(id);
		
		//Set Data
		model.addAttribute("kendaraan", kendaraan);
		return "detail_kendaraan";
	}
	
	
	

	
}
