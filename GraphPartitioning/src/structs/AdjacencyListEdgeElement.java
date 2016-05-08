package structs;

public class AdjacencyListEdgeElement {

	private String verticeName = "";
	private AdjacencyListEdgeElement next = null;

	public AdjacencyListEdgeElement(String verticeName) {
		this.setVerticeName(verticeName);
	}

	/**
	 * @return the next
	 */
	public AdjacencyListEdgeElement getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(AdjacencyListEdgeElement next) {
		this.next = next;
	}

	/**
	 * @return the verticeName
	 */
	public String getVerticeName() {
		return verticeName;
	}

	/**
	 * @param verticeName
	 *            the verticeName to set
	 */
	public void setVerticeName(String verticeName) {
		this.verticeName = verticeName;
	}

}
