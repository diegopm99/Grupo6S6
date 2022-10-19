package idat.grupo6.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import idat.grupo6.app.model.Bodega;

@Repository
public interface BodegaRespository extends JpaRepository<Bodega, Integer> {

	
}
