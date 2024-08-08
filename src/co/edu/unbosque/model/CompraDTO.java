package co.edu.unbosque.model;

public class CompraDTO {
	private String nombreAlmacen;
	private String marcaProducto;
	private String tipoCompra;
	private boolean isRegalo;
	private long cedulaCliente;
	private String nombreCliente;
	
	
	public CompraDTO() {
		
	}

	public CompraDTO(String nombreAlmacen, String marcaProducto, String tipoCompra, boolean isRegalo, long cedulaCliente,
			String nombreCliente) {
		this.nombreAlmacen = nombreAlmacen;
		this.marcaProducto = marcaProducto;
		this.tipoCompra = tipoCompra;
		this.isRegalo = isRegalo;
		this.cedulaCliente = cedulaCliente;
		this.nombreCliente = nombreCliente;
	}


	public String getNombreAlmacen() {
		return nombreAlmacen;
	}


	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}


	public String getMarcaProducto() {
		return marcaProducto;
	}


	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}


	public String getTipoCompra() {
		return tipoCompra;
	}


	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}


	public boolean isRegalo() {
		return isRegalo;
	}


	public void setRegalo(boolean isRegalo) {
		this.isRegalo = isRegalo;
	}


	public long getCedulaCliente() {
		return cedulaCliente;
	}


	public void setCedulaCliente(long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public String toString() {
		return "Compra: \n nombre del local: " + nombreAlmacen + "\n Marca: " + marcaProducto + "\n Medio de Pago: "
				+ tipoCompra + "\n Regalo: " + isRegalo + "\n Cedula del Cliente: " + cedulaCliente + "\n Nombre del Cliente: "
				+ nombreCliente + "]";
	}
}
