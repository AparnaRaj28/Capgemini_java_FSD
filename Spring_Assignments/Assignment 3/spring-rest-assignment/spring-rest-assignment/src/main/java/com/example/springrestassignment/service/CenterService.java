package com.example.springrestassignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestassignment.model.Center;
import com.example.springrestassignment.repository.CenterRepository;

@Service
public class CenterService 
{
   @Autowired
   CenterRepository center_repository;
   
   
	public List<Center> getAll()
	{
		return (List<Center>)center_repository.findAll();
	}
	
	
	public List<Center> getByDistrict(String district)
	{
		List<Center> centerList = (List<Center>)center_repository.findAll();
		return centerList.stream().filter(center -> center.getCenter_district().equals(district)).collect(Collectors.toList());
	}
	
	public List<Center> getByPincode(int pincode){
		List<Center> centerList = (List<Center>)center_repository.findAll();
		return centerList.stream().filter(center -> center.getCenter_pincode()==pincode).collect(Collectors.toList());
	}
	
   public List<Center> getCenterByPincode(int pincode)
   {
	   List<Center> pincodelist=new ArrayList<>();
	   List<Center> centerlist= (List<Center>) center_repository.findAll();
	   for(Center c:centerlist)
	   {
		   if(c.getCenter_pincode() == pincode)
		   {
			   pincodelist.add(c);
		   }
	   }
	   return pincodelist;
   }
   
   public List<Center> getCenterByDistrict(String district)
   {
	   List<Center> districtlist=new ArrayList<>();
	   List<Center> centerlist= (List<Center>) center_repository.findAll();
	   for(Center c:centerlist)
	   {
		   if(c.getCenter_district().equals(district))
		   {
			   districtlist.add(c);
		   }
	   }
	   return districtlist;
   }
   
//   public List<Center> getCenterByPincode(Long pincode)
//   {
//	   List<Center> pincodelist=new ArrayList<>();
//	   List<Center> centerlist= (List<Center>) center_repository.findAll();
//	   for(Center c:centerlist)
//	   {
//		   if(c.getCenter_pincode()== pincode)
//		   {
//			   pincodelist.add(c);
//		   }
//	   }
//	   return pincodelist;
//   }
}
