package net.joshgordon.games.wator;

import java.util.ArrayList; 
import java.util.List;
import java.util.Random; 

public class Board {
	final int sizeX; 
	final int sizeY; 
	private ArrayList<ArrayList<Animal>> board; 
	public static Random rng = new Random(); 
	final static int initialHealth = 10; 
	final static int ticksToBreed = 5; 
	final static int healthFromEating = 2; 
	
	
	public Board(int x, int y) { 
		this.sizeX = x;
		this.sizeY = y;
		
		//Build the initial board
		board = new ArrayList<ArrayList<Animal>>(this.sizeX);
		AnimalType[] types = AnimalType.values();
		int numTypes = types.length; 
		for (int ii = 0; ii < this.sizeX; ii++) 
		{
			ArrayList<Animal> column = new ArrayList<Animal>(this.sizeY); 
			for (int jj = 0; jj < this.sizeY; jj++)
			{
				AnimalType newType = types[rng.nextInt(numTypes)]; 
				if (newType == AnimalType.SHARK) 
				{
					column.add(new Shark(this, ii, jj)); 
				}
				else if (newType == AnimalType.FISH)
				{
					column.add(new Fish(this, ii, jj));
				}
				else if (newType == AnimalType.WATER)
				{
					column.add(new Water(this, ii, jj)); 
				}
			}
			board.add(column); 
		}
	}
	
	public AnimalType checkSquare(int x, int y)  throws InvalidCord
	{
		return board.get(x).get(y).getType(); 
	}
	
	public Animal getSquare(int x, int y)
	{
		return board.get(x).get(y); 
	}
	
	public String printBoard()
	{ 
		StringBuilder sb = new StringBuilder(); 
		for (int ii = 0; ii < this.sizeX; ii++)
		{
			for (int jj = 0; jj < this.sizeY; jj++)
			{
				sb.append(board.get(ii).get(jj).toString()); 
			}
			sb.append("\n"); 
		}
		return sb.toString(); 
	}
	
	public static void main(String [] args)
	{
		Board myBoard = new Board(25, 25); 
		System.out.println(myBoard.printBoard()); 
	}
}
