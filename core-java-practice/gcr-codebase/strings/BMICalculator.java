import java.util.Scanner;
public class BMICalculator{
	public static void main(String []args){
        Scanner x =new Scanner(System.in);
        int person[][]=new int[10][2];
        for(int i=0;i<10;i++){
            System.out.println("enter weight and height");			
			person[i][0]=x.nextInt();
			person[i][1]=x.nextInt();
		}
		String BMI[][]=new String [10][4];
		BMI = result(person);
		display(BMI);
	}
	
	public static String[][] result(int person [][]){
		String BMI[][]= new String[10][4];
		double cal=0.0;
		for(int i=0;i<10;i++){
			BMI[i][0]=String.valueOf(person[i][0]);
			BMI[i][1]=String.valueOf(person[i][1]);
			double heightInMeters = person[i][1] / 100.0;
			cal= person[i][0]/(heightInMeters * heightInMeters);
			 if(cal<18.5){
                BMI[i][3] = "Underweight";
            }
            else if(cal>=18.5 && cal<24.9){
                 BMI[i][3] = "Normal weight";
            }
            else if(cal>=25 && cal<29.9){
                 BMI[i][3] = "Overweight";
            }
            else{
                 BMI[i][3] = "Obesity";
            }
			BMI[i][2]=String.valueOf(cal);
		}
		return BMI;
	}
	
	public static void display(String BMI[][]){
		for(int i=0;i<10;i++){
			System.out.println("BMI Report of Person "+(i+1));
			System.out.println("Weigth "+BMI[i][0]);
			System.out.println("Heigth "+BMI[i][1]);
			System.out.println("BMI "+BMI[i][2]);
			System.out.println(BMI[i][3]);
		}
	}
}		
			