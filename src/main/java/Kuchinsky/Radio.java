package Kuchinsky;

public class Radio {
   public int RadioWave;
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


   public int getRadioWave(){

      return RadioWave;
   }







   public void setRadioWave(int RadioWave) {
      if (RadioWave < 0){
         return;

      }
      if (RadioWave > 9){
         return;
      }
      this.RadioWave = RadioWave;


   }

   public void MinRadioWave() {
      if (RadioWave > 0) {
         RadioWave--;


      } else {
         RadioWave = 9;
      }


   }

   public void MaxRadioWave() {
      if (RadioWave  < 9) {
         RadioWave++;


      }else {
         RadioWave = 0;
      }



   }


}
