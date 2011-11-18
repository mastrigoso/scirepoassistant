package es.uned.scirepo.assistant.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa las distintas materias de 
 * conocimiento sobre las que se puede realizar la búsqueda
 * 
 * @author Miguel
 *
 */
public class Category implements Serializable{

	private static final long serialVersionUID = 6954357003505465283L;

	/**
	 * Descripción de la categoría de conocimiento
	 */
	private String description;
	
	/**
	 * Tag de búsqueda
	 */
	private String tag;
	
	/**
	 * Lista de subcategorías disponibles para esa categoría de conocimiento
	 */
	private List<Category> subcategories;

	public Category(){
		this("", "", new ArrayList<Category>());
	}
	
	public Category(String description, String tag, List<Category> subcategories) {
		super();
		this.description = description;
		this.tag = tag;
		this.subcategories = subcategories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Category> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}
	
	
}
