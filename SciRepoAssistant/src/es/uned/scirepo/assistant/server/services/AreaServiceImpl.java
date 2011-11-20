package es.uned.scirepo.assistant.server.services;

import java.util.ArrayList;
import java.util.List;

import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.shared.domain.Area;
import es.uned.scirepo.assistant.shared.domain.Category;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AreaServiceImpl extends RemoteServiceServlet implements AreaService {

	private static final long serialVersionUID = 5764675390411685190L;

	@Override
	public List<Area> getAllAreas() {
		List<Area> result = new ArrayList<Area>();
		
		List<Category> categories1 = new ArrayList<Category>();
		
		List<Category> categories11 = new ArrayList<Category>();
		categories11.add(new Category("Cosmology and Extragalactic Astrophysics"));
		categories11.add(new Category("Earth and Planetary Astrophysics"));
		categories11.add(new Category("Galaxy Astrophysics"));
		categories11.add(new Category("High Energy Astrophysical Phenomena"));
		categories11.add(new Category("Instrumentation and Methods for Astrophysics"));
		categories11.add(new Category("Solar and Stellar Astrophysics"));
		
		categories1.add(new Category("Astrophysics","Astrophysics",categories11));
		
		List<Category> categories12 = new ArrayList<Category>();
		categories12.add(new Category("Disordered Systems and Neural Networks"));
		categories12.add(new Category("Materials Science"));
		categories12.add(new Category("Mesoscale and Nanoscale Physics"));
		categories12.add(new Category("Other Condensed Matter"));
		categories12.add(new Category("Quantum Gases"));
		categories12.add(new Category("Soft Condensed Matter"));
		categories12.add(new Category("Statistical Mechanics"));
		categories12.add(new Category("Strongly Correlated Electrons"));
		categories12.add(new Category("Superconductivity"));

		categories1.add(new Category("Condensed Matter", "Condensed Matter", categories12));
		
		categories1.add(new Category("General Relativity and Quantum Cosmology"));		
		categories1.add(new Category("High Energy Physics - Experiment"));		
		categories1.add(new Category("High Energy Physics - Lattice"));
		categories1.add(new Category("High Energy Physics - Phenomenology"));
		categories1.add(new Category("High Energy Physics - Theory"));
		categories1.add(new Category("Mathematical Physics"));
		categories1.add(new Category("Nuclear Experiment"));
		categories1.add(new Category("Nuclear Theory"));

		List<Category> categories13 = new ArrayList<Category>();
		categories13.add(new Category("Accelerator Physics"));
		categories13.add(new Category("Atmospheric and Oceanic Physics"));
		categories13.add(new Category("Atomic Physics"));
		categories13.add(new Category("Atomic and Molecular Clusters"));
		categories13.add(new Category("Biological Physics"));
		categories13.add(new Category("Chemical Physics"));
		categories13.add(new Category("Classical Physics"));
		categories13.add(new Category("Computational Physics"));
		categories13.add(new Category("Data Analysis, Statistics and Probability"));
		categories13.add(new Category("Fluid Dynamics"));
		categories13.add(new Category("General Physics"));
		categories13.add(new Category("Geophysics"));
		categories13.add(new Category("History and Philosophy of Physics"));
		categories13.add(new Category("Instrumentation and Detectors"));
		categories13.add(new Category("Medical Physics"));
		categories13.add(new Category("Optics"));
		categories13.add(new Category("Physics Education"));
		categories13.add(new Category("Physics and Society"));
		categories13.add(new Category("Plasma Physics"));
		categories13.add(new Category("Popular Physics"));
		categories13.add(new Category("Space Physics"));
		
		categories1.add(new Category("Physics", "Physics", categories13));
		categories1.add(new Category("Quantum Physics"));

		result.add(new Area("Physics",categories1));
		
		
		List<Category> categories2 = new ArrayList<Category>();
		
		List<Category> categories21 = new ArrayList<Category>();
		categories21.add(new Category("Algebraic Geometry"));
		categories21.add(new Category("Algebraic Topology"));
		categories21.add(new Category("Analysis of PDEs"));
		categories21.add(new Category("Category Theory"));
		categories21.add(new Category("Classical Analysis and ODEs"));
		categories21.add(new Category("Combinatorics"));
		categories21.add(new Category("Commutative Algebra"));
		categories21.add(new Category("Complex Variables"));
		categories21.add(new Category("Differential Geometry"));
		categories21.add(new Category("Dynamical Systems"));
		categories21.add(new Category("Functional Analysis"));
		categories21.add(new Category("General Mathematics"));
		categories21.add(new Category("General Topology"));
		categories21.add(new Category("Geometric Topology"));
		categories21.add(new Category("Group Theory"));
		categories21.add(new Category("History and Overview"));
		categories21.add(new Category("Information Theory"));
		categories21.add(new Category("K-Theory and Homology"));
		categories21.add(new Category("Logic"));
		categories21.add(new Category("Mathematical Physics"));
		categories21.add(new Category("Metric Geometry"));
		categories21.add(new Category("Number Theory"));
		categories21.add(new Category("Numerical Analysis"));
		categories21.add(new Category("Operator Algebras"));
		categories21.add(new Category("Optimization and Control"));
		categories21.add(new Category("Probability"));
		categories21.add(new Category("Quantum Algebra"));
		categories21.add(new Category("Representation Theory"));
		categories21.add(new Category("Rings and Algebras"));
		categories21.add(new Category("Spectral Theory"));
		categories21.add(new Category("Statistics Theory"));
		categories21.add(new Category("Symplectic Geometry"));
		
		categories2.add(new Category("Mathematics","Mathematics",categories21));
		
		result.add(new Area("Mathematics", categories2));
		
		List<Category> categories3 = new ArrayList<Category>();
	
		List<Category> categories31 = new ArrayList<Category>();
		categories31.add(new Category("Adaptation and Self-Organizing Systems"));
		categories31.add(new Category("Cellular Automata and Lattice Gases"));
		categories31.add(new Category("Chaotic Dynamics"));
		categories31.add(new Category("Exactly Solvable and Integrable Systems"));
		categories31.add(new Category("Pattern Formation and Solitons"));
		
		categories3.add(new Category("Nonlinear Sciences", "Nonlinear Sciences", categories31));
		
		result.add(new Area("Nonlinear Sciences", categories3));
		
		List<Category> categories4 = new ArrayList<Category>();
		
		List<Category> categories41 = new ArrayList<Category>();
		categories41.add(new Category("Artificial Intelligence"));
		categories41.add(new Category("Computation and Language"));
		categories41.add(new Category("Computational Complexity"));
		categories41.add(new Category("Computational Engineering, Finance, and Science"));
		categories41.add(new Category("Computational Geometry"));
		categories41.add(new Category("Computer Science and Game Theory"));
		categories41.add(new Category("Computer Vision and Pattern Recognition"));
		categories41.add(new Category("Computers and Society"));
		categories41.add(new Category("Cryptography and Security"));
		categories41.add(new Category("Data Structures and Algorithms"));
		categories41.add(new Category("Databases"));
		categories41.add(new Category("Digital Libraries"));
		categories41.add(new Category("Discrete Mathematics"));
		categories41.add(new Category("Distributed, Parallel, and Cluster Computing"));
		categories41.add(new Category("Emerging Technologies"));
		categories41.add(new Category("Formal Languages and Automata Theory"));
		categories41.add(new Category("General Literature"));
		categories41.add(new Category("Graphics"));
		categories41.add(new Category("Hardware Architecture"));
		categories41.add(new Category("Human-Computer Interaction"));
		categories41.add(new Category("Information Retrieval"));
		categories41.add(new Category("Information Theory"));
		categories41.add(new Category("Learning"));
		categories41.add(new Category("Logic in Computer Science"));
		categories41.add(new Category("Mathematical Software"));
		categories41.add(new Category("Multiagent Systems"));
		categories41.add(new Category("Multimedia"));
		categories41.add(new Category("Networking and Internet Architecture"));
		categories41.add(new Category("Neural and Evolutionary Computing"));
		categories41.add(new Category("Numerical Analysis"));
		categories41.add(new Category("Operating Systems"));
		categories41.add(new Category("Other Computer Science"));
		categories41.add(new Category("Performance"));
		categories41.add(new Category("Programming Languages"));
		categories41.add(new Category("Robotics"));
		categories41.add(new Category("Social and Information Networks"));
		categories41.add(new Category("Software Engineering"));
		categories41.add(new Category("Sound"));
		categories41.add(new Category("Symbolic Computation"));
		categories41.add(new Category("Systems and Control"));

		categories4.add(new Category("Computer Science", "Computer Science", categories41));
		
		result.add(new Area("Computer Science", categories4));
		
		List<Category> categories5 = new ArrayList<Category>();
		
		List<Category> categories51 = new ArrayList<Category>();
		categories51.add(new Category("Biomolecules"));
		categories51.add(new Category("Cell Behavior"));
		categories51.add(new Category("Genomics"));
		categories51.add(new Category("Molecular Networks"));
		categories51.add(new Category("Neurons and Cognition"));
		categories51.add(new Category("Other Quantitative Biology"));
		categories51.add(new Category("Populations and Evolution"));
		categories51.add(new Category("Quantitative Methods"));
		categories51.add(new Category("Subcellular Processes"));
		categories51.add(new Category("Tissues and Organs"));

		categories5.add(new Category("Quantitative Biology", "Quantitative Biology", categories51));

		result.add(new Area("Quantitative Biology", categories5));
		
		List<Category> categories6 = new ArrayList<Category>();
		
		List<Category> categories61 = new ArrayList<Category>();
		categories61.add(new Category("Computational Finance"));
		categories61.add(new Category("General Finance"));
		categories61.add(new Category("Portfolio Management"));
		categories61.add(new Category("Pricing of Securities"));
		categories61.add(new Category("Risk Management"));
		categories61.add(new Category("Statistical Finance"));
		categories61.add(new Category("Trading and Market Microstructure"));
		
		categories6.add(new Category("Quantitative Finance", "Quantitative Finance", categories61));
		
		result.add(new Area("Quantitative Finance",categories6));
		
		List<Category> categories7 = new ArrayList<Category>();
		
		List<Category> categories71 = new ArrayList<Category>();
		categories71.add(new Category("Applications"));
		categories71.add(new Category("Computation"));
		categories71.add(new Category("Machine Learning"));
		categories71.add(new Category("Methodology"));
		categories71.add(new Category("Other Statistics"));
		categories71.add(new Category("Statistics Theory"));
				
		categories7.add(new Category("Statistics","Statistics",categories71));

		result.add(new Area("Statistics",categories7));
		
		return result;
	}
	
}
