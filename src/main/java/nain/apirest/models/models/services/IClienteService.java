package nain.apirest.models.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import nain.apirest.models.entity.Cliente;
import nain.apirest.models.entity.Factura;
import nain.apirest.models.entity.Producto;
import nain.apirest.models.entity.Region;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id); 
	
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	public List<Producto> findByProductoNombre(String term);
}
