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
   public void increaseRadioVolume() {
      if (RadioVolume < 10) {
         RadioVolume = RadioVolume + 1;


      }


   }

   public void decreaseRadioVolume() {
      if (RadioVolume > 0) {
         RadioVolume = RadioVolume - 1;


      }


   }


   public int RadioWave;
   public int getRadioWave(){

      return RadioWave;
   }
   private int WaveMax = 9;
   private int WaveMin = 0;


   public void setRadioWave(int RadioWave) {
      if (RadioWave < WaveMin){
         return;

      }
      if (RadioWave > WaveMax){
         return;
      }
      this.RadioWave = RadioWave;

   }

   public int MinRadioWave() {
      if (RadioVolume  < 0) {
         RadioVolume = RadioVolume - 1;{
            if (RadioVolume - 1 < 0);

         }



      }

      return WaveMax;
   }

   public int MaxRadioWave() {
      if (RadioVolume +1 > 9) {
         RadioVolume = WaveMin;


      }
      return WaveMin;


   }


}
