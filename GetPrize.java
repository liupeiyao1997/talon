import java.util.Scanner;
public class GetPrize{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入张浩的java成绩:");
		int score=input.nextInt();
		if(score>90){
			System.out.println("老师说:不错，奖励一个MP4!");
	}
	
}
}