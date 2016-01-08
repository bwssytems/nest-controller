
package com.bwssystems.nest.protocol.status;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WhereItem {

    @SerializedName("where_id")
    @Expose
    private String whereId;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The whereId
     */
    public String getWhereId() {
        return whereId;
    }

    /**
     * 
     * @param whereId
     *     The where_id
     */
    public void setWhereId(String whereId) {
        this.whereId = whereId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
