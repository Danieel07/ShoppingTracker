package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Compra;
import co.edu.unbosque.model.CompraDTO;

public class DataMapper {
	
	public DataMapper() {
	}
	
	public Compra toCompra(CompraDTO compraDTO) {
		return new Compra(compraDTO.getNombreAlmacen(),
				compraDTO.getMarcaProducto(),
				compraDTO.getTipoCompra(),
				compraDTO.isRegalo(),
				compraDTO.getCedulaCliente(),
				compraDTO.getNombreCliente());
	}
	
	public CompraDTO toCompraDTO(Compra compra) {
		return new CompraDTO(compra.getNombreAlmacen(),
				compra.getMarcaProducto(),
				compra.getTipoCompra(),
				compra.isRegalo(),
				compra.getCedulaCliente(),
				compra.getNombreCliente());
	}
}
