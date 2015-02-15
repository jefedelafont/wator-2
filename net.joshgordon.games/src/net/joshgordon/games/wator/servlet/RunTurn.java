package net.joshgordon.games.wator.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.joshgordon.games.wator.Board;

/**
 * Servlet implementation class RunTurn
 */
@WebServlet("/RunTurn")
public class RunTurn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Board game = new Board(25, 25); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunTurn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain"); 
		PrintWriter out = response.getWriter(); 
		
		game.tick();  
		out.write(game.printBoard());
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("x-size")); 
		int x = Integer.parseInt(request.getParameter("x-size")); 
		int y = Integer.parseInt(request.getParameter("y-size"));
		game = new Board(x, y); 
		// TODO Auto-generated method stub
	}

}
