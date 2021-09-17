package ProgramTestStategyPattern_Bai3_oopExcercise;

public class Queen extends Character{

	@Override
	public void fight() {
		
		System.out.print("Queen'sWeapon is ");
		
		getWeapon().useWeaponBehavior();
		
	}

}
