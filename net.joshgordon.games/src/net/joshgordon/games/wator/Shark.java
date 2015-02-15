package net.joshgordon.games.wator;

public class Shark extends Animal {
	int health; 
	
	public Shark(Board board, int x, int y) {
		super(board, x, y);
		this.health = board.initialHealth; 
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType getType() {
		// TODO Auto-generated method stub
		return AnimalType.SHARK;
	}
	
	public String toString()
	{ 
		return "*"; 
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

}
