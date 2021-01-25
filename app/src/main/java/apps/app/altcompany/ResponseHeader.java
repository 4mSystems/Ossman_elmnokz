package apps.app.altcompany;

import com.google.gson.annotations.SerializedName;

public class ResponseHeader {
    @SerializedName("msg")
    private String msg;

    @SerializedName("code")
    private int code;

    @SerializedName("status")
    private String status;

    public String getMsg(){
        return msg;
    }

    public int getCode(){
        return code;
    }
    public String getStatus(){
        return status;
    }
}
