
import javax.swing.JOptionPane;

public class PlayGame
{
	public static void main(String[] args) 
	{
		TicTacToe_Class mTTT = new TicTacToe_Class();

		boolean Playing = true;
		// Loop until game is over
		do 
		{	
			mTTT.UserMove();
			mTTT.ComputerMove();
			Playing = mTTT.CheckWinner();
		} while (Playing);
		// All done
		mTTT.DoneMessege();
	}
}