package Kuchinsky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testVolumeMax(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
       cound.setRadioVolume(10);
      cound.increaseRadioVolume();
        int expected = 10;
        int actual = cound.getRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolmeIncrease(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioVolume(9);
        cound.increaseRadioVolume();
        int expected = 10;
        int actual = cound.getRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMin(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioVolume(0);
        cound.decreaseRadioVolume();
        int expected = 0;
        int actual = cound.getRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeDecrease(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioVolume(1);
        cound.decreaseRadioVolume();
        int expected = 0;
        int actual = cound.getRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMin(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioWave(0);
        cound.MinRadioWave();
        int expected = 9;
        int actual = cound.getRadioWave();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMax(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioWave(9);
        cound.MaxRadioWave();
        int expected = 0;
        int actual = cound.getRadioWave();
        assertEquals(expected, actual);

    }
    @Test
    public void testWaveMinLimitValue(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioWave(1);
        cound.MinRadioWave();
        int expected = 0;
        int actual = cound.getRadioWave();
        assertEquals(expected, actual);

    }
    @Test
    public void testWaveMaxLimitValue(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
        cound.setRadioWave(8);
        cound.MaxRadioWave();
        int expected = 9;
        int actual = cound.getRadioWave();
        assertEquals(expected, actual);

    }




}