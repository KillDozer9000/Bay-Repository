package p5;

public class UnitConverterRunner {

	public static void main(String[] args) 
	{
		String unit1 = "km"; //first unit,  use: mm, cm, in, ft, m, mi, km
		String unit2 = "mi"; //second unit, use: mm, cm, in, ft, m, mi, km
		double num = 74;   //amount of first unit
		
		UnitConverter u1 = new UnitConverter(unit1, unit2, num);
		
		System.out.println(unit1+" to "+unit2);
		System.out.println(num+unit1+" = "+ u1.convert()+unit2);
	}

}
