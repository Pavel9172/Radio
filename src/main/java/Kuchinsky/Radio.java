package Kuchinsky;

public class Radio {

   public int RadioVolume;
   public int getRadioVolume(){
      return RadioVolume;
   }

   public void setRadioVolume(int RadioVolume){
      if (RadioVolume < 0){
         return;
      }
      if (RadioVolume > 10){
         return;
      }
      this.RadioVolume = RadioVolume;
   }
   public void increaseRadioVolume(int RadioVolume) {
      if (RadioVolume < 10) {
         RadioVolume = RadioVolume + 1;
         return;

      }
   }


}
