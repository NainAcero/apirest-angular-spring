package nain.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import nain.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{
	
}
