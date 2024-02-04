package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;
import org.springframework.stereotype.Component;

import java.util.Random;


public class TwelveSidedDie implements DieRoller {

    @Override
    public int getDieRoll() {
        Random random = new Random();
        return random.nextInt(12) + 1;
    }
}
