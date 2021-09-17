package ProgramTestStategyPattern_Bai3_oopExcercise;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public abstract void fight();

	public WeaponBehavior getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	
	
}
