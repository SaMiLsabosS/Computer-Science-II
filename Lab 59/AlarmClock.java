public class AlarmClock
{
   private String currentTime;
   private String alarmTime;
   private boolean alarmSet;
   public AlarmClock()
   {
     currentTime = "";
     alarmTime = "";
     alarmSet = true;
   }
   public AlarmClock(String cT, String aT, boolean aS)
   {
     currentTime = cT;
     alarmTime = aT;
     alarmSet = aS;
   }
   public void setcurrentTime(String cT)
   {
     currentTime = cT;  
   }
   public void setalarmTime(String aT)
   {
     alarmTime = aT;  
   }
   public void setalarmSet(boolean aS)
   {
     alarmSet = aS;  
   }
   public String getcurrentTime()
   {
     return currentTime;  
   }
   public String getalarmTime()
   {
     return alarmTime;  
   }
   public boolean getalarmSet()
   {
     return alarmSet;  
   }
   public String toString()
   {
     return "The time right now is "+currentTime+", my alarm time is "+alarmTime+", and my alarm is set"+alarmSet;
   }
   public void setAlarm(String aT, boolean aS)
   {
     alarmTime = aT;
     alarmSet = aS;
   }
   public void snooze()
   {
     alarmTime = alarmTime + " + 10";
     alarmSet = true;
   }
}
