package com.pingan.monkey;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;

/**
 * Created by hujiachun on 16/12/23.
 */
public class MonkeyBackEvent extends MonkeyEvent {
    private float backX, backY;
    private MacacaClient driver;

    public MonkeyBackEvent(MacacaClient driver, float backX, float backY) {
        super(MonkeyEvent.EVENT_TYPE_BACK);
        this.backX = backX;
        this.backY = backY;
        this.driver = driver;

    }

    public int injectEvent() throws Exception {
        System.out.println("sending Event : Back->(" + backX + "," + backY + ")");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", backX);
        jSONObject.put("y", backY);
        driver.touch("tap", jSONObject);
        return MonkeyEvent.INJECT_SUCCESS;
    }
}
