package net.joshgordon.games.wator;

public class Shark extends Animal {
	int health; 
	
	public Shark(Board board, int x, int y) {
		super(board, x, y);
		this.health = Board.initialHealth; 
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

	public void tick() {
		Direction moveDirection = Direction.getRandom();
		int targetX = this.x + this.board.sizeX; 
		int targetY = this.y + this.board.sizeY; 
		ticksFromBreeding --; 
		health --;
		if (health == 0)
		{
			board.putSquare(x, y, new Water(board, x, y));
			return; 
		}
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
		switch(newSpace)
		{
			//letting it fall through so we can gain energy if we eat a fish. 
		case FISH: 
			health += Board.healthFromEating; 
		case WATER: 
			move(targetX, targetY, ticksFromBreeding == 0);
			
			break; 
		}
		
		
	}

}
