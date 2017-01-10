package com.pingan.monkey;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;

/**
 * Created by hujiachun on 16/12/23.
 */
public class MonkeyTapEvent extends MonkeyEvent{
    private int width, height;
    private MacacaClient driver;


    public MonkeyTapEvent(MacacaClient driver, int width, int height) {
        super(MonkeyEvent.EVENT_TYPE_TAP);
        this.width = width;
        this.height = height;
        this.driver = driver;

    }


    public int injectEvent() throws Exception {
        double x = Math.ceil(Math.random() * (width - 1));
        double y = Math.ceil(Math.random() * (height - 1));
        System.out.println("sending Event : Tap->(" + x + ", " + y + ")");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", x);
        jSONObject.put("y", y);
        driver.touch("tap", jSONObject);
        return MonkeyEvent.INJECT_SUCCESS;
    }
}
