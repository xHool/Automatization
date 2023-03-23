package com.sophososolutions.apis;


import java.util.Iterator;
import java.util.Map;

import com.sophososolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
    public static final String STR_TOKEN = "0dcb692ea4c51a848e696130eab6b2db8951f6aab9a5a53c38281de8e6e44e4b";

    public static void setBaseUrl(String strBaseUrl) {
        RestInteraction.setBaseUrl(strBaseUrl);
    }

    public static void executeGetRest(String strEndPoint) {
        RestInteraction.executeGetRest(strEndPoint);
    }

    public static void validateStatusCode(int intStatusCode) {
        RestInteraction.validateStatusCode(intStatusCode);
    }

    public static void validateField(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        Iterator<String> it = data.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            RestInteraction.validateField(key, data.get(key));
        }
    }

    public static void validateSchema(String strSchema) {
        RestInteraction.validateSchema(strSchema);
    }
}
