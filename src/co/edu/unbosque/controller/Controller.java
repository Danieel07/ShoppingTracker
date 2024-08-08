package co.edu.unbosque.controller;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.view.ViewFacade;

public class Controller {
	private ModelFacade modelFacade;
	private ViewFacade viewfacade;
	
	public Controller() {
		viewfacade = new ViewFacade();
		modelFacade = new ModelFacade();
	}
}
