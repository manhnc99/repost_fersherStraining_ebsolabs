package ProgramTestStategyPattern_Bai3_oopExcercise;

public class King extends Character{

	
	@Override
	public void fight() {
		
		System.out.print("king'sWeapon is ");
		getWeapon().useWeaponBehavior();
		
	}

	
	
}
