package Models;

public class Pokemon {
	private String name;
	private Integer health;
	private String type;
	private static Integer count = 0;
	
	public Pokemon(String name, Integer health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	
	public static Integer getPokemonCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void attackPokemon(Pokemon target) {
		target.health -= 10;
		System.out.println(this.name + " attacked " + target.name);
	}
}
