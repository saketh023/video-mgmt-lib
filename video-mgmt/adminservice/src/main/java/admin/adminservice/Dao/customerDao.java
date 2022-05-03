package admin.adminservice.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import admin.adminservice.model.customer;

@Repository
@Transactional

public interface customerDao extends JpaRepository<customer,Integer> {
	
	
		
		
		
	}
