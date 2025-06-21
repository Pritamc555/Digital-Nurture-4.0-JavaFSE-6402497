
public class ForecastTool {
	
	public static double forecastRecursive(double value , double growthRate, int years) {
		if(years == 0) {
			return value ;
		}
		return forecastRecursive(value, growthRate, years - 1) * (1 + growthRate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double initialValue = 1000.0;  
        double growthRate = 0.10;          
        int years = 5;
        
        double resultRecursive = forecastRecursive(initialValue, growthRate, years);
        System.out.printf("Forecasted value using Recursion after %d years: %.2f%n", years, resultRecursive);


	}

}
