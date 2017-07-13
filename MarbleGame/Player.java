package example2;

public class Player 
{
	String playerName;
	int myMarble;          // Quantity of Marble
	
	public Player(String name, int marble)   //Initialize
	{
		playerName = name;
		myMarble = marble;
	}
	
	public void marblePlay(Player player, int n)
	{
		n = player.loseBead(n);
		myMarble = myMarble + n;
	}
	
	public int loseBead(int loseCount)
	{
		
		if(myMarble<loseCount)
		{
			int retValue=myMarble;
			myMarble = 0;
			return retValue;
		}
		myMarble = myMarble - loseCount;
		return loseCount;
	}
	
	public void showPlayer()  // display marble quantity
	{
		System.out.println(playerName + " has " + myMarble + " marble.");
	}
}
