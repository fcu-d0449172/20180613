package fianal;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner s1 =new Scanner(System.in); 
			Scanner s2 =new Scanner(System.in); 
			String [] id=new String[3];
			String [] level=new String[3]; 
			String [] Subject={"gpa","mid","fin","quiz","att"}; 
			int [] gpa=new int[3]; 
			int [] mid=new int[3]; 
			int [] fin=new int[3]; 
			int [] quiz=new int[3]; 
			int [] att=new int[3]; 

			double[] sum = new double[3]; 
			int q1,q2,q3,q4,q7,q8,q9; 
			System.out.println("請輸入姓名"); 
			for(q1=0; q1<3 ;q1++){ 
				id[q1] =s1.next(); 
			} 

			for(q2=0; q2<3 ;q2++){ 
					System.out.println("請輸入" +id[q2] + "的各別成績"); 
					gpa[q2]=s2.nextInt();
					mid[q2]=s2.nextInt();
					fin[q2]=s2.nextInt();
					quiz[q2]=s2.nextInt();
					att[q2]=s2.nextInt();

			} 
			for(q4=0;q4<3;q4++) {
				assert(gpa[q4] >= 0 && gpa[q4] <= 100);
				assert(mid[q4] >= 0 && mid[q4] <= 100);
				assert(fin[q4] >= 0 && fin[q4] <= 100);
				assert(quiz[q4] >= 0 && quiz[q4] <= 100);
				assert(att[q4] == 0 || att[q4] == 1);
				assert(id[q4] != null);
				assert(sum[q4] <= 100);
			}
			String[] attr = new String[3];
			for(q7=0; q7<3 ;q7++) {
				if (att[q7] == 0) {
					attr[q7] = "否";
				}
				if(att[q7] == 1) {
					attr[q7] = "是";
				}
				for(q8=0; q8<3 ;q8++){ 
					sum[q8] = gpa[q8]*0.2 + mid[q8] * 0.3 + fin[q8]*0.3 + quiz[q8]*0.2;
					if(att[q8] == 1) {
						sum[q8] = sum[q8] + 5;
						if(sum[q8] >= 100) {
							sum[q8] = 100;
						}
					}
				}
			}
			for(q3=0;q3<3;q3++) {
				if(sum[q3] >= 0 && sum[q3] < 60) {
					level[q3] = "F";		
				}
				if(sum[q3] >= 60 && sum[q3] <70) {
					level[q3] = "D";		
				}
				if(sum[q3] >= 70 && sum[q3] < 80) {
					level[q3] = "C";		
				}
				if(sum[q3] >= 80 && sum[q3] < 90) {
					level[q3] = "B";		
				}
				if(sum[q3] >= 90 && sum[q3] < 100) {
					level[q3] = "A";		
				}
				if(sum[q3] == 100) {
					level[q3] = "S";		
				}
			}
			
			System.out.println("\n學號\t平時\t期中\t期末\t小考\t全勤\t總分\t等級"); 
			for(q9=0; q9<3; q9++){ 
				System.out.println(id[q9] + "\t" + gpa[q9] +"\t" + mid[q9] + "\t" + fin[q9] +"\t" + quiz[q9]+"\t"+ attr[q9] +"\t" + sum[q9] + "\t" + level[q9]); 
			} System.out.println("_______________________________________________"); 

			for(int s=0; s<sum.length-1; s++){ 
				for(int t=s+1; t<sum.length; t++){ 
					if(sum[t] > sum[s]){ 
						double tmp = sum[t]; 
						sum[t] = sum[s]; 
						sum[s] = tmp; 
					} 
				} 
			}System.out.println(); 
			for(int k=0; k<sum.length; k++){ 
				System.out.println("第" + (k+1) + "名的學號     " + id[k] + "總分     " + sum[k]); 

			} 
	}

}
