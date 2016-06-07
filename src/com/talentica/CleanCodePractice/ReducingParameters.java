package com.talentica.CleanCodePractice;

public class ReducingParameters {

public static void main(String[] args) {
	SpeedRange sr = new SpeedRange();
	boolean  currentSpeed = ReducingParameters.SpeedIsAcceptable(sr, 60);	
	System.out.println("The current Speed is "  + currentSpeed);
}
/*	//Bad Code
public static boolean SpeedIsAcceptable(int minSpeed, int maxSpeed, int currentSpeed)
{
    return currentSpeed >= minSpeed & currentSpeed < maxSpeed;   
}
*/


  //Good Code
static class SpeedRange
{
   public int Min;
   public int Max;

   public boolean Contains(int speed)
   {
       return speed >= Min & speed < Max;
   }
}

public static boolean SpeedIsAcceptable(SpeedRange sr, int currentSpeed)
{
	sr.Min= 30;
	sr.Max = 50;
    return sr.Contains(currentSpeed);
}

}
