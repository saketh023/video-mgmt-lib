package admin.adminservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import admin.adminservice.model.movieservicesDto;



@FeignClient(name="movieservices",url="http://localhost:8083/customer/")

public interface adminservicefeignproxy {
	@PostMapping("/add")
	public List<movieservicesDto> insertTheMovie( movieservicesDto movieservicesDto);
	
	@DeleteMapping("/delete")
	public String deleteCustomer(movieservicesDto movieservicesDto);
	
	

}
