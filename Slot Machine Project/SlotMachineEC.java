public class SlotMachineEC
{
    private String face1;
    private String face2;
    private String face3;
    private String face4;
    private String face5;
    private String face6;
    private int number;
    private boolean winner;    
    //contructs a 3 reel, 6 icon slot machine with String descriptions of the 6 visual elements
    public SlotMachineEC(String one, String two, String three, String four, String five, String six, int num)
    {
       face1 = one;
       face2 = two;
       face3 = three;
       face4 = four;
       face5 = five;
       face6 = six;
       number = num;
    }
    //simulates a pull of the slot machine handle by calling faceImage() to randomly generate visual elements
    //a resulting face for each of the 3 slot machine reels.  If the spin is a win, the method
    //returns a String that presents
    //the resulting spin results (e.g., "Spin is:  apple apple grape").
    public String spin()
    {
        //Call faceImage() three times
        
        //If all three-five reels match then it wins, if one or two of them don't equal then it didn't win
        if(reel1.equals(reel2) && reel1.equals(reel3) && reel1.equals(reel4) && reel1.equals(reel5) && reel2.equals(reel3) && reel2.equals(reel4) && reel2.equals(reel5) && reel3.equals(reel4) && reel3.equals(reel5) && reel4.equals(reel5)) 
           setWinner(true);
        else
           setWinner(false); 
        return reel1 + " " + reel2 + " " + reel3 + " " + reel4 + " " + reel5;
    }
    
    public void setWinner(boolean b)
    {
       winner = b;
    }
    
    public boolean getWinner()
    {
       return winner;
    }
    
    //returns a random face from the six icons passed in the constructor and saved in
    //face1 to face6.  Uses 1 + (int)(Math.random() * 6) to generate a random number between 1-6
    public String faceImage()
    {
        int number = 1 + (int)(Math.random() * 6);  //returns 1 thru 6
        //If "number" equals any of the numbers then it will return the face that matches the number 
        if (number == 1) 
            return face1;
        if (number == 2)
            return face2;
        if (number == 3)
            return face3;
        if (number == 4)
            return face4;
        if (number == 5)
            return face5;
        return face6;
    }
}