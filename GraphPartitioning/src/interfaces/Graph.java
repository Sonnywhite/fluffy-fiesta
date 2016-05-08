package interfaces;

public interface Graph {
	
	public boolean insertVertice(String verticeName);
	public boolean insertEdge(String verticeName1, String verticeName2);
	public boolean deleteVertice(String verticeName);
	public boolean deleteEdge(String verticeName1, String verticeName2);

}
