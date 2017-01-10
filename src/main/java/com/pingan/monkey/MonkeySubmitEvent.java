package com.pingan.monkey;

import com.alibaba.fastjson.JSONObject;
import macaca.client.MacacaClient;

import java.util.Random;

/**
 * Created by hujiachun on 16/12/23.
 */
public class MonkeySubmitEvent extends MonkeyEvent {
    private MacacaClient driver;
    private int submitX_mim, submitX_max, submitY_mim, submitY_max;

    public MonkeySubmitEvent(MacacaClient driver, int submitX_mim, int submitX_max, int submitY_mim, int submitY_max) {
        super(MonkeyEvent.EVENT_TYPE_SUBMIT);
        this.submitX_max = submitX_max;
        this.submitX_mim = submitX_mim;
        this.submitY_max = submitY_max;
        this.submitY_mim = submitY_mim;
        this.driver = driver;

    }

    public int injectEvent() throws Exception {
        Random random = new Random();
        int x = random.nextInt(submitX_max) % (submitX_max - submitX_mim + 1) + submitX_mim;
        int y = random.nextInt(submitY_max) % (submitY_max - submitY_mim + 1) + submitY_mim;
        System.out.println("sending Event : Submit->(" + x + "," + y + ")");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", x);
        jSONObject.put("y", y);
        driver.touch("tap", jSONObject);
        return MonkeyEvent.INJECT_SUCCESS;
    }


}
