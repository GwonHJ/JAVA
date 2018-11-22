class TV{
   private int channel;
   private int volumeLevel;
   private boolean on;
   
   public TV(int channel, int volumeLevel, boolean on){
      this.channel=channel;
      this.volumeLevel=volumeLevel;
      this.on=on;
   }
   
   public void turnOn(){   on=true;   }
   
   public void turnOff(){   on=false;   }
   
   public void setChannel(int newChannel){   channel=newChannel;   }
   
   public void setVolume(int newVolumeLevel){   volumeLevel=newVolumeLevel;   }
   
   public void channelUp(){   channel++;   }
   
   public void channelDown(){   channel--;   }
   
   public void volumeUp(){   volumeLevel++;}
   
   public void volumeDown(){   volumeLevel--;   }
   
   public void getState(){
      System.out.println(channel+" "+volumeLevel+" "+on);
   }
   
}
public class UseTV{
   public static void main(String[] args){
      TV tv=new TV(0,0,false);
      
      tv.turnOn();
      tv.channelUp();
      tv.volumeUp();
      tv.getState();
      
   }
}