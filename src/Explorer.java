
public class Explorer {

	private int x = 0;
	private int y = 0;
	private String direction = "N";
	private int[] grid;
	
	public Explorer()
	{
		
	}
	
	public Explorer(int x, int y, String obstacles)
	{
		this.setX(x);
		this.setY(y);
		
	}
	
	public void moveForth()
	{
		if(direction == "N" && y < grid[1])
			y++;
		else if(direction == "N" && y == grid[1])
			y = 0;
		if(direction == "E" && x < grid[0])
			x++;
		else if(direction == "E" && x == grid[0])
			x = 0;
		if(direction == "S" && y > 0)
			y--;
		else if(direction == "S" && y == 0)
			y = grid[1];
		if(direction == "W" && x > 0)
			x--;
		else if(direction == "W" && x == 0)
			x = grid[0];
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int[] getGrid() {
		return grid;
	}

	public void setGrid(int[] grid) {
		this.grid = grid;
	}
}
