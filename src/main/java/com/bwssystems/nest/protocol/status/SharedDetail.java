
package com.bwssystems.nest.protocol.status;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SharedDetail {

    @SerializedName("$version")
    @Expose
    private Long $version;
    @SerializedName("$timestamp")
    @Expose
    private Long $timestamp;
    @SerializedName("auto_away")
    @Expose
    private Long autoAway;
    @SerializedName("auto_away_learning")
    @Expose
    private String autoAwayLearning;
    @SerializedName("can_cool")
    @Expose
    private Boolean canCool;
    @SerializedName("can_heat")
    @Expose
    private Boolean canHeat;
    @SerializedName("compressor_lockout_enabled")
    @Expose
    private Boolean compressorLockoutEnabled;
    @SerializedName("compressor_lockout_timeout")
    @Expose
    private Long compressorLockoutTimeout;
    @SerializedName("current_temperature")
    @Expose
    private Double currentTemperature;
    @SerializedName("hvac_ac_state")
    @Expose
    private Boolean hvacAcState;
    @SerializedName("hvac_alt_heat_state")
    @Expose
    private Boolean hvacAltHeatState;
    @SerializedName("hvac_alt_heat_x2_state")
    @Expose
    private Boolean hvacAltHeatX2State;
    @SerializedName("hvac_aux_heater_state")
    @Expose
    private Boolean hvacAuxHeaterState;
    @SerializedName("hvac_cool_x2_state")
    @Expose
    private Boolean hvacCoolX2State;
    @SerializedName("hvac_emer_heat_state")
    @Expose
    private Boolean hvacEmerHeatState;
    @SerializedName("hvac_fan_state")
    @Expose
    private Boolean hvacFanState;
    @SerializedName("hvac_heat_x2_state")
    @Expose
    private Boolean hvacHeatX2State;
    @SerializedName("hvac_heat_x3_state")
    @Expose
    private Boolean hvacHeatX3State;
    @SerializedName("hvac_heater_state")
    @Expose
    private Boolean hvacHeaterState;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("target_change_pending")
    @Expose
    private Boolean targetChangePending;
    @SerializedName("target_temperature")
    @Expose
    private Double targetTemperature;
    @SerializedName("target_temperature_high")
    @Expose
    private Long targetTemperatureHigh;
    @SerializedName("target_temperature_low")
    @Expose
    private Long targetTemperatureLow;
    @SerializedName("target_temperature_type")
    @Expose
    private String targetTemperatureType;

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
     *     The autoAway
     */
    public Long getAutoAway() {
        return autoAway;
    }

    /**
     * 
     * @param autoAway
     *     The auto_away
     */
    public void setAutoAway(Long autoAway) {
        this.autoAway = autoAway;
    }

    /**
     * 
     * @return
     *     The autoAwayLearning
     */
    public String getAutoAwayLearning() {
        return autoAwayLearning;
    }

    /**
     * 
     * @param autoAwayLearning
     *     The auto_away_learning
     */
    public void setAutoAwayLearning(String autoAwayLearning) {
        this.autoAwayLearning = autoAwayLearning;
    }

    /**
     * 
     * @return
     *     The canCool
     */
    public Boolean getCanCool() {
        return canCool;
    }

    /**
     * 
     * @param canCool
     *     The can_cool
     */
    public void setCanCool(Boolean canCool) {
        this.canCool = canCool;
    }

    /**
     * 
     * @return
     *     The canHeat
     */
    public Boolean getCanHeat() {
        return canHeat;
    }

    /**
     * 
     * @param canHeat
     *     The can_heat
     */
    public void setCanHeat(Boolean canHeat) {
        this.canHeat = canHeat;
    }

    /**
     * 
     * @return
     *     The compressorLockoutEnabled
     */
    public Boolean getCompressorLockoutEnabled() {
        return compressorLockoutEnabled;
    }

    /**
     * 
     * @param compressorLockoutEnabled
     *     The compressor_lockout_enabled
     */
    public void setCompressorLockoutEnabled(Boolean compressorLockoutEnabled) {
        this.compressorLockoutEnabled = compressorLockoutEnabled;
    }

    /**
     * 
     * @return
     *     The compressorLockoutTimeout
     */
    public Long getCompressorLockoutTimeout() {
        return compressorLockoutTimeout;
    }

    /**
     * 
     * @param compressorLockoutTimeout
     *     The compressor_lockout_timeout
     */
    public void setCompressorLockoutTimeout(Long compressorLockoutTimeout) {
        this.compressorLockoutTimeout = compressorLockoutTimeout;
    }

    /**
     * 
     * @return
     *     The currentTemperature
     */
    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * 
     * @param currentTemperature
     *     The current_temperature
     */
    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    /**
     * 
     * @return
     *     The hvacAcState
     */
    public Boolean getHvacAcState() {
        return hvacAcState;
    }

    /**
     * 
     * @param hvacAcState
     *     The hvac_ac_state
     */
    public void setHvacAcState(Boolean hvacAcState) {
        this.hvacAcState = hvacAcState;
    }

    /**
     * 
     * @return
     *     The hvacAltHeatState
     */
    public Boolean getHvacAltHeatState() {
        return hvacAltHeatState;
    }

    /**
     * 
     * @param hvacAltHeatState
     *     The hvac_alt_heat_state
     */
    public void setHvacAltHeatState(Boolean hvacAltHeatState) {
        this.hvacAltHeatState = hvacAltHeatState;
    }

    /**
     * 
     * @return
     *     The hvacAltHeatX2State
     */
    public Boolean getHvacAltHeatX2State() {
        return hvacAltHeatX2State;
    }

    /**
     * 
     * @param hvacAltHeatX2State
     *     The hvac_alt_heat_x2_state
     */
    public void setHvacAltHeatX2State(Boolean hvacAltHeatX2State) {
        this.hvacAltHeatX2State = hvacAltHeatX2State;
    }

    /**
     * 
     * @return
     *     The hvacAuxHeaterState
     */
    public Boolean getHvacAuxHeaterState() {
        return hvacAuxHeaterState;
    }

    /**
     * 
     * @param hvacAuxHeaterState
     *     The hvac_aux_heater_state
     */
    public void setHvacAuxHeaterState(Boolean hvacAuxHeaterState) {
        this.hvacAuxHeaterState = hvacAuxHeaterState;
    }

    /**
     * 
     * @return
     *     The hvacCoolX2State
     */
    public Boolean getHvacCoolX2State() {
        return hvacCoolX2State;
    }

    /**
     * 
     * @param hvacCoolX2State
     *     The hvac_cool_x2_state
     */
    public void setHvacCoolX2State(Boolean hvacCoolX2State) {
        this.hvacCoolX2State = hvacCoolX2State;
    }

    /**
     * 
     * @return
     *     The hvacEmerHeatState
     */
    public Boolean getHvacEmerHeatState() {
        return hvacEmerHeatState;
    }

    /**
     * 
     * @param hvacEmerHeatState
     *     The hvac_emer_heat_state
     */
    public void setHvacEmerHeatState(Boolean hvacEmerHeatState) {
        this.hvacEmerHeatState = hvacEmerHeatState;
    }

    /**
     * 
     * @return
     *     The hvacFanState
     */
    public Boolean getHvacFanState() {
        return hvacFanState;
    }

    /**
     * 
     * @param hvacFanState
     *     The hvac_fan_state
     */
    public void setHvacFanState(Boolean hvacFanState) {
        this.hvacFanState = hvacFanState;
    }

    /**
     * 
     * @return
     *     The hvacHeatX2State
     */
    public Boolean getHvacHeatX2State() {
        return hvacHeatX2State;
    }

    /**
     * 
     * @param hvacHeatX2State
     *     The hvac_heat_x2_state
     */
    public void setHvacHeatX2State(Boolean hvacHeatX2State) {
        this.hvacHeatX2State = hvacHeatX2State;
    }

    /**
     * 
     * @return
     *     The hvacHeatX3State
     */
    public Boolean getHvacHeatX3State() {
        return hvacHeatX3State;
    }

    /**
     * 
     * @param hvacHeatX3State
     *     The hvac_heat_x3_state
     */
    public void setHvacHeatX3State(Boolean hvacHeatX3State) {
        this.hvacHeatX3State = hvacHeatX3State;
    }

    /**
     * 
     * @return
     *     The hvacHeaterState
     */
    public Boolean getHvacHeaterState() {
        return hvacHeaterState;
    }

    /**
     * 
     * @param hvacHeaterState
     *     The hvac_heater_state
     */
    public void setHvacHeaterState(Boolean hvacHeaterState) {
        this.hvacHeaterState = hvacHeaterState;
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
     *     The targetChangePending
     */
    public Boolean getTargetChangePending() {
        return targetChangePending;
    }

    /**
     * 
     * @param targetChangePending
     *     The target_change_pending
     */
    public void setTargetChangePending(Boolean targetChangePending) {
        this.targetChangePending = targetChangePending;
    }

    /**
     * 
     * @return
     *     The targetTemperature
     */
    public Double getTargetTemperature() {
        return targetTemperature;
    }

    /**
     * 
     * @param targetTemperature
     *     The target_temperature
     */
    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    /**
     * 
     * @return
     *     The targetTemperatureHigh
     */
    public Long getTargetTemperatureHigh() {
        return targetTemperatureHigh;
    }

    /**
     * 
     * @param targetTemperatureHigh
     *     The target_temperature_high
     */
    public void setTargetTemperatureHigh(Long targetTemperatureHigh) {
        this.targetTemperatureHigh = targetTemperatureHigh;
    }

    /**
     * 
     * @return
     *     The targetTemperatureLow
     */
    public Long getTargetTemperatureLow() {
        return targetTemperatureLow;
    }

    /**
     * 
     * @param targetTemperatureLow
     *     The target_temperature_low
     */
    public void setTargetTemperatureLow(Long targetTemperatureLow) {
        this.targetTemperatureLow = targetTemperatureLow;
    }

    /**
     * 
     * @return
     *     The targetTemperatureType
     */
    public String getTargetTemperatureType() {
        return targetTemperatureType;
    }

    /**
     * 
     * @param targetTemperatureType
     *     The target_temperature_type
     */
    public void setTargetTemperatureType(String targetTemperatureType) {
        this.targetTemperatureType = targetTemperatureType;
    }

}
