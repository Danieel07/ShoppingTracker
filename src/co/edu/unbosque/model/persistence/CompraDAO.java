package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Compra;

public class CompraDAO implements Operaciones{
	private ArrayList<Compra> listaCompras;
	
	public CompraDAO() {
		listaCompras =  new ArrayList<>();
		leerDesdeSerializado();
	}
	@SuppressWarnings("unchecked")
	public void leerDesdeSerializado() {

		Object temp = FileHandler.abrirYLeerSerializable("Compras.Bat");
		if (temp == null) {
			listaCompras = new ArrayList<>();
		} else {
			listaCompras = (ArrayList<Compra>) temp;
		}
	}

	public void escribirEnArchivo() {
		String contenido = "";
		for (int i = 0; i < listaCompras.size(); i++) {
			contenido += listaCompras.get(i).getNombreAlmacen()+";"; 
			contenido += listaCompras.get(i).getMarcaProducto()+";";
			contenido += listaCompras.get(i).getTipoCompra()+";";
			contenido += listaCompras.get(i).getCedulaCliente()+";";
			contenido += listaCompras.get(i).getNombreCliente();
			if (i < listaCompras.size() - 1) {
				contenido += "\n";
			}
		}
		FileHandler.abrirYEscribirArchivo("Compras.csv", contenido);
	}
	@Override
	public void crearCompra(Compra compra) {
		listaCompras.add(compra);
		escribirEnArchivo();
		FileHandler.abrirYEscribirSerializado("Compras.Bat", listaCompras);
	}

	@Override
	public String mostrarCompras() {
		String salida = "";
		int conteo = 0;
		for (Compra compra : listaCompras) {
			salida += "(" + conteo +")"+ compra.toString();
			conteo++;
		}
		return salida;
	}

	@Override
	public String consultarCompra(long cedula) {
		String salida = "";
		int conteo = 0;
		for (Compra compra : listaCompras) {
			if(compra.getCedulaCliente() == cedula) {
				salida += "(" + conteo +")"+ compra.toString();
				conteo++;
			}
		}
		return salida;
	}
}
