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
		int targetX = this.x + this.board.sizeX; 
		int targetY = this.y + this.board.sizeY; 
		ticksFromBreeding --; 
		switch (moveDirection)
		{
		case NORTH: 
			//do move north; 
			targetY -= 1; 
			break; 
		case SOUTH: 
			//do move south; 
			targetY += 1; 
			break; 
		case EAST: 
			//do move east; 
			targetX -= 1; 
			break; 
		case WEST: 
			//do move west; 
			targetX += 1; 
			break; 				
		}
		targetX %= this.board.sizeX; 
		targetY %= this.board.sizeY; 
		
		AnimalType newSpace = board.checkSquare(targetX, targetY); 
		if (newSpace == AnimalType.WATER)
		{
			move(targetX, targetY, ticksFromBreeding == 0);
		}
		
	}

}
