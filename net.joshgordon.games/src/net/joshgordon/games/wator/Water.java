package net.joshgordon.games.wator;

public class Water extends Animal {

	public Water(Board board, int x, int y) {
		super(board, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType getType() {
		// TODO Auto-generated method stub
		return AnimalType.WATER;
	}
	
	public String toString()
	{
		return " "; 
	}

	@Override
	public void tick() {
		//water just kinda.... does nothing... sits there... No need to do anything with the tick. 
		return; 
	}

}
