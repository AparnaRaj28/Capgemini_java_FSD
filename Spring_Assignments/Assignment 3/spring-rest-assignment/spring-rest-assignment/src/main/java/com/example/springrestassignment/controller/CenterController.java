package com.example.springrestassignment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springrestassignment.model.Center;
import com.example.springrestassignment.repository.CenterRepository;
import com.example.springrestassignment.service.CenterService;


@RestController
public class CenterController 
{ 
  @Autowired
  JdbcTemplate template;
  
  @Autowired
  CenterRepository center_repository;
  
  @Autowired
  CenterService center_service;
  
  @RequestMapping("/")
  public ModelAndView Message()
  {
	  return new ModelAndView("home");
  }
  
  @GetMapping("/viewcenters")
  public ModelAndView ShowAllCenters()
  {
	  ModelAndView mav = new ModelAndView("viewcenters");
	  List<Center> centerList = center_service.getAll();
	  mav.addObject("centerList",centerList);
	   return mav;
	 
  }
  
	@GetMapping("/viewdistrict")
	public ModelAndView findByDistrict() 
	{
		return new ModelAndView("viewdistrict");
	}
	@GetMapping("/viewpincode")
	public ModelAndView findByPincode() 
	{
		return new ModelAndView("viewpincode");
	}
	
	@PostMapping("/districtlist")
	public ModelAndView districtList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("viewcenters");
		String district = request.getParameter("district");
		List<Center> centerList = center_service.getByDistrict(district);
		mav.addObject("centerList",centerList);
		return mav;
	}
	
	@PostMapping("/pincodelist")
	public ModelAndView pincodeList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("viewcenters");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		
		List<Center> centerList = center_service.getByPincode(pincode);
		mav.addObject("centerList",centerList);
		return mav;
	}
  
   // @RequestMapping(value="/addcenter", method=RequestMethod.POST)
    @PostMapping("/addcenter")
    public void addCenter(@RequestBody Center center)
    {
    	center_repository.save(center);
    }
    
	@GetMapping("/all")
	public ResponseEntity<List<Center>> getCenters(){
		List<Center> emp= (List<Center>) center_repository.findAll();
		
		return new ResponseEntity<List<Center>>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/api/{pincode}")
	public ResponseEntity<List<Center>> getCenterByPincode(@PathVariable int pincode)
	{
		
		List<Center> pincodelist=center_service.getCenterByPincode(pincode);
		
		return new ResponseEntity<List<Center>>(pincodelist,HttpStatus.OK);
	}
	
	@GetMapping("/api/vi/{district}")
	public ResponseEntity<List<Center>> getCenterByDistrict(@PathVariable String district)
	{
		
		List<Center> districtlist=center_service.getCenterByDistrict(district);
		
		return new ResponseEntity<List<Center>>(districtlist,HttpStatus.OK);
	}
	
	
	
}
