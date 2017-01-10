package com.pingan.monkey;

/**
 * Created by hujiachun on 16/12/23.
 */
public class MathRandom {

    /**
     * 0出现的概率为%30
     */
    public static double EVENT_TYPE_TAP = 0.30;
    /**
     * 1出现的概率为%10
     */
    public static double EVENT_TYPE_SWIPE = 0.10;
    /**
     * 2出现的概率为%10
     */
    public static double EVENT_TYPE_LAUNCH = 0.10;

    public static double EVENT_TYPE_BACK = 0.10;

    public static double EVENT_TYPE_SUBMIT = 0.10;

    public static double EVENT_TYPE_CONTENT = 0.30;



    public int PercentageRandom() {
        double randomNumber;
        randomNumber = Math.random();
        if (randomNumber >= 0 && randomNumber <= EVENT_TYPE_TAP) {
            return 0;
        } else if (randomNumber >= EVENT_TYPE_TAP / 100 && randomNumber <= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE) {
            return 1;
        } else if (randomNumber >= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE
                && randomNumber <= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH) {
            return 2;
        } else if (randomNumber >= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH
                && randomNumber <= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH + EVENT_TYPE_BACK) {
            return 3;
        } else if (randomNumber >= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH + EVENT_TYPE_BACK
                && randomNumber <= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH + EVENT_TYPE_BACK + EVENT_TYPE_SUBMIT) {
            return 4;
        } else if (randomNumber >= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH + EVENT_TYPE_BACK + EVENT_TYPE_SUBMIT
                && randomNumber <= EVENT_TYPE_TAP + EVENT_TYPE_SWIPE + EVENT_TYPE_LAUNCH + EVENT_TYPE_BACK + EVENT_TYPE_SUBMIT
                + EVENT_TYPE_CONTENT) {
            return 5;
        }
        return -1;
    }
}
