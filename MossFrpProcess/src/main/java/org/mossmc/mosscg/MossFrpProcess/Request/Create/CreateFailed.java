package org.mossmc.mosscg.MossFrpProcess.Request.Create;

import com.alibaba.fastjson.JSONObject;
import org.mossmc.mosscg.MossFrpProcess.Request.RequestJSON;

public class CreateFailed {
    public static JSONObject create(String name) {
        JSONObject jsonObject = RequestJSON.createNewRequest("failed");
        jsonObject.put("name",name);
        return jsonObject;
    }
}
