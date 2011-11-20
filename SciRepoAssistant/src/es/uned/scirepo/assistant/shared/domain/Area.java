package es.uned.scirepo.assistant.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa las distintas áreas de conocimiento en extenso
 * No se puede buscar por ellas directamente al ser 
 * demasiado generalistas
 * 
 * @author Miguel
 *
 */
public class Area implements Serializable {

	private static final long serialVersionUID = -7804488760052245501L;

	/**
	 * Descripción del área de conocimiento
	 * Es el texto a mostrar al usuario
	 */
	private String description;
	
	/**
	 * Lista de categorías disponibles para ese área de conocimiento
	 */
	private List<Category> categories;

	public Area(){
		this("", new ArrayList<Category>());
	}
	
	public Area(String description){
		this(description, new ArrayList<Category>());
	}
	
	public Area(String description, List<Category> categories) {
		super();
		this.description = description;
		this.categories = categories;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
}
