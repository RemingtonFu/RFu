package classnotes;

public class pokemon {

	int level;
	int hp;
	String name = "";
	boolean poisoned = false;
	
	public void createPokemon(String name, int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}
	
	public void iChooseYou(String name) {
		System.out.println(name+" "+name+"!");
	}
	
	public String getName() {
		return name;
	}
	
	private void setHP(int newHP) {
		newHP = hp;
	}
	
	private void setPoisoned(boolean b) {
		b = false;
	}
	
	private void lapse(int newHP) {
		if(poisoned = true) {
			newHP -=15;
		}
	}
	
	public void attack(pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
	}
	
	public void levelUp(Effect e) {
		this.level++;
		e happens();
	}
	public void happens() {
		
	}
	
}
