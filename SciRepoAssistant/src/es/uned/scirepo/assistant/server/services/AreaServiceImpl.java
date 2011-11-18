package es.uned.scirepo.assistant.server.services;

import java.util.ArrayList;
import java.util.List;

import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.shared.domain.Area;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AreaServiceImpl extends RemoteServiceServlet implements AreaService {

	@Override
	public List<Area> getAllAreas() {
		List<Area> result = new ArrayList<Area>();
		// TODO Auto-generated method stub
		
//			<g:VerticalPanel g:StackPanel-text="Physics">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Astrophysics
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Cosmology and Extragalactic Astrophysics"/>
//							<g:Label text="Earth and Planetary Astrophysics"/>
//							<g:Label text="Galaxy Astrophysics"/>
//							<g:Label text="High Energy Astrophysical Phenomena"/>
//							<g:Label text="Instrumentation and Methods for Astrophysics"/>
//							<g:Label text="Solar and Stellar Astrophysics"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Condensed Matter
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Disordered Systems and Neural Networks"/>
//							<g:Label text="Materials Science"/>
//							<g:Label text="Mesoscale and Nanoscale Physics"/>
//							<g:Label text="Other Condensed Matter"/>
//							<g:Label text="Quantum Gases"/>
//							<g:Label text="Soft Condensed Matter"/>
//							<g:Label text="Statistical Mechanics"/>
//							<g:Label text="Strongly Correlated Electrons"/>
//							<g:Label text="Superconductivity"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							General Relativity and Quantum Cosmology
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							High Energy Physics - Experiment
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							High Energy Physics - Lattice
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							High Energy Physics - Phenomenology
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							High Energy Physics - Theory
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Mathematical Physics
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Nuclear Experiment
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Nuclear Theory
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Physics
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Accelerator Physics"/>
//							<g:Label text="Atmospheric and Oceanic Physics"/>
//							<g:Label text="Atomic Physics"/>
//							<g:Label text="Atomic and Molecular Clusters"/>
//							<g:Label text="Biological Physics"/>
//							<g:Label text="Chemical Physics"/>
//							<g:Label text="Classical Physics"/>
//							<g:Label text="Computational Physics"/>
//							<g:Label text="Data Analysis, Statistics and Probability"/>
//							<g:Label text="Fluid Dynamics"/>
//							<g:Label text="General Physics"/>
//							<g:Label text="Geophysics"/>
//							<g:Label text="History and Philosophy of Physics"/>
//							<g:Label text="Instrumentation and Detectors"/>
//							<g:Label text="Medical Physics"/>
//							<g:Label text="Optics"/>
//							<g:Label text="Physics Education"/>
//							<g:Label text="Physics and Society"/>
//							<g:Label text="Plasma Physics"/>
//							<g:Label text="Popular Physics"/>
//							<g:Label text="Space Physics"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Quantum Physics
//						</g:header>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Mathematics">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Mathematics
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Algebraic Geometry"/>
//							<g:Label text="Algebraic Topology"/>
//							<g:Label text="Analysis of PDEs"/>
//							<g:Label text="Category Theory"/>
//							<g:Label text="Classical Analysis and ODEs"/>
//							<g:Label text="Combinatorics"/>
//							<g:Label text="Commutative Algebra"/>
//							<g:Label text="Complex Variables"/>
//							<g:Label text="Differential Geometry"/>
//							<g:Label text="Dynamical Systems"/>
//							<g:Label text="Functional Analysis"/>
//							<g:Label text="General Mathematics"/>
//							<g:Label text="General Topology"/>
//							<g:Label text="Geometric Topology"/>
//							<g:Label text="Group Theory"/>
//							<g:Label text="History and Overview"/>
//							<g:Label text="Information Theory"/>
//							<g:Label text="K-Theory and Homology"/>
//							<g:Label text="Logic"/>
//							<g:Label text="Mathematical Physics"/>
//							<g:Label text="Metric Geometry"/>
//							<g:Label text="Number Theory"/>
//							<g:Label text="Numerical Analysis"/>
//							<g:Label text="Operator Algebras"/>
//							<g:Label text="Optimization and Control"/>
//							<g:Label text="Probability"/>
//							<g:Label text="Quantum Algebra"/>
//							<g:Label text="Representation Theory"/>
//							<g:Label text="Rings and Algebras"/>
//							<g:Label text="Spectral Theory"/>
//							<g:Label text="Statistics Theory"/>
//							<g:Label text="Symplectic Geometry"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Nonlinear Sciences">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Nonlinear Sciences
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Adaptation and Self-Organizing Systems"/>
//							<g:Label text="Cellular Automata and Lattice Gases"/>
//							<g:Label text="Chaotic Dynamics"/>
//							<g:Label text="Exactly Solvable and Integrable Systems"/>
//							<g:Label text="Pattern Formation and Solitons"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Computer Science">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Computer Science
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Artificial Intelligence"/>
//							<g:Label text="Computation and Language"/>
//							<g:Label text="Computational Complexity"/>
//							<g:Label text="Computational Engineering, Finance, and Science"/>
//							<g:Label text="Computational Geometry"/>
//							<g:Label text="Computer Science and Game Theory"/>
//							<g:Label text="Computer Vision and Pattern Recognition"/>
//							<g:Label text="Computers and Society"/>
//							<g:Label text="Cryptography and Security"/>
//							<g:Label text="Data Structures and Algorithms"/>
//							<g:Label text="Databases"/>
//							<g:Label text="Digital Libraries"/>
//							<g:Label text="Discrete Mathematics"/>
//							<g:Label text="Distributed, Parallel, and Cluster Computing"/>
//							<g:Label text="Emerging Technologies"/>
//							<g:Label text="Formal Languages and Automata Theory"/>
//							<g:Label text="General Literature"/>
//							<g:Label text="Graphics"/>
//							<g:Label text="Hardware Architecture"/>
//							<g:Label text="Human-Computer Interaction"/>
//							<g:Label text="Information Retrieval"/>
//							<g:Label text="Information Theory"/>
//							<g:Label text="Learning"/>
//							<g:Label text="Logic in Computer Science"/>
//							<g:Label text="Mathematical Software"/>
//							<g:Label text="Multiagent Systems"/>
//							<g:Label text="Multimedia"/>
//							<g:Label text="Networking and Internet Architecture"/>
//							<g:Label text="Neural and Evolutionary Computing"/>
//							<g:Label text="Numerical Analysis"/>
//							<g:Label text="Operating Systems"/>
//							<g:Label text="Other Computer Science"/>
//							<g:Label text="Performance"/>
//							<g:Label text="Programming Languages"/>
//							<g:Label text="Robotics"/>
//							<g:Label text="Social and Information Networks"/>
//							<g:Label text="Software Engineering"/>
//							<g:Label text="Sound"/>
//							<g:Label text="Symbolic Computation"/>
//							<g:Label text="Systems and Control"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Quantitative Biology">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Quantitative Biology
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Biomolecules"/>
//							<g:Label text="Cell Behavior"/>
//							<g:Label text="Genomics"/>
//							<g:Label text="Molecular Networks"/>
//							<g:Label text="Neurons and Cognition"/>
//							<g:Label text="Other Quantitative Biology"/>
//							<g:Label text="Populations and Evolution"/>
//							<g:Label text="Quantitative Methods"/>
//							<g:Label text="Subcellular Processes"/>
//							<g:Label text="Tissues and Organs"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Quantitative Finance">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Quantitative Finance
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Computational Finance"/>
//							<g:Label text="General Finance"/>
//							<g:Label text="Portfolio Management"/>
//							<g:Label text="Pricing of Securities"/>
//							<g:Label text="Risk Management"/>
//							<g:Label text="Statistical Finance"/>
//							<g:Label text="Trading and Market Microstructure"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
//			<g:VerticalPanel g:StackPanel-text="Statistics">
//				<g:Cell horizontalAlignment="ALIGN_LEFT">
//					<g:DisclosurePanel open="false">
//						<g:header>
//							Statistics
//						</g:header>
//						<g:VerticalPanel>
//							<g:Label text="Applications"/>
//							<g:Label text="Computation"/>
//							<g:Label text="Machine Learning"/>
//							<g:Label text="Methodology"/>
//							<g:Label text="Other Statistics"/>
//							<g:Label text="Statistics Theory"/>
//						</g:VerticalPanel>
//					</g:DisclosurePanel>
//				</g:Cell>
//			</g:VerticalPanel>
						
		return result;
	}
	
}
