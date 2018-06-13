

public class Score {

	public double score(int[] list) { 
		int id = list[0];
		int gpa = list[1];
		int mid = list[2];
		int fin = list[3];
		int quiz = list[4];
		int att = list[5];
		String result = "";
		String attr = "";
		assert(gpa >= 0 && gpa <= 100);
		assert(mid >= 0 && mid <= 100);
		assert(fin >= 0 && fin <= 100);
		assert(quiz >= 0 && quiz <= 100);
		assert(att == 0 || att == 1);
		assert(id != 0);
		double sum;
		System.out.println("\n學號\t平時\t期中\t期末\t小考\t全勤\t總分\t等級"); 
		sum=(gpa* 0.2) + (mid* 0.3) + (fin* 0.3) + (quiz* 0.2) ;  
		if (att == 0) {
			attr = "否";
		}
		if(att == 1) {
			sum = sum + 5;
			attr = "是";
			if(sum > 100) {
				sum = 100;
			}
		}
		assert(sum <= 100);
		if(sum >= 0 && sum < 60) {
			result = "F";		
		}
		if(sum >= 60 && sum <70) {
			result = "D";		
		}
		if(sum >= 70 && sum < 80) {
			result = "C";		
		}
		if(sum >= 80 && sum < 90) {
			result = "B";		
		}
		if(sum >= 90 && sum < 100) {
			result = "A";		
		}
		if(sum == 100) {
			result = "S";		
		}
		System.out.println(id +"\t" + gpa + "\t" + mid +"\t" + fin +"\t" + quiz +"\t" + attr +"\t" + sum +"\t" + result); 
		System.out.println("_____________________________________________________"); 
		
		return sum ;
		
	}
	
	
}