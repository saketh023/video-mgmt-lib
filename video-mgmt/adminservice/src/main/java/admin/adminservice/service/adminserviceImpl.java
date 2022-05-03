package admin.adminservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import admin.adminservice.model.customer;
import admin.adminservice.model.movieservicesDto;
import admin.adminservice.Dao.customerDao;


@Service
public class adminserviceImpl implements adminservice{
	
	@Autowired
	customerDao dao;
	
	@Autowired
    adminservicefeignproxy proxy;

	
	

	@Override
	public customer insertCustomer(customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}




	@Override
	public List<customer> getAllcustomers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public String Deletemovies(movieservicesDto movieservicesDto) {
		// TODO Auto-generated method stub
		 return proxy.deleteCustomer(movieservicesDto);
	}



	@Override
	public List<movieservicesDto> insertmovies(movieservicesDto movieservicesDto) {
		// TODO Auto-generated method stub
		return proxy.insertTheMovie(movieservicesDto);
	}




	
	}



	
