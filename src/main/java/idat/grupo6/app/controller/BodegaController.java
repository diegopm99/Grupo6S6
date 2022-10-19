package idat.grupo6.app.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idat.grupo6.app.model.Bodega;
import idat.grupo6.app.service.BodegaService;

@RestController
@RequestMapping("/bodega")
public class BodegaController {

	@Autowired
	private BodegaService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
	//@GetMapping("")
	public ResponseEntity<List<Bodega>> listar() {
		List<Bodega> listabodega=service.listabodega();		
		return new ResponseEntity<List<Bodega>>(listabodega,HttpStatus.OK);
	}
	
}
