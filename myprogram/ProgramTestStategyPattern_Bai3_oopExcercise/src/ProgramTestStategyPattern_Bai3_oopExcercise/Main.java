package ProgramTestStategyPattern_Bai3_oopExcercise;

public class Main {
	public static void main(String[] args) {
		
		Character king = new King();
		Character queen = new Queen();
		Character knight = new Knight();
		Character troll = new Troll();
		
		king.setWeapon(new AxeBehavior());
		queen.setWeapon(new ClupBeHavior());
		knight.setWeapon(new KnightBehavior());
		troll.setWeapon(new SwordBehavior());
		
		king.fight();
		queen.fight();
		knight.fight();
		troll.fight();
		
	}
}
