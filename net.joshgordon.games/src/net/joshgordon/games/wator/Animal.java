package net.joshgordon.games.wator;

public abstract class Animal implements Cloneable {
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
	
	public void move(int targetX, int targetY, boolean reproduce)
	{
		//Deal with the old square. 
		if (reproduce) { 
			this.ticksFromBreeding = Board.ticksToBreed; 
			try {
				Animal clone = (Animal) this.clone();
				clone.x = targetX; 
				clone.y = targetY; 
				board.putSquare(targetX, targetY, clone);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		else
		{
			try {
				Animal clone = (Animal) this.clone();
				clone.x = targetX; 
				clone.y = targetY; 
				board.putSquare(targetX, targetY, clone);
				Animal water = new Water(board, x, y); 
				board.putSquare(x, y, water);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		}
	}
	
}
