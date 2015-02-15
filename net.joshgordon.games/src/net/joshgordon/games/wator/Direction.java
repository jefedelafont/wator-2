package net.joshgordon.games.wator;

public enum Direction {
	NORTH, SOUTH, EAST, WEST; 
	
	private static final Direction[] directions = Direction.values(); 
	private static final int numDirections = directions.length; 
	public static Direction getRandom() 
	{
		return directions[Board.rng.nextInt(numDirections)]; 
	}
}
