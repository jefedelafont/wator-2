package net.joshgordon.games.wator;

public class Fish extends Animal {

	public Fish(Board board, int x, int y) {
		super(board, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType getType() {
		// TODO Auto-generated method stub
		return AnimalType.FISH;
	}
	
	public String toString()
	{
		return "."; 
	}

	@Override
	public void tick() {
		Direction moveDirection = Direction.getRandom();
		int targetX = this.x; 
		int targetY = this.y; 
		switch (moveDirection)
		{
		case NORTH: 
			//do move north; 
			break; 
		case SOUTH: 
			//do move south; 
			break; 
		case EAST: 
			//do move east; 
			break; 
		case WEST: 
			//do move west; 
			break; 				
		}
		
	}

}
