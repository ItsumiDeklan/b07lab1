import java.util.ArrayList;
import java.Math;

public class Polynomial {
	double[] coefficients;
	
	public Polynomial(){
	}
	
	public Polynomial(double[] d){
		coefficients = d;
	}
	
	public Polynomial add(Polynomial poly){
		double[] d1 = this.coefficients;
		double[] d2 = poly.coefficients;
		
		int polyLength;
		
		if(d1.length >= d2.length)
			polyLength = d1.length;
		else
			polyLength = d2.length;
		
		double[] d3 = new double[polyLength];
		
		for(int i = 0; i < polyLength; i++){
			d3[i] = 0;
			if(d1.length <= polyLength)
				d3[i] += d1[i];
			if(d2.length <= polyLength)
				d3[i] += d2[i];
		}
		
		return new Polynomial(d3);
	}
	
	public double evaluate(double x){
		double val = 0;
		
		polyLength = this.coefficients.length;
		for(int i = 0; i < polyLength; i++){
			val += (coefficients[i] * Math.pow(x, i));
		}
		
		return val;
	}
	
	public boolean hasRoot(double x){
		return(this.evaluate(x) == 0);
	}
}