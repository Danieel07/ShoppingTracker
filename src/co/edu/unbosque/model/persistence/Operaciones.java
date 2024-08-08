package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Compra;

public interface Operaciones {
	public void crearCompra(Compra compra);
	public String mostrarCompras();
	public String consultarCompra(long cedula);
}
