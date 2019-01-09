import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BloodAlcoholLevel {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Male or Female?");
		String gender = scnr.nextLine();
		double c;
		if (gender.equalsIgnoreCase("male")) {
			c = .73; 
		} else {
			c = .66;
		}
		
		System.out.println("Body Weight?");
		int weight = scnr.nextInt();
		
		System.out.println("Ounces drank?");
		double ounces = scnr.nextDouble();
		
		System.out.println("ABV?");
		double ABV = scnr.nextDouble();
		double ouncesAlcohol = ounces * ABV;
		
		System.out.println("How many hours have you been drinking?");
		double hours = scnr.nextDouble();
		
//		% BAC = (ounces * 5.14 / weight x weightConstant) – .015 * hours
		
		double bac = (ouncesAlcohol * 5.14) / (weight * c) - (.015 * hours);
		DecimalFormat df = new DecimalFormat(".##");
		String BAC = df.format(bac);
		
		System.out.println("Your blood alcohol level is: " + BAC);
		
		if (bac > 0.08) {
			System.out.println("You are not allowed to drive.");
		}
		else if (bac > .04 && bac < .08) {
			System.out.println("Be careful.");
		}
		else {
			System.out.println("You are safe to drive home");
		}
		
	}
}
