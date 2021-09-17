package ProgramTestStategyPattern_Bai3_oopExcercise;

public class Troll extends Character{

	@Override
	public void fight() {

		System.out.print("Troll'sWeapon is ");
		
		getWeapon().useWeaponBehavior();
		
	}

}
