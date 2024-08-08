package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CompraDAO;
import co.edu.unbosque.model.persistence.DataMapper;

public class ModelFacade {
	private CompraDAO compraDAO;
	private DataMapper dataMapper;
	
	public ModelFacade() {
		compraDAO =  new CompraDAO();
		dataMapper = new DataMapper();
	}

	public CompraDAO getCompraDAO() {
		return compraDAO;
	}

	public void setCompraDAO(CompraDAO compraDAO) {
		this.compraDAO = compraDAO;
	}

	public DataMapper getDataMapper() {
		return dataMapper;
	}

	public void setDataMapper(DataMapper dataMapper) {
		this.dataMapper = dataMapper;
	}
	
}
