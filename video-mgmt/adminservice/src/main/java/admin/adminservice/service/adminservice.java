package admin.adminservice.service;



import java.util.List;
import java.util.Optional;

import admin.adminservice.model.*;


public interface adminservice {
	
	
	public customer insertCustomer(customer customer);
	public List<customer> getAllcustomers();
	public List<movieservicesDto> insertmovies(movieservicesDto movieservicesDto);
	public String Deletemovies(movieservicesDto movieservicesDto);

	
	
	
	
	
}