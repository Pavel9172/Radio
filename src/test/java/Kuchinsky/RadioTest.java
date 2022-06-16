package Kuchinsky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void test(){
        Radio cound = new Radio();
        //cound.RadioVolume = 8;
       cound.setRadioVolume(6);
      cound.increaseRadioVolume(6);
        int expected = 7;
        int actual = cound.getRadioVolume();
        assertEquals(expected, actual);

    }

}