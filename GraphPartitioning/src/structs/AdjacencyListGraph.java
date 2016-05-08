package structs;

import interfaces.Graph;

public class AdjacencyListGraph implements Graph {

	private int edgesCount = 0;
	private int verticesCount = 0;
	private AdjacencyListVerticeElement rootVertice = null;
	private AdjacencyListVerticeElement tailVertice = null;

	@Override
	public boolean insertVertice(String verticeName) {

		AdjacencyListVerticeElement newVertice = new AdjacencyListVerticeElement(verticeName);

		if (rootVertice == null) {
			rootVertice = newVertice;
			tailVertice = rootVertice;
			return true;
		}

		tailVertice.setNext(newVertice);
		tailVertice = newVertice;

		return true;
	}

	@Override
	public boolean insertEdge(String verticeName1, String verticeName2) {

		// TODO traverse vertices, 
		// TODO traverse edges, 
		// TODO insert if its not already inserted
		
		return false;
	}

	@Override
	public boolean deleteVertice(String verticeName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEdge(String verticeName1, String verticeName2) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the edgesCount
	 */
	public int getEdgesCount() {
		return edgesCount;
	}

	/**
	 * @return the verticesCount
	 */
	public int getVerticesCount() {
		return verticesCount;
	}

}
