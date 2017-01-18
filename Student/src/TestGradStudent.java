
public class TestGradStudent {

	public static void main(String[] args) {
		
		GradStudent g = new GradStudent("Chris Christie", 123, 5);
		GradStudent h = new GradStudent("Micky Mickelson", 789, 8);
		
		
		System.out.println(g.toString());
		System.out.println(g.getRank());
		
		System.out.println(h.toString());
		System.out.println(h.getRank());
		
		System.out.println(g.compareRank(h));
		
		Student l = new Student("Chris Christie", 12);
		Student m = new Student("Micky Mickelson", 789);
		
		System.out.println(l.compareRank(m));


	}

}
