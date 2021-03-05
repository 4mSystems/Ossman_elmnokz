
package te.app.ossman_elmonkz.model.base;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMessage {

    @SerializedName("msg")
    @Expose
    public String mMessage;
    @SerializedName("code")
    @Expose
    public int code;

}
