
package te.app.mezzastore.model.base;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMessage {

    @SerializedName("msg")
    @Expose
    public String mMessage;
    @SerializedName("status")
    @Expose
    public String mStatus;
    @SerializedName("code")
    @Expose
    public int code;


}
