package Kuchinsky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testVolumeMax() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioVolume(100);
        cound.increaseRadioVolume();
        int expected = 100;
        int actual = cound.getradioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolmeIncrease() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioVolume(9);
        cound.increaseRadioVolume();
        int expected = 10;
        int actual = cound.getradioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMin() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioVolume(0);
        cound.decreaseRadioVolume();
        int expected = 0;
        int actual = cound.getradioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeDecrease() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioVolume(1);
        cound.decreaseRadioVolume();
        int expected = 0;
        int actual = cound.getradioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMin() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioWave(0);
        cound.MinRadioWave();
        int expected = 11;
        int actual = cound.getradioWave();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMax() {
        Radio cound = new Radio(12);
        //cound.radioVolume = 8;
        cound.setradioWave(11);
        cound.MaxRadioWave();
        int expected = 0;
        int actual = cound.getradioWave();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMinLimit() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioWave(1);
        cound.MinRadioWave();
        int expected = 0;
        int actual = cound.getradioWave();
        assertEquals(expected, actual);

    }

    @Test
    public void testWaveMaxLimit() {
        Radio cound = new Radio();
        //cound.radioVolume = 8;
        cound.setradioWave(8);
        cound.MaxRadioWave();
        int expected = 9;
        int actual = cound.getradioWave();
        assertEquals(expected, actual);

    }


}