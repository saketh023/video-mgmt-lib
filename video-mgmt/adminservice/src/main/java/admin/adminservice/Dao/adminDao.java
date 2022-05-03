package admin.adminservice.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import admin.adminservice.model.admin;

@Repository
@Transactional

public interface adminDao extends JpaRepository<admin,Integer> {
	
	
		
		
		
	}
