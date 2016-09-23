
package com.bwssystems.nest.protocol.status;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StructureDetail {

    @SerializedName("$version")
    @Expose
    private Long $version;
    @SerializedName("$timestamp")
    @Expose
    private Long $timestamp;
    @SerializedName("away")
    @Expose
    private Boolean away;
    @SerializedName("away_setter")
    @Expose
    private Long awaySetter;
    @SerializedName("away_timestamp")
    @Expose
    private Long awayTimestamp;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("creation_time")
    @Expose
    private Long creationTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("topaz_away")
    @Expose
    private Boolean topazAway;
    @SerializedName("topaz_hush_key")
    @Expose
    private String topazHushKey;
//    @SerializedName("touched_by")
//    @Expose
//    private JsonObject touchedBy;
    @SerializedName("user")
    @Expose
    private String user;
//    @SerializedName("devices")
//    @Expose
//    private List<String> devices = new ArrayList<String>();
//    @SerializedName("swarm")
//    @Expose
//    private List<String> swarm = new ArrayList<String>();
//    @SerializedName("fabric_ids")
//    @Expose
//    private List<JsonObject> fabricIds = new ArrayList<JsonObject>();
//    @SerializedName("clutches")
//    @Expose
//    private List<JsonObject> clutches = new ArrayList<JsonObject>();
//    @SerializedName("members")
//    @Expose
//    private List<JsonObject> members = new ArrayList<JsonObject>();

    /**
     * 
     * @return
     *     The $version
     */
    public Long get$version() {
        return $version;
    }

    /**
     * 
     * @param $version
     *     The $version
     */
    public void set$version(Long $version) {
        this.$version = $version;
    }

    /**
     * 
     * @return
     *     The $timestamp
     */
    public Long get$timestamp() {
        return $timestamp;
    }

    /**
     * 
     * @param $timestamp
     *     The $timestamp
     */
    public void set$timestamp(Long $timestamp) {
        this.$timestamp = $timestamp;
    }

    /**
     * 
     * @return
     *     The away
     */
    public Boolean getAway() {
        return away;
    }

    /**
     * 
     * @param away
     *     The away
     */
    public void setAway(Boolean away) {
        this.away = away;
    }

    /**
     * 
     * @return
     *     The awaySetter
     */
    public Long getAwaySetter() {
        return awaySetter;
    }

    /**
     * 
     * @param awaySetter
     *     The away_setter
     */
    public void setAwaySetter(Long awaySetter) {
        this.awaySetter = awaySetter;
    }

    /**
     * 
     * @return
     *     The awayTimestamp
     */
    public Long getAwayTimestamp() {
        return awayTimestamp;
    }

    /**
     * 
     * @param awayTimestamp
     *     The away_timestamp
     */
    public void setAwayTimestamp(Long awayTimestamp) {
        this.awayTimestamp = awayTimestamp;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The creationTime
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * 
     * @param creationTime
     *     The creation_time
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
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

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The time_zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * @return
     *     The topazAway
     */
    public Boolean getTopazAway() {
        return topazAway;
    }

    /**
     * 
     * @param topazAway
     *     The topaz_away
     */
    public void setTopazAway(Boolean topazAway) {
        this.topazAway = topazAway;
    }

    /**
     * 
     * @return
     *     The topazHushKey
     */
    public String getTopazHushKey() {
        return topazHushKey;
    }

    /**
     * 
     * @param topazHushKey
     *     The topaz_hush_key
     */
    public void setTopazHushKey(String topazHushKey) {
        this.topazHushKey = topazHushKey;
    }

    /**
     * 
     * @return
     *     The touchedBy
     */
//    public JsonObject getTouchedBy() {
//        return touchedBy;
//    }

    /**
     * 
     * @param touchedBy
     *     The touched_by
     */
 //   public void setTouchedBy(JsonObject touchedBy) {
//        this.touchedBy = touchedBy;
//    }

    /**
     * 
     * @return
     *     The user
     */
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The devices
     */
//    public List<String> getDevices() {
//        return devices;
//    }

    /**
     * 
     * @param devices
     *     The devices
     */
//    public void setDevices(List<String> devices) {
//        this.devices = devices;
//    }

    /**
     * 
     * @return
     *     The swarm
     */
//    public List<String> getSwarm() {
//        return swarm;
//    }

    /**
     * 
     * @param swarm
     *     The swarm
     */
//    public void setSwarm(List<String> swarm) {
//        this.swarm = swarm;
//    }

    /**
     * 
     * @return
     *     The fabricIds
     */
//    public List<JsonObject> getFabricIds() {
//        return fabricIds;
//    }

    /**
     * 
     * @param fabricIds
     *     The fabric_ids
     */
//    public void setFabricIds(List<JsonObject> fabricIds) {
//        this.fabricIds = fabricIds;
//    }

    /**
     * 
     * @return
     *     The clutches
     */
//    public List<JsonObject> getClutches() {
//        return clutches;
//    }

    /**
     * 
     * @param clutches
     *     The clutches
     */
//    public void setClutches(List<JsonObject> clutches) {
//        this.clutches = clutches;
//    }

    /**
     * 
     * @return
     *     The members
     */
//    public List<JsonObject> getMembers() {
//        return members;
//    }

    /**
     * 
     * @param members
     *     The members
     */
//    public void setMembers(List<JsonObject> members) {
//        this.members = members;
//    }

}
