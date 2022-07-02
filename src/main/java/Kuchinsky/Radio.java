package Kuchinsky;

public class Radio {
    public int radioWave;
    public int radioVolume;
    public int maxRadioWave = 11;
    public int minRadioWave = 0;
    public int maxRadioVjlume = 100;
    public int minRadioVolume = 0;


    public int getMaxRadioVjlume() {
        return maxRadioVjlume;
    }

    public void setMaxRadioVjlume(int maxRadioVjlume) {
        this.maxRadioVjlume = maxRadioVjlume;
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }

    public void setMinRadioVolume(int minRadioVolume) {
        this.minRadioVolume = minRadioVolume;
    }


    public int getMinRadioWave() {
        return minRadioWave;
    }

    public void setMinRadioWave(int minRadioWave) {
        this.minRadioWave = minRadioWave;
    }

    public int getMaxRadioWave() {
        return maxRadioWave;
    }

    public void setMaxRadioWave(int maxRadioWave) {
        this.maxRadioWave = maxRadioWave;
    }


    public int getradioVolume() {

        return radioVolume;
    }

    public void setradioVolume(int radioVolume) {
        if (radioVolume < minRadioVolume) {
            return;
        }
        if (radioVolume > maxRadioVjlume) {
            return;
        }
        this.radioVolume = radioVolume;
    }

    public void increaseRadioVolume() {
        if (radioVolume < maxRadioVjlume) {
            radioVolume = radioVolume + 1;


        }


    }

    public void decreaseRadioVolume() {
        if (radioVolume > minRadioVolume) {
            radioVolume = radioVolume - 1;


        }


    }


    public int getradioWave() {

        return radioWave;
    }


    public void setradioWave(int radioWave) {
        if (radioWave < minRadioWave) {
            return;

        }
        if (radioWave > maxRadioWave) {
            return;
        }
        this.radioWave = radioWave;


    }

    public void MinRadioWave() {
        if (radioWave > minRadioWave) {
            radioWave--;


        } else {
            radioWave = maxRadioWave;
        }


    }

    public void MaxRadioWave() {
        if (radioWave < maxRadioWave) {
            radioWave++;


        } else {
            radioWave = minRadioWave;
        }


    }


}
