
public class GradStudent extends Student implements Rankable {
	
	int rank;

	public GradStudent(String name, int id, int rank) {
		super(name, id);
		this.rank = rank;
	}
	
	
	public int getRank() {
		return rank;
	}
	
	public String compareRank(GradStudent s) {
			
		if(this.rank > rank) {
			return this.getName() + " ranked lower than " + s.getName();
			
		}
		else if(this.rank < rank) {
			return this.getName() + " ranked higher than " + s.getName();
			
		}
		else {
			return "Both students are ranked the same";
		}
		
	}

}
