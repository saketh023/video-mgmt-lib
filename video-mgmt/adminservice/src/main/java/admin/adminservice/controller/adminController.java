package admin.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import admin.adminservice.model.customer;
import admin.adminservice.model.movieservicesDto;
import admin.adminservice.service.adminservice;
import admin.adminservice.service.adminservicefeignproxy;




@RestController
@RequestMapping("/customer")
public class adminController {
	
	@Autowired
	adminservice service;
	
	
	
	
	@PostMapping("/add")
	public ResponseEntity<customer> insertTheCustomer(@RequestBody customer customer){
		return new ResponseEntity(service.insertCustomer(customer), HttpStatus.ACCEPTED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<customer>> getAll(){
		return  new ResponseEntity(service.getAllcustomers(),HttpStatus.OK);
	}
	
	@PostMapping("admin/all")
	public ResponseEntity<List<movieservicesDto>> insertmovies(@RequestBody movieservicesDto movieservicesDto ){
		return  new ResponseEntity(service.insertmovies(movieservicesDto),HttpStatus.OK);
	}
	
	@DeleteMapping("admin/delete")
	public ResponseEntity<List<movieservicesDto>> Deletemovie(@RequestBody movieservicesDto movieservicesDto ){
		return  new ResponseEntity(service.Deletemovies(movieservicesDto),HttpStatus.OK);
	}
	

}
