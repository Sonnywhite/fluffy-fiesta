package structs;

public class AdjacencyListVerticeElement {

	private String verticeName = "";
	private AdjacencyListVerticeElement next = null;
	private AdjacencyListEdgeElement rootEdge = null;

	public AdjacencyListVerticeElement(String verticeName) {
		this.setVerticeName(verticeName);
	}

	/**
	 * @return the verticeName
	 */
	public String getVerticeName() {
		return verticeName;
	}

	/**
	 * @param verticeName the verticeName to set
	 */
	public void setVerticeName(String verticeName) {
		this.verticeName = verticeName;
	}

	/**
	 * @return the next
	 */
	public AdjacencyListVerticeElement getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(AdjacencyListVerticeElement next) {
		this.next = next;
	}

	/**
	 * @return the rootEdge
	 */
	public AdjacencyListEdgeElement getRootEdge() {
		return rootEdge;
	}

	/**
	 * @param rootEdge the rootEdge to set
	 */
	public void setRootEdge(AdjacencyListEdgeElement rootEdge) {
		this.rootEdge = rootEdge;
	}

}
