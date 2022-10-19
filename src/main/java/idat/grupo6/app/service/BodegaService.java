package idat.grupo6.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import idat.grupo6.app.model.Bodega;
import idat.grupo6.app.repository.BodegaRespository;

@Service
public class BodegaService {

	@Autowired
	private BodegaRespository respository;
	
	public List<Bodega> listabodega(){
		return respository.findAll();
	}
}
