package Kuchinsky;

public class Radio {
    private int radioWave;
    private int radioVolume;

    public int getradioVolume() {

        return radioVolume;
    }

    public void setradioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 10) {
            return;
        }
        this.radioVolume = radioVolume;
    }

    public void increaseRadioVolume() {
        if (radioVolume < 10) {
            radioVolume++;

        } else {
            radioVolume = 10;


        }


    }

    public void decreaseRadioVolume() {
        if (radioVolume > 0) {
            radioVolume--;


        } else {
            radioVolume = 0;


        }


    }


    public int getradioWave() {

        return radioWave;
    }


    public void setradioWave(int radioWave) {
        if (radioWave < 0) {
            return;

        }
        if (radioWave > 9) {
            return;
        }
        this.radioWave = radioWave;


    }

    public void MinRadioWave() {
        if (radioWave > 0) {
            radioWave--;


        } else {
            radioWave = 9;
        }


    }

    public void MaxRadioWave() {
        if (radioWave < 9) {
            radioWave++;


        } else {
            radioWave = 0;
        }


    }


}
