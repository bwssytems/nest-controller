
package com.bwssystems.nest.protocol.status;

import javax.annotation.Generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class NestStatus {

    @SerializedName("topaz_resource")
    @Expose
    private JsonObject topazResource;
    @SerializedName("user_alert_dialog")
    @Expose
    private JsonObject userAlertDialog;
    @SerializedName("buckets")
    @Expose
    private JsonObject buckets;
    @SerializedName("track")
    @Expose
    private JsonObject track;
    @SerializedName("message_center")
    @Expose
    private JsonObject messageCenter;
    @SerializedName("occupancy")
    @Expose
    private JsonObject occupancy;
    @SerializedName("topaz")
    @Expose
    private JsonObject topaz;
    @SerializedName("safety")
    @Expose
    private JsonObject safety;
    @SerializedName("utility")
    @Expose
    private JsonObject utility;
    @SerializedName("where")
    @Expose
    private Where where;
    @SerializedName("structure")
    @Expose
    private Structure structure;
    @SerializedName("message")
    @Expose
    private JsonObject message;
    @SerializedName("tuneups")
    @Expose
    private JsonObject tuneups;
    @SerializedName("quartz")
    @Expose
    private JsonObject quartz;
    @SerializedName("device")
    @Expose
    private Device device;
    @SerializedName("trip")
    @Expose
    private JsonObject trip;
    @SerializedName("widget_track")
    @Expose
    private JsonObject widgetTrack;
    @SerializedName("demand_response")
    @Expose
    private JsonObject demandResponse;
    @SerializedName("delayed_topaz")
    @Expose
    private JsonObject delayedTopaz;
    @SerializedName("user")
    @Expose
    private JsonObject user;
    @SerializedName("link")
    @Expose
    private JsonObject link;
    @SerializedName("device_alert_dialog")
    @Expose
    private JsonObject deviceAlertDialog;
    @SerializedName("geofence_info")
    @Expose
    private JsonObject geofenceInfo;
    @SerializedName("metadata")
    @Expose
    private JsonObject metadata;
    @SerializedName("user_settings")
    @Expose
    private JsonObject userSettings;
    @SerializedName("shared")
    @Expose
    private Shared shared;
    @SerializedName("structure_metadata")
    @Expose
    private JsonObject structureMetadata;
    @SerializedName("schedule")
    @Expose
    private JsonObject schedule;
    @SerializedName("safety_summary")
    @Expose
    private JsonObject safetySummary;

    /**
     * 
     * @return
     *     The topazResource
     */
    public JsonObject getTopazResource() {
        return topazResource;
    }

    /**
     * 
     * @param topazResource
     *     The topaz_resource
     */
    public void setTopazResource(JsonObject topazResource) {
        this.topazResource = topazResource;
    }

    /**
     * 
     * @return
     *     The userAlertDialog
     */
    public JsonObject getUserAlertDialog() {
        return userAlertDialog;
    }

    /**
     * 
     * @param userAlertDialog
     *     The user_alert_dialog
     */
    public void setUserAlertDialog(JsonObject userAlertDialog) {
        this.userAlertDialog = userAlertDialog;
    }

    /**
     * 
     * @return
     *     The buckets
     */
    public JsonObject getBuckets() {
        return buckets;
    }

    /**
     * 
     * @param buckets
     *     The buckets
     */
    public void setBuckets(JsonObject buckets) {
        this.buckets = buckets;
    }

    /**
     * 
     * @return
     *     The track
     */
    public JsonObject getTrack() {
        return track;
    }

    /**
     * 
     * @param track
     *     The track
     */
    public void setTrack(JsonObject track) {
        this.track = track;
    }

    /**
     * 
     * @return
     *     The messageCenter
     */
    public JsonObject getMessageCenter() {
        return messageCenter;
    }

    /**
     * 
     * @param messageCenter
     *     The message_center
     */
    public void setMessageCenter(JsonObject messageCenter) {
        this.messageCenter = messageCenter;
    }

    /**
     * 
     * @return
     *     The occupancy
     */
    public JsonObject getOccupancy() {
        return occupancy;
    }

    /**
     * 
     * @param occupancy
     *     The occupancy
     */
    public void setOccupancy(JsonObject occupancy) {
        this.occupancy = occupancy;
    }

    /**
     * 
     * @return
     *     The topaz
     */
    public JsonObject getTopaz() {
        return topaz;
    }

    /**
     * 
     * @param topaz
     *     The topaz
     */
    public void setTopaz(JsonObject topaz) {
        this.topaz = topaz;
    }

    /**
     * 
     * @return
     *     The safety
     */
    public JsonObject getSafety() {
        return safety;
    }

    /**
     * 
     * @param safety
     *     The safety
     */
    public void setSafety(JsonObject safety) {
        this.safety = safety;
    }

    /**
     * 
     * @return
     *     The utility
     */
    public JsonObject getUtility() {
        return utility;
    }

    /**
     * 
     * @param utility
     *     The utility
     */
    public void setUtility(JsonObject utility) {
        this.utility = utility;
    }

    /**
     * 
     * @return
     *     The where
     */
    public Where getWhere() {
        return where;
    }

    /**
     * 
     * @param where
     *     The where
     */
    public void setWhere(Where where) {
        this.where = where;
    }

    /**
     * 
     * @return
     *     The structure
     */
    public Structure getStructure() {
        return structure;
    }

    /**
     * 
     * @param structure
     *     The structure
     */
    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    /**
     * 
     * @return
     *     The message
     */
    public JsonObject getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(JsonObject message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The tuneups
     */
    public JsonObject getTuneups() {
        return tuneups;
    }

    /**
     * 
     * @param tuneups
     *     The tuneups
     */
    public void setTuneups(JsonObject tuneups) {
        this.tuneups = tuneups;
    }

    /**
     * 
     * @return
     *     The quartz
     */
    public JsonObject getQuartz() {
        return quartz;
    }

    /**
     * 
     * @param quartz
     *     The quartz
     */
    public void setQuartz(JsonObject quartz) {
        this.quartz = quartz;
    }

    /**
     * 
     * @return
     *     The device
     */
    public Device getDevice() {
        return device;
    }

    /**
     * 
     * @param device
     *     The device
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * 
     * @return
     *     The trip
     */
    public JsonObject getTrip() {
        return trip;
    }

    /**
     * 
     * @param trip
     *     The trip
     */
    public void setTrip(JsonObject trip) {
        this.trip = trip;
    }

    /**
     * 
     * @return
     *     The widgetTrack
     */
    public JsonObject getWidgetTrack() {
        return widgetTrack;
    }

    /**
     * 
     * @param widgetTrack
     *     The widget_track
     */
    public void setWidgetTrack(JsonObject widgetTrack) {
        this.widgetTrack = widgetTrack;
    }

    /**
     * 
     * @return
     *     The demandResponse
     */
    public JsonObject getDemandResponse() {
        return demandResponse;
    }

    /**
     * 
     * @param demandResponse
     *     The demand_response
     */
    public void setDemandResponse(JsonObject demandResponse) {
        this.demandResponse = demandResponse;
    }

    /**
     * 
     * @return
     *     The delayedTopaz
     */
    public JsonObject getDelayedTopaz() {
        return delayedTopaz;
    }

    /**
     * 
     * @param delayedTopaz
     *     The delayed_topaz
     */
    public void setDelayedTopaz(JsonObject delayedTopaz) {
        this.delayedTopaz = delayedTopaz;
    }

    /**
     * 
     * @return
     *     The user
     */
    public JsonObject getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(JsonObject user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The link
     */
    public JsonObject getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(JsonObject link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The deviceAlertDialog
     */
    public JsonObject getDeviceAlertDialog() {
        return deviceAlertDialog;
    }

    /**
     * 
     * @param deviceAlertDialog
     *     The device_alert_dialog
     */
    public void setDeviceAlertDialog(JsonObject deviceAlertDialog) {
        this.deviceAlertDialog = deviceAlertDialog;
    }

    /**
     * 
     * @return
     *     The geofenceInfo
     */
    public JsonObject getGeofenceInfo() {
        return geofenceInfo;
    }

    /**
     * 
     * @param geofenceInfo
     *     The geofence_info
     */
    public void setGeofenceInfo(JsonObject geofenceInfo) {
        this.geofenceInfo = geofenceInfo;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public JsonObject getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(JsonObject metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The userSettings
     */
    public JsonObject getUserSettings() {
        return userSettings;
    }

    /**
     * 
     * @param userSettings
     *     The user_settings
     */
    public void setUserSettings(JsonObject userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * 
     * @return
     *     The shared
     */
    public Shared getShared() {
        return shared;
    }

    /**
     * 
     * @param shared
     *     The shared
     */
    public void setShared(Shared shared) {
        this.shared = shared;
    }

    /**
     * 
     * @return
     *     The structureMetadata
     */
    public JsonObject getStructureMetadata() {
        return structureMetadata;
    }

    /**
     * 
     * @param structureMetadata
     *     The structure_metadata
     */
    public void setStructureMetadata(JsonObject structureMetadata) {
        this.structureMetadata = structureMetadata;
    }

    /**
     * 
     * @return
     *     The schedule
     */
    public JsonObject getSchedule() {
        return schedule;
    }

    /**
     * 
     * @param schedule
     *     The schedule
     */
    public void setSchedule(JsonObject schedule) {
        this.schedule = schedule;
    }

    /**
     * 
     * @return
     *     The safetySummary
     */
    public JsonObject getSafetySummary() {
        return safetySummary;
    }

    /**
     * 
     * @param safetySummary
     *     The safety_summary
     */
    public void setSafetySummary(JsonObject safetySummary) {
        this.safetySummary = safetySummary;
    }

}
