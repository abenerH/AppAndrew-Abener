package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class;

import com.google.gson.annotations.SerializedName;

/**
 * Created by thech on 24/2/2018.
 */

public class Id {
    @SerializedName("$oid")
    private String oid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}
