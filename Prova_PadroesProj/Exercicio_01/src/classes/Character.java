package classes;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public Character() {}
	
	public void fight(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public abstract void Name();
	
	public void Atacar() {
		this.weapon.useWeapon();
	}

}
