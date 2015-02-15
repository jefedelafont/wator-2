package net.joshgordon.games.wator;

public abstract class Animal {
	protected int x;
	protected int y;
	protected int ticksFromBreeding = Board.ticksToBreed; 
	
	Board board;
	
	public Animal(Board board, int x, int y) { 
		this.board = board; 
		this.x = x; 
		this.y = y; 
	}
	
	public abstract  void tick(); 
	
	public abstract AnimalType getType(); 
	public abstract String toString(); 
	
}
