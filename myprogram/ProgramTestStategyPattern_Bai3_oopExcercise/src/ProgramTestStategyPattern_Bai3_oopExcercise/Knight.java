package ProgramTestStategyPattern_Bai3_oopExcercise;

public class Knight extends Character{

	@Override
	public void fight() {
		
		System.out.print("Knight'sWeapon is ");
		
		getWeapon().useWeaponBehavior();
	}

}
