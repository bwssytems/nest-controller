
package com.bwssystems.nest.protocol.status;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DeviceDetail {

    @SerializedName("$version")
    @Expose
    private Long $version;
    @SerializedName("$timestamp")
    @Expose
    private Long $timestamp;
    @SerializedName("alt_heat_delivery")
    @Expose
    private String altHeatDelivery;
    @SerializedName("alt_heat_source")
    @Expose
    private String altHeatSource;
    @SerializedName("alt_heat_x2_delivery")
    @Expose
    private String altHeatX2Delivery;
    @SerializedName("alt_heat_x2_source")
    @Expose
    private String altHeatX2Source;
    @SerializedName("auto_away_enable")
    @Expose
    private Boolean autoAwayEnable;
    @SerializedName("auto_away_reset")
    @Expose
    private Boolean autoAwayReset;
    @SerializedName("auto_dehum_enabled")
    @Expose
    private Boolean autoDehumEnabled;
    @SerializedName("auto_dehum_state")
    @Expose
    private Boolean autoDehumState;
    @SerializedName("aux_heat_delivery")
    @Expose
    private String auxHeatDelivery;
    @SerializedName("aux_heat_source")
    @Expose
    private String auxHeatSource;
    @SerializedName("aux_lockout_leaf")
    @Expose
    private Long auxLockoutLeaf;
    @SerializedName("available_locales")
    @Expose
    private String availableLocales;
    @SerializedName("away_temperature_high")
    @Expose
    private Double awayTemperatureHigh;
    @SerializedName("away_temperature_high_enabled")
    @Expose
    private Boolean awayTemperatureHighEnabled;
    @SerializedName("away_temperature_low")
    @Expose
    private Double awayTemperatureLow;
    @SerializedName("away_temperature_low_enabled")
    @Expose
    private Boolean awayTemperatureLowEnabled;
    @SerializedName("backplate_bsl_info")
    @Expose
    private String backplateBslInfo;
    @SerializedName("backplate_bsl_version")
    @Expose
    private String backplateBslVersion;
    @SerializedName("backplate_model")
    @Expose
    private String backplateModel;
    @SerializedName("backplate_mono_info")
    @Expose
    private String backplateMonoInfo;
    @SerializedName("backplate_mono_version")
    @Expose
    private String backplateMonoVersion;
    @SerializedName("backplate_serial_number")
    @Expose
    private String backplateSerialNumber;
    @SerializedName("battery_level")
    @Expose
    private Double batteryLevel;
    @SerializedName("capability_level")
    @Expose
    private Long capabilityLevel;
    @SerializedName("click_sound")
    @Expose
    private String clickSound;
    @SerializedName("compressor_lockout_leaf")
    @Expose
    private Double compressorLockoutLeaf;
    @SerializedName("cooling_delivery")
    @Expose
    private String coolingDelivery;
    @SerializedName("cooling_source")
    @Expose
    private String coolingSource;
    @SerializedName("cooling_x2_delivery")
    @Expose
    private String coolingX2Delivery;
    @SerializedName("cooling_x2_source")
    @Expose
    private String coolingX2Source;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("creation_time")
    @Expose
    private Long creationTime;
    @SerializedName("current_humidity")
    @Expose
    private Long currentHumidity;
    @SerializedName("current_schedule_mode")
    @Expose
    private String currentScheduleMode;
    @SerializedName("current_version")
    @Expose
    private String currentVersion;
    @SerializedName("dehumidifier_fan_activation")
    @Expose
    private Boolean dehumidifierFanActivation;
    @SerializedName("dehumidifier_orientation_selected")
    @Expose
    private String dehumidifierOrientationSelected;
    @SerializedName("dehumidifier_state")
    @Expose
    private Boolean dehumidifierState;
    @SerializedName("dehumidifier_type")
    @Expose
    private String dehumidifierType;
    @SerializedName("device_locale")
    @Expose
    private String deviceLocale;
    @SerializedName("dual_fuel_breakpoint")
    @Expose
    private Long dualFuelBreakpoint;
    @SerializedName("dual_fuel_breakpoint_override")
    @Expose
    private String dualFuelBreakpointOverride;
    @SerializedName("dual_fuel_selected")
    @Expose
    private Boolean dualFuelSelected;
    @SerializedName("emer_heat_delivery")
    @Expose
    private String emerHeatDelivery;
    @SerializedName("emer_heat_enable")
    @Expose
    private Boolean emerHeatEnable;
    @SerializedName("emer_heat_source")
    @Expose
    private String emerHeatSource;
    @SerializedName("equipment_type")
    @Expose
    private String equipmentType;
    @SerializedName("error_code")
    @Expose
    private String errorCode;
    @SerializedName("fan_control_state")
    @Expose
    private Boolean fanControlState;
    @SerializedName("fan_cooling_enabled")
    @Expose
    private Boolean fanCoolingEnabled;
    @SerializedName("fan_cooling_readiness")
    @Expose
    private String fanCoolingReadiness;
    @SerializedName("fan_cooling_state")
    @Expose
    private Boolean fanCoolingState;
    @SerializedName("fan_duty_cycle")
    @Expose
    private Long fanDutyCycle;
    @SerializedName("fan_duty_end_time")
    @Expose
    private Long fanDutyEndTime;
    @SerializedName("fan_duty_start_time")
    @Expose
    private Long fanDutyStartTime;
    @SerializedName("fan_mode")
    @Expose
    private String fanMode;
    @SerializedName("fan_timer_duration")
    @Expose
    private Long fanTimerDuration;
    @SerializedName("fan_timer_timeout")
    @Expose
    private Long fanTimerTimeout;
    @SerializedName("filter_changed_date")
    @Expose
    private Long filterChangedDate;
    @SerializedName("filter_changed_set_date")
    @Expose
    private Long filterChangedSetDate;
    @SerializedName("filter_reminder_enabled")
    @Expose
    private Boolean filterReminderEnabled;
    @SerializedName("filter_reminder_level")
    @Expose
    private Long filterReminderLevel;
    @SerializedName("forced_air")
    @Expose
    private Boolean forcedAir;
    @SerializedName("gear_opacity")
    @Expose
    private Long gearOpacity;
    @SerializedName("gear_threshold_high")
    @Expose
    private Long gearThresholdHigh;
    @SerializedName("gear_threshold_low")
    @Expose
    private Long gearThresholdLow;
    @SerializedName("has_air_filter")
    @Expose
    private Boolean hasAirFilter;
    @SerializedName("has_alt_heat")
    @Expose
    private Boolean hasAltHeat;
    @SerializedName("has_aux_heat")
    @Expose
    private Boolean hasAuxHeat;
    @SerializedName("has_dehumidifier")
    @Expose
    private Boolean hasDehumidifier;
    @SerializedName("has_dual_fuel")
    @Expose
    private Boolean hasDualFuel;
    @SerializedName("has_emer_heat")
    @Expose
    private Boolean hasEmerHeat;
    @SerializedName("has_fan")
    @Expose
    private Boolean hasFan;
    @SerializedName("has_fossil_fuel")
    @Expose
    private Boolean hasFossilFuel;
    @SerializedName("has_heat_pump")
    @Expose
    private Boolean hasHeatPump;
    @SerializedName("has_humidifier")
    @Expose
    private Boolean hasHumidifier;
    @SerializedName("has_x2_alt_heat")
    @Expose
    private Boolean hasX2AltHeat;
    @SerializedName("has_x2_cool")
    @Expose
    private Boolean hasX2Cool;
    @SerializedName("has_x2_heat")
    @Expose
    private Boolean hasX2Heat;
    @SerializedName("has_x3_heat")
    @Expose
    private Boolean hasX3Heat;
    @SerializedName("heat_link_connection")
    @Expose
    private Long heatLinkConnection;
    @SerializedName("heat_pump_aux_threshold")
    @Expose
    private Long heatPumpAuxThreshold;
    @SerializedName("heat_pump_aux_threshold_enabled")
    @Expose
    private Boolean heatPumpAuxThresholdEnabled;
    @SerializedName("heat_pump_comp_threshold")
    @Expose
    private Double heatPumpCompThreshold;
    @SerializedName("heat_pump_comp_threshold_enabled")
    @Expose
    private Boolean heatPumpCompThresholdEnabled;
    @SerializedName("heat_x2_delivery")
    @Expose
    private String heatX2Delivery;
    @SerializedName("heat_x2_source")
    @Expose
    private String heatX2Source;
    @SerializedName("heat_x3_delivery")
    @Expose
    private String heatX3Delivery;
    @SerializedName("heat_x3_source")
    @Expose
    private String heatX3Source;
    @SerializedName("heater_delivery")
    @Expose
    private String heaterDelivery;
    @SerializedName("heater_source")
    @Expose
    private String heaterSource;
    @SerializedName("heatpump_ready")
    @Expose
    private Boolean heatpumpReady;
    @SerializedName("heatpump_savings")
    @Expose
    private String heatpumpSavings;
    @SerializedName("heatpump_setback_active")
    @Expose
    private Boolean heatpumpSetbackActive;
    @SerializedName("humidifier_fan_activation")
    @Expose
    private Boolean humidifierFanActivation;
    @SerializedName("humidifier_state")
    @Expose
    private Boolean humidifierState;
    @SerializedName("humidifier_type")
    @Expose
    private String humidifierType;
    @SerializedName("humidity_control_lockout_enabled")
    @Expose
    private Boolean humidityControlLockoutEnabled;
    @SerializedName("humidity_control_lockout_end_time")
    @Expose
    private Long humidityControlLockoutEndTime;
    @SerializedName("humidity_control_lockout_start_time")
    @Expose
    private Long humidityControlLockoutStartTime;
    @SerializedName("hvac_pins")
    @Expose
    private String hvacPins;
    @SerializedName("hvac_safety_shutoff_active")
    @Expose
    private Boolean hvacSafetyShutoffActive;
    @SerializedName("hvac_wires")
    @Expose
    private String hvacWires;
    @SerializedName("is_on_stand")
    @Expose
    private Boolean isOnStand;
    @SerializedName("leaf")
    @Expose
    private Boolean leaf;
    @SerializedName("leaf_away_high")
    @Expose
    private Double leafAwayHigh;
    @SerializedName("leaf_away_low")
    @Expose
    private Double leafAwayLow;
    @SerializedName("leaf_learning")
    @Expose
    private String leafLearning;
    @SerializedName("leaf_schedule_delta")
    @Expose
    private Double leafScheduleDelta;
    @SerializedName("leaf_threshold_cool")
    @Expose
    private Long leafThresholdCool;
    @SerializedName("leaf_threshold_heat")
    @Expose
    private Double leafThresholdHeat;
    @SerializedName("leaf_type")
    @Expose
    private Long leafType;
    @SerializedName("learning_days_completed_cool")
    @Expose
    private Long learningDaysCompletedCool;
    @SerializedName("learning_days_completed_heat")
    @Expose
    private Long learningDaysCompletedHeat;
    @SerializedName("learning_days_completed_range")
    @Expose
    private Long learningDaysCompletedRange;
    @SerializedName("learning_mode")
    @Expose
    private Boolean learningMode;
    @SerializedName("learning_state")
    @Expose
    private String learningState;
    @SerializedName("learning_time")
    @Expose
    private Long learningTime;
    @SerializedName("local_ip")
    @Expose
    private String localIp;
    @SerializedName("logging_priority")
    @Expose
    private String loggingPriority;
    @SerializedName("lower_safety_temp")
    @Expose
    private Double lowerSafetyTemp;
    @SerializedName("lower_safety_temp_enabled")
    @Expose
    private Boolean lowerSafetyTempEnabled;
    @SerializedName("mac_address")
    @Expose
    private String macAddress;
    @SerializedName("maint_band_lower")
    @Expose
    private Double maintBandLower;
    @SerializedName("maint_band_upper")
    @Expose
    private Double maintBandUpper;
    @SerializedName("model_version")
    @Expose
    private String modelVersion;
    @SerializedName("nlclient_state")
    @Expose
    private String nlclientState;
    @SerializedName("note_codes")
    @Expose
    private List<JsonObject> noteCodes = new ArrayList<JsonObject>();
    @SerializedName("ob_orientation")
    @Expose
    private String obOrientation;
    @SerializedName("ob_persistence")
    @Expose
    private Boolean obPersistence;
    @SerializedName("pin_c_description")
    @Expose
    private String pinCDescription;
    @SerializedName("pin_g_description")
    @Expose
    private String pinGDescription;
    @SerializedName("pin_ob_description")
    @Expose
    private String pinObDescription;
    @SerializedName("pin_rc_description")
    @Expose
    private String pinRcDescription;
    @SerializedName("pin_rh_description")
    @Expose
    private String pinRhDescription;
    @SerializedName("pin_star_description")
    @Expose
    private String pinStarDescription;
    @SerializedName("pin_w1_description")
    @Expose
    private String pinW1Description;
    @SerializedName("pin_w2aux_description")
    @Expose
    private String pinW2auxDescription;
    @SerializedName("pin_y1_description")
    @Expose
    private String pinY1Description;
    @SerializedName("pin_y2_description")
    @Expose
    private String pinY2Description;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("preconditioning_active")
    @Expose
    private Boolean preconditioningActive;
    @SerializedName("preconditioning_enabled")
    @Expose
    private Boolean preconditioningEnabled;
    @SerializedName("preconditioning_ready")
    @Expose
    private Boolean preconditioningReady;
    @SerializedName("radiant_control_enabled")
    @Expose
    private Boolean radiantControlEnabled;
    @SerializedName("range_enable")
    @Expose
    private Boolean rangeEnable;
    @SerializedName("rssi")
    @Expose
    private Long rssi;
    @SerializedName("safety_temp_activating_hvac")
    @Expose
    private Boolean safetyTempActivatingHvac;
    @SerializedName("schedule_learning_reset")
    @Expose
    private Boolean scheduleLearningReset;
    @SerializedName("serial_number")
    @Expose
    private String serialNumber;
    @SerializedName("star_type")
    @Expose
    private String starType;
    @SerializedName("sunlight_correction_active")
    @Expose
    private Boolean sunlightCorrectionActive;
    @SerializedName("sunlight_correction_enabled")
    @Expose
    private Boolean sunlightCorrectionEnabled;
    @SerializedName("sunlight_correction_ready")
    @Expose
    private Boolean sunlightCorrectionReady;
    @SerializedName("switch_system_off")
    @Expose
    private Boolean switchSystemOff;
    @SerializedName("target_humidity")
    @Expose
    private Long targetHumidity;
    @SerializedName("target_humidity_enabled")
    @Expose
    private Boolean targetHumidityEnabled;
    @SerializedName("target_time_confidence")
    @Expose
    private Long targetTimeConfidence;
    @SerializedName("temperature_lock")
    @Expose
    private Boolean temperatureLock;
    @SerializedName("temperature_lock_high_temp")
    @Expose
    private Double temperatureLockHighTemp;
    @SerializedName("temperature_lock_low_temp")
    @Expose
    private Long temperatureLockLowTemp;
    @SerializedName("temperature_lock_pin_hash")
    @Expose
    private String temperatureLockPinHash;
    @SerializedName("temperature_scale")
    @Expose
    private String temperatureScale;
    @SerializedName("time_to_target")
    @Expose
    private Long timeToTarget;
    @SerializedName("time_to_target_training")
    @Expose
    private String timeToTargetTraining;
    @SerializedName("touched_by")
    @Expose
    private JsonObject touchedBy;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("upper_safety_temp")
    @Expose
    private Long upperSafetyTemp;
    @SerializedName("upper_safety_temp_enabled")
    @Expose
    private Boolean upperSafetyTempEnabled;
    @SerializedName("user_brightness")
    @Expose
    private String userBrightness;
    @SerializedName("where_id")
    @Expose
    private String whereId;
    @SerializedName("y2_type")
    @Expose
    private String y2Type;
    @SerializedName("schedules")
    @Expose
    private List<JsonObject> schedules = new ArrayList<JsonObject>();

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
     *     The altHeatDelivery
     */
    public String getAltHeatDelivery() {
        return altHeatDelivery;
    }

    /**
     * 
     * @param altHeatDelivery
     *     The alt_heat_delivery
     */
    public void setAltHeatDelivery(String altHeatDelivery) {
        this.altHeatDelivery = altHeatDelivery;
    }

    /**
     * 
     * @return
     *     The altHeatSource
     */
    public String getAltHeatSource() {
        return altHeatSource;
    }

    /**
     * 
     * @param altHeatSource
     *     The alt_heat_source
     */
    public void setAltHeatSource(String altHeatSource) {
        this.altHeatSource = altHeatSource;
    }

    /**
     * 
     * @return
     *     The altHeatX2Delivery
     */
    public String getAltHeatX2Delivery() {
        return altHeatX2Delivery;
    }

    /**
     * 
     * @param altHeatX2Delivery
     *     The alt_heat_x2_delivery
     */
    public void setAltHeatX2Delivery(String altHeatX2Delivery) {
        this.altHeatX2Delivery = altHeatX2Delivery;
    }

    /**
     * 
     * @return
     *     The altHeatX2Source
     */
    public String getAltHeatX2Source() {
        return altHeatX2Source;
    }

    /**
     * 
     * @param altHeatX2Source
     *     The alt_heat_x2_source
     */
    public void setAltHeatX2Source(String altHeatX2Source) {
        this.altHeatX2Source = altHeatX2Source;
    }

    /**
     * 
     * @return
     *     The autoAwayEnable
     */
    public Boolean getAutoAwayEnable() {
        return autoAwayEnable;
    }

    /**
     * 
     * @param autoAwayEnable
     *     The auto_away_enable
     */
    public void setAutoAwayEnable(Boolean autoAwayEnable) {
        this.autoAwayEnable = autoAwayEnable;
    }

    /**
     * 
     * @return
     *     The autoAwayReset
     */
    public Boolean getAutoAwayReset() {
        return autoAwayReset;
    }

    /**
     * 
     * @param autoAwayReset
     *     The auto_away_reset
     */
    public void setAutoAwayReset(Boolean autoAwayReset) {
        this.autoAwayReset = autoAwayReset;
    }

    /**
     * 
     * @return
     *     The autoDehumEnabled
     */
    public Boolean getAutoDehumEnabled() {
        return autoDehumEnabled;
    }

    /**
     * 
     * @param autoDehumEnabled
     *     The auto_dehum_enabled
     */
    public void setAutoDehumEnabled(Boolean autoDehumEnabled) {
        this.autoDehumEnabled = autoDehumEnabled;
    }

    /**
     * 
     * @return
     *     The autoDehumState
     */
    public Boolean getAutoDehumState() {
        return autoDehumState;
    }

    /**
     * 
     * @param autoDehumState
     *     The auto_dehum_state
     */
    public void setAutoDehumState(Boolean autoDehumState) {
        this.autoDehumState = autoDehumState;
    }

    /**
     * 
     * @return
     *     The auxHeatDelivery
     */
    public String getAuxHeatDelivery() {
        return auxHeatDelivery;
    }

    /**
     * 
     * @param auxHeatDelivery
     *     The aux_heat_delivery
     */
    public void setAuxHeatDelivery(String auxHeatDelivery) {
        this.auxHeatDelivery = auxHeatDelivery;
    }

    /**
     * 
     * @return
     *     The auxHeatSource
     */
    public String getAuxHeatSource() {
        return auxHeatSource;
    }

    /**
     * 
     * @param auxHeatSource
     *     The aux_heat_source
     */
    public void setAuxHeatSource(String auxHeatSource) {
        this.auxHeatSource = auxHeatSource;
    }

    /**
     * 
     * @return
     *     The auxLockoutLeaf
     */
    public Long getAuxLockoutLeaf() {
        return auxLockoutLeaf;
    }

    /**
     * 
     * @param auxLockoutLeaf
     *     The aux_lockout_leaf
     */
    public void setAuxLockoutLeaf(Long auxLockoutLeaf) {
        this.auxLockoutLeaf = auxLockoutLeaf;
    }

    /**
     * 
     * @return
     *     The availableLocales
     */
    public String getAvailableLocales() {
        return availableLocales;
    }

    /**
     * 
     * @param availableLocales
     *     The available_locales
     */
    public void setAvailableLocales(String availableLocales) {
        this.availableLocales = availableLocales;
    }

    /**
     * 
     * @return
     *     The awayTemperatureHigh
     */
    public Double getAwayTemperatureHigh() {
        return awayTemperatureHigh;
    }

    /**
     * 
     * @param awayTemperatureHigh
     *     The away_temperature_high
     */
    public void setAwayTemperatureHigh(Double awayTemperatureHigh) {
        this.awayTemperatureHigh = awayTemperatureHigh;
    }

    /**
     * 
     * @return
     *     The awayTemperatureHighEnabled
     */
    public Boolean getAwayTemperatureHighEnabled() {
        return awayTemperatureHighEnabled;
    }

    /**
     * 
     * @param awayTemperatureHighEnabled
     *     The away_temperature_high_enabled
     */
    public void setAwayTemperatureHighEnabled(Boolean awayTemperatureHighEnabled) {
        this.awayTemperatureHighEnabled = awayTemperatureHighEnabled;
    }

    /**
     * 
     * @return
     *     The awayTemperatureLow
     */
    public Double getAwayTemperatureLow() {
        return awayTemperatureLow;
    }

    /**
     * 
     * @param awayTemperatureLow
     *     The away_temperature_low
     */
    public void setAwayTemperatureLow(Double awayTemperatureLow) {
        this.awayTemperatureLow = awayTemperatureLow;
    }

    /**
     * 
     * @return
     *     The awayTemperatureLowEnabled
     */
    public Boolean getAwayTemperatureLowEnabled() {
        return awayTemperatureLowEnabled;
    }

    /**
     * 
     * @param awayTemperatureLowEnabled
     *     The away_temperature_low_enabled
     */
    public void setAwayTemperatureLowEnabled(Boolean awayTemperatureLowEnabled) {
        this.awayTemperatureLowEnabled = awayTemperatureLowEnabled;
    }

    /**
     * 
     * @return
     *     The backplateBslInfo
     */
    public String getBackplateBslInfo() {
        return backplateBslInfo;
    }

    /**
     * 
     * @param backplateBslInfo
     *     The backplate_bsl_info
     */
    public void setBackplateBslInfo(String backplateBslInfo) {
        this.backplateBslInfo = backplateBslInfo;
    }

    /**
     * 
     * @return
     *     The backplateBslVersion
     */
    public String getBackplateBslVersion() {
        return backplateBslVersion;
    }

    /**
     * 
     * @param backplateBslVersion
     *     The backplate_bsl_version
     */
    public void setBackplateBslVersion(String backplateBslVersion) {
        this.backplateBslVersion = backplateBslVersion;
    }

    /**
     * 
     * @return
     *     The backplateModel
     */
    public String getBackplateModel() {
        return backplateModel;
    }

    /**
     * 
     * @param backplateModel
     *     The backplate_model
     */
    public void setBackplateModel(String backplateModel) {
        this.backplateModel = backplateModel;
    }

    /**
     * 
     * @return
     *     The backplateMonoInfo
     */
    public String getBackplateMonoInfo() {
        return backplateMonoInfo;
    }

    /**
     * 
     * @param backplateMonoInfo
     *     The backplate_mono_info
     */
    public void setBackplateMonoInfo(String backplateMonoInfo) {
        this.backplateMonoInfo = backplateMonoInfo;
    }

    /**
     * 
     * @return
     *     The backplateMonoVersion
     */
    public String getBackplateMonoVersion() {
        return backplateMonoVersion;
    }

    /**
     * 
     * @param backplateMonoVersion
     *     The backplate_mono_version
     */
    public void setBackplateMonoVersion(String backplateMonoVersion) {
        this.backplateMonoVersion = backplateMonoVersion;
    }

    /**
     * 
     * @return
     *     The backplateSerialNumber
     */
    public String getBackplateSerialNumber() {
        return backplateSerialNumber;
    }

    /**
     * 
     * @param backplateSerialNumber
     *     The backplate_serial_number
     */
    public void setBackplateSerialNumber(String backplateSerialNumber) {
        this.backplateSerialNumber = backplateSerialNumber;
    }

    /**
     * 
     * @return
     *     The batteryLevel
     */
    public Double getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * 
     * @param batteryLevel
     *     The battery_level
     */
    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * 
     * @return
     *     The capabilityLevel
     */
    public Long getCapabilityLevel() {
        return capabilityLevel;
    }

    /**
     * 
     * @param capabilityLevel
     *     The capability_level
     */
    public void setCapabilityLevel(Long capabilityLevel) {
        this.capabilityLevel = capabilityLevel;
    }

    /**
     * 
     * @return
     *     The clickSound
     */
    public String getClickSound() {
        return clickSound;
    }

    /**
     * 
     * @param clickSound
     *     The click_sound
     */
    public void setClickSound(String clickSound) {
        this.clickSound = clickSound;
    }

    /**
     * 
     * @return
     *     The compressorLockoutLeaf
     */
    public Double getCompressorLockoutLeaf() {
        return compressorLockoutLeaf;
    }

    /**
     * 
     * @param compressorLockoutLeaf
     *     The compressor_lockout_leaf
     */
    public void setCompressorLockoutLeaf(Double compressorLockoutLeaf) {
        this.compressorLockoutLeaf = compressorLockoutLeaf;
    }

    /**
     * 
     * @return
     *     The coolingDelivery
     */
    public String getCoolingDelivery() {
        return coolingDelivery;
    }

    /**
     * 
     * @param coolingDelivery
     *     The cooling_delivery
     */
    public void setCoolingDelivery(String coolingDelivery) {
        this.coolingDelivery = coolingDelivery;
    }

    /**
     * 
     * @return
     *     The coolingSource
     */
    public String getCoolingSource() {
        return coolingSource;
    }

    /**
     * 
     * @param coolingSource
     *     The cooling_source
     */
    public void setCoolingSource(String coolingSource) {
        this.coolingSource = coolingSource;
    }

    /**
     * 
     * @return
     *     The coolingX2Delivery
     */
    public String getCoolingX2Delivery() {
        return coolingX2Delivery;
    }

    /**
     * 
     * @param coolingX2Delivery
     *     The cooling_x2_delivery
     */
    public void setCoolingX2Delivery(String coolingX2Delivery) {
        this.coolingX2Delivery = coolingX2Delivery;
    }

    /**
     * 
     * @return
     *     The coolingX2Source
     */
    public String getCoolingX2Source() {
        return coolingX2Source;
    }

    /**
     * 
     * @param coolingX2Source
     *     The cooling_x2_source
     */
    public void setCoolingX2Source(String coolingX2Source) {
        this.coolingX2Source = coolingX2Source;
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
     *     The currentHumidity
     */
    public Long getCurrentHumidity() {
        return currentHumidity;
    }

    /**
     * 
     * @param currentHumidity
     *     The current_humidity
     */
    public void setCurrentHumidity(Long currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    /**
     * 
     * @return
     *     The currentScheduleMode
     */
    public String getCurrentScheduleMode() {
        return currentScheduleMode;
    }

    /**
     * 
     * @param currentScheduleMode
     *     The current_schedule_mode
     */
    public void setCurrentScheduleMode(String currentScheduleMode) {
        this.currentScheduleMode = currentScheduleMode;
    }

    /**
     * 
     * @return
     *     The currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * 
     * @param currentVersion
     *     The current_version
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * 
     * @return
     *     The dehumidifierFanActivation
     */
    public Boolean getDehumidifierFanActivation() {
        return dehumidifierFanActivation;
    }

    /**
     * 
     * @param dehumidifierFanActivation
     *     The dehumidifier_fan_activation
     */
    public void setDehumidifierFanActivation(Boolean dehumidifierFanActivation) {
        this.dehumidifierFanActivation = dehumidifierFanActivation;
    }

    /**
     * 
     * @return
     *     The dehumidifierOrientationSelected
     */
    public String getDehumidifierOrientationSelected() {
        return dehumidifierOrientationSelected;
    }

    /**
     * 
     * @param dehumidifierOrientationSelected
     *     The dehumidifier_orientation_selected
     */
    public void setDehumidifierOrientationSelected(String dehumidifierOrientationSelected) {
        this.dehumidifierOrientationSelected = dehumidifierOrientationSelected;
    }

    /**
     * 
     * @return
     *     The dehumidifierState
     */
    public Boolean getDehumidifierState() {
        return dehumidifierState;
    }

    /**
     * 
     * @param dehumidifierState
     *     The dehumidifier_state
     */
    public void setDehumidifierState(Boolean dehumidifierState) {
        this.dehumidifierState = dehumidifierState;
    }

    /**
     * 
     * @return
     *     The dehumidifierType
     */
    public String getDehumidifierType() {
        return dehumidifierType;
    }

    /**
     * 
     * @param dehumidifierType
     *     The dehumidifier_type
     */
    public void setDehumidifierType(String dehumidifierType) {
        this.dehumidifierType = dehumidifierType;
    }

    /**
     * 
     * @return
     *     The deviceLocale
     */
    public String getDeviceLocale() {
        return deviceLocale;
    }

    /**
     * 
     * @param deviceLocale
     *     The device_locale
     */
    public void setDeviceLocale(String deviceLocale) {
        this.deviceLocale = deviceLocale;
    }

    /**
     * 
     * @return
     *     The dualFuelBreakpoint
     */
    public Long getDualFuelBreakpoint() {
        return dualFuelBreakpoint;
    }

    /**
     * 
     * @param dualFuelBreakpoint
     *     The dual_fuel_breakpoint
     */
    public void setDualFuelBreakpoint(Long dualFuelBreakpoint) {
        this.dualFuelBreakpoint = dualFuelBreakpoint;
    }

    /**
     * 
     * @return
     *     The dualFuelBreakpointOverride
     */
    public String getDualFuelBreakpointOverride() {
        return dualFuelBreakpointOverride;
    }

    /**
     * 
     * @param dualFuelBreakpointOverride
     *     The dual_fuel_breakpoint_override
     */
    public void setDualFuelBreakpointOverride(String dualFuelBreakpointOverride) {
        this.dualFuelBreakpointOverride = dualFuelBreakpointOverride;
    }

    /**
     * 
     * @return
     *     The dualFuelSelected
     */
    public Boolean getDualFuelSelected() {
        return dualFuelSelected;
    }

    /**
     * 
     * @param dualFuelSelected
     *     The dual_fuel_selected
     */
    public void setDualFuelSelected(Boolean dualFuelSelected) {
        this.dualFuelSelected = dualFuelSelected;
    }

    /**
     * 
     * @return
     *     The emerHeatDelivery
     */
    public String getEmerHeatDelivery() {
        return emerHeatDelivery;
    }

    /**
     * 
     * @param emerHeatDelivery
     *     The emer_heat_delivery
     */
    public void setEmerHeatDelivery(String emerHeatDelivery) {
        this.emerHeatDelivery = emerHeatDelivery;
    }

    /**
     * 
     * @return
     *     The emerHeatEnable
     */
    public Boolean getEmerHeatEnable() {
        return emerHeatEnable;
    }

    /**
     * 
     * @param emerHeatEnable
     *     The emer_heat_enable
     */
    public void setEmerHeatEnable(Boolean emerHeatEnable) {
        this.emerHeatEnable = emerHeatEnable;
    }

    /**
     * 
     * @return
     *     The emerHeatSource
     */
    public String getEmerHeatSource() {
        return emerHeatSource;
    }

    /**
     * 
     * @param emerHeatSource
     *     The emer_heat_source
     */
    public void setEmerHeatSource(String emerHeatSource) {
        this.emerHeatSource = emerHeatSource;
    }

    /**
     * 
     * @return
     *     The equipmentType
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * 
     * @param equipmentType
     *     The equipment_type
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 
     * @return
     *     The errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The error_code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The fanControlState
     */
    public Boolean getFanControlState() {
        return fanControlState;
    }

    /**
     * 
     * @param fanControlState
     *     The fan_control_state
     */
    public void setFanControlState(Boolean fanControlState) {
        this.fanControlState = fanControlState;
    }

    /**
     * 
     * @return
     *     The fanCoolingEnabled
     */
    public Boolean getFanCoolingEnabled() {
        return fanCoolingEnabled;
    }

    /**
     * 
     * @param fanCoolingEnabled
     *     The fan_cooling_enabled
     */
    public void setFanCoolingEnabled(Boolean fanCoolingEnabled) {
        this.fanCoolingEnabled = fanCoolingEnabled;
    }

    /**
     * 
     * @return
     *     The fanCoolingReadiness
     */
    public String getFanCoolingReadiness() {
        return fanCoolingReadiness;
    }

    /**
     * 
     * @param fanCoolingReadiness
     *     The fan_cooling_readiness
     */
    public void setFanCoolingReadiness(String fanCoolingReadiness) {
        this.fanCoolingReadiness = fanCoolingReadiness;
    }

    /**
     * 
     * @return
     *     The fanCoolingState
     */
    public Boolean getFanCoolingState() {
        return fanCoolingState;
    }

    /**
     * 
     * @param fanCoolingState
     *     The fan_cooling_state
     */
    public void setFanCoolingState(Boolean fanCoolingState) {
        this.fanCoolingState = fanCoolingState;
    }

    /**
     * 
     * @return
     *     The fanDutyCycle
     */
    public Long getFanDutyCycle() {
        return fanDutyCycle;
    }

    /**
     * 
     * @param fanDutyCycle
     *     The fan_duty_cycle
     */
    public void setFanDutyCycle(Long fanDutyCycle) {
        this.fanDutyCycle = fanDutyCycle;
    }

    /**
     * 
     * @return
     *     The fanDutyEndTime
     */
    public Long getFanDutyEndTime() {
        return fanDutyEndTime;
    }

    /**
     * 
     * @param fanDutyEndTime
     *     The fan_duty_end_time
     */
    public void setFanDutyEndTime(Long fanDutyEndTime) {
        this.fanDutyEndTime = fanDutyEndTime;
    }

    /**
     * 
     * @return
     *     The fanDutyStartTime
     */
    public Long getFanDutyStartTime() {
        return fanDutyStartTime;
    }

    /**
     * 
     * @param fanDutyStartTime
     *     The fan_duty_start_time
     */
    public void setFanDutyStartTime(Long fanDutyStartTime) {
        this.fanDutyStartTime = fanDutyStartTime;
    }

    /**
     * 
     * @return
     *     The fanMode
     */
    public String getFanMode() {
        return fanMode;
    }

    /**
     * 
     * @param fanMode
     *     The fan_mode
     */
    public void setFanMode(String fanMode) {
        this.fanMode = fanMode;
    }

    /**
     * 
     * @return
     *     The fanTimerDuration
     */
    public Long getFanTimerDuration() {
        return fanTimerDuration;
    }

    /**
     * 
     * @param fanTimerDuration
     *     The fan_timer_duration
     */
    public void setFanTimerDuration(Long fanTimerDuration) {
        this.fanTimerDuration = fanTimerDuration;
    }

    /**
     * 
     * @return
     *     The fanTimerTimeout
     */
    public Long getFanTimerTimeout() {
        return fanTimerTimeout;
    }

    /**
     * 
     * @param fanTimerTimeout
     *     The fan_timer_timeout
     */
    public void setFanTimerTimeout(Long fanTimerTimeout) {
        this.fanTimerTimeout = fanTimerTimeout;
    }

    /**
     * 
     * @return
     *     The filterChangedDate
     */
    public Long getFilterChangedDate() {
        return filterChangedDate;
    }

    /**
     * 
     * @param filterChangedDate
     *     The filter_changed_date
     */
    public void setFilterChangedDate(Long filterChangedDate) {
        this.filterChangedDate = filterChangedDate;
    }

    /**
     * 
     * @return
     *     The filterChangedSetDate
     */
    public Long getFilterChangedSetDate() {
        return filterChangedSetDate;
    }

    /**
     * 
     * @param filterChangedSetDate
     *     The filter_changed_set_date
     */
    public void setFilterChangedSetDate(Long filterChangedSetDate) {
        this.filterChangedSetDate = filterChangedSetDate;
    }

    /**
     * 
     * @return
     *     The filterReminderEnabled
     */
    public Boolean getFilterReminderEnabled() {
        return filterReminderEnabled;
    }

    /**
     * 
     * @param filterReminderEnabled
     *     The filter_reminder_enabled
     */
    public void setFilterReminderEnabled(Boolean filterReminderEnabled) {
        this.filterReminderEnabled = filterReminderEnabled;
    }

    /**
     * 
     * @return
     *     The filterReminderLevel
     */
    public Long getFilterReminderLevel() {
        return filterReminderLevel;
    }

    /**
     * 
     * @param filterReminderLevel
     *     The filter_reminder_level
     */
    public void setFilterReminderLevel(Long filterReminderLevel) {
        this.filterReminderLevel = filterReminderLevel;
    }

    /**
     * 
     * @return
     *     The forcedAir
     */
    public Boolean getForcedAir() {
        return forcedAir;
    }

    /**
     * 
     * @param forcedAir
     *     The forced_air
     */
    public void setForcedAir(Boolean forcedAir) {
        this.forcedAir = forcedAir;
    }

    /**
     * 
     * @return
     *     The gearOpacity
     */
    public Long getGearOpacity() {
        return gearOpacity;
    }

    /**
     * 
     * @param gearOpacity
     *     The gear_opacity
     */
    public void setGearOpacity(Long gearOpacity) {
        this.gearOpacity = gearOpacity;
    }

    /**
     * 
     * @return
     *     The gearThresholdHigh
     */
    public Long getGearThresholdHigh() {
        return gearThresholdHigh;
    }

    /**
     * 
     * @param gearThresholdHigh
     *     The gear_threshold_high
     */
    public void setGearThresholdHigh(Long gearThresholdHigh) {
        this.gearThresholdHigh = gearThresholdHigh;
    }

    /**
     * 
     * @return
     *     The gearThresholdLow
     */
    public Long getGearThresholdLow() {
        return gearThresholdLow;
    }

    /**
     * 
     * @param gearThresholdLow
     *     The gear_threshold_low
     */
    public void setGearThresholdLow(Long gearThresholdLow) {
        this.gearThresholdLow = gearThresholdLow;
    }

    /**
     * 
     * @return
     *     The hasAirFilter
     */
    public Boolean getHasAirFilter() {
        return hasAirFilter;
    }

    /**
     * 
     * @param hasAirFilter
     *     The has_air_filter
     */
    public void setHasAirFilter(Boolean hasAirFilter) {
        this.hasAirFilter = hasAirFilter;
    }

    /**
     * 
     * @return
     *     The hasAltHeat
     */
    public Boolean getHasAltHeat() {
        return hasAltHeat;
    }

    /**
     * 
     * @param hasAltHeat
     *     The has_alt_heat
     */
    public void setHasAltHeat(Boolean hasAltHeat) {
        this.hasAltHeat = hasAltHeat;
    }

    /**
     * 
     * @return
     *     The hasAuxHeat
     */
    public Boolean getHasAuxHeat() {
        return hasAuxHeat;
    }

    /**
     * 
     * @param hasAuxHeat
     *     The has_aux_heat
     */
    public void setHasAuxHeat(Boolean hasAuxHeat) {
        this.hasAuxHeat = hasAuxHeat;
    }

    /**
     * 
     * @return
     *     The hasDehumidifier
     */
    public Boolean getHasDehumidifier() {
        return hasDehumidifier;
    }

    /**
     * 
     * @param hasDehumidifier
     *     The has_dehumidifier
     */
    public void setHasDehumidifier(Boolean hasDehumidifier) {
        this.hasDehumidifier = hasDehumidifier;
    }

    /**
     * 
     * @return
     *     The hasDualFuel
     */
    public Boolean getHasDualFuel() {
        return hasDualFuel;
    }

    /**
     * 
     * @param hasDualFuel
     *     The has_dual_fuel
     */
    public void setHasDualFuel(Boolean hasDualFuel) {
        this.hasDualFuel = hasDualFuel;
    }

    /**
     * 
     * @return
     *     The hasEmerHeat
     */
    public Boolean getHasEmerHeat() {
        return hasEmerHeat;
    }

    /**
     * 
     * @param hasEmerHeat
     *     The has_emer_heat
     */
    public void setHasEmerHeat(Boolean hasEmerHeat) {
        this.hasEmerHeat = hasEmerHeat;
    }

    /**
     * 
     * @return
     *     The hasFan
     */
    public Boolean getHasFan() {
        return hasFan;
    }

    /**
     * 
     * @param hasFan
     *     The has_fan
     */
    public void setHasFan(Boolean hasFan) {
        this.hasFan = hasFan;
    }

    /**
     * 
     * @return
     *     The hasFossilFuel
     */
    public Boolean getHasFossilFuel() {
        return hasFossilFuel;
    }

    /**
     * 
     * @param hasFossilFuel
     *     The has_fossil_fuel
     */
    public void setHasFossilFuel(Boolean hasFossilFuel) {
        this.hasFossilFuel = hasFossilFuel;
    }

    /**
     * 
     * @return
     *     The hasHeatPump
     */
    public Boolean getHasHeatPump() {
        return hasHeatPump;
    }

    /**
     * 
     * @param hasHeatPump
     *     The has_heat_pump
     */
    public void setHasHeatPump(Boolean hasHeatPump) {
        this.hasHeatPump = hasHeatPump;
    }

    /**
     * 
     * @return
     *     The hasHumidifier
     */
    public Boolean getHasHumidifier() {
        return hasHumidifier;
    }

    /**
     * 
     * @param hasHumidifier
     *     The has_humidifier
     */
    public void setHasHumidifier(Boolean hasHumidifier) {
        this.hasHumidifier = hasHumidifier;
    }

    /**
     * 
     * @return
     *     The hasX2AltHeat
     */
    public Boolean getHasX2AltHeat() {
        return hasX2AltHeat;
    }

    /**
     * 
     * @param hasX2AltHeat
     *     The has_x2_alt_heat
     */
    public void setHasX2AltHeat(Boolean hasX2AltHeat) {
        this.hasX2AltHeat = hasX2AltHeat;
    }

    /**
     * 
     * @return
     *     The hasX2Cool
     */
    public Boolean getHasX2Cool() {
        return hasX2Cool;
    }

    /**
     * 
     * @param hasX2Cool
     *     The has_x2_cool
     */
    public void setHasX2Cool(Boolean hasX2Cool) {
        this.hasX2Cool = hasX2Cool;
    }

    /**
     * 
     * @return
     *     The hasX2Heat
     */
    public Boolean getHasX2Heat() {
        return hasX2Heat;
    }

    /**
     * 
     * @param hasX2Heat
     *     The has_x2_heat
     */
    public void setHasX2Heat(Boolean hasX2Heat) {
        this.hasX2Heat = hasX2Heat;
    }

    /**
     * 
     * @return
     *     The hasX3Heat
     */
    public Boolean getHasX3Heat() {
        return hasX3Heat;
    }

    /**
     * 
     * @param hasX3Heat
     *     The has_x3_heat
     */
    public void setHasX3Heat(Boolean hasX3Heat) {
        this.hasX3Heat = hasX3Heat;
    }

    /**
     * 
     * @return
     *     The heatLinkConnection
     */
    public Long getHeatLinkConnection() {
        return heatLinkConnection;
    }

    /**
     * 
     * @param heatLinkConnection
     *     The heat_link_connection
     */
    public void setHeatLinkConnection(Long heatLinkConnection) {
        this.heatLinkConnection = heatLinkConnection;
    }

    /**
     * 
     * @return
     *     The heatPumpAuxThreshold
     */
    public Long getHeatPumpAuxThreshold() {
        return heatPumpAuxThreshold;
    }

    /**
     * 
     * @param heatPumpAuxThreshold
     *     The heat_pump_aux_threshold
     */
    public void setHeatPumpAuxThreshold(Long heatPumpAuxThreshold) {
        this.heatPumpAuxThreshold = heatPumpAuxThreshold;
    }

    /**
     * 
     * @return
     *     The heatPumpAuxThresholdEnabled
     */
    public Boolean getHeatPumpAuxThresholdEnabled() {
        return heatPumpAuxThresholdEnabled;
    }

    /**
     * 
     * @param heatPumpAuxThresholdEnabled
     *     The heat_pump_aux_threshold_enabled
     */
    public void setHeatPumpAuxThresholdEnabled(Boolean heatPumpAuxThresholdEnabled) {
        this.heatPumpAuxThresholdEnabled = heatPumpAuxThresholdEnabled;
    }

    /**
     * 
     * @return
     *     The heatPumpCompThreshold
     */
    public Double getHeatPumpCompThreshold() {
        return heatPumpCompThreshold;
    }

    /**
     * 
     * @param heatPumpCompThreshold
     *     The heat_pump_comp_threshold
     */
    public void setHeatPumpCompThreshold(Double heatPumpCompThreshold) {
        this.heatPumpCompThreshold = heatPumpCompThreshold;
    }

    /**
     * 
     * @return
     *     The heatPumpCompThresholdEnabled
     */
    public Boolean getHeatPumpCompThresholdEnabled() {
        return heatPumpCompThresholdEnabled;
    }

    /**
     * 
     * @param heatPumpCompThresholdEnabled
     *     The heat_pump_comp_threshold_enabled
     */
    public void setHeatPumpCompThresholdEnabled(Boolean heatPumpCompThresholdEnabled) {
        this.heatPumpCompThresholdEnabled = heatPumpCompThresholdEnabled;
    }

    /**
     * 
     * @return
     *     The heatX2Delivery
     */
    public String getHeatX2Delivery() {
        return heatX2Delivery;
    }

    /**
     * 
     * @param heatX2Delivery
     *     The heat_x2_delivery
     */
    public void setHeatX2Delivery(String heatX2Delivery) {
        this.heatX2Delivery = heatX2Delivery;
    }

    /**
     * 
     * @return
     *     The heatX2Source
     */
    public String getHeatX2Source() {
        return heatX2Source;
    }

    /**
     * 
     * @param heatX2Source
     *     The heat_x2_source
     */
    public void setHeatX2Source(String heatX2Source) {
        this.heatX2Source = heatX2Source;
    }

    /**
     * 
     * @return
     *     The heatX3Delivery
     */
    public String getHeatX3Delivery() {
        return heatX3Delivery;
    }

    /**
     * 
     * @param heatX3Delivery
     *     The heat_x3_delivery
     */
    public void setHeatX3Delivery(String heatX3Delivery) {
        this.heatX3Delivery = heatX3Delivery;
    }

    /**
     * 
     * @return
     *     The heatX3Source
     */
    public String getHeatX3Source() {
        return heatX3Source;
    }

    /**
     * 
     * @param heatX3Source
     *     The heat_x3_source
     */
    public void setHeatX3Source(String heatX3Source) {
        this.heatX3Source = heatX3Source;
    }

    /**
     * 
     * @return
     *     The heaterDelivery
     */
    public String getHeaterDelivery() {
        return heaterDelivery;
    }

    /**
     * 
     * @param heaterDelivery
     *     The heater_delivery
     */
    public void setHeaterDelivery(String heaterDelivery) {
        this.heaterDelivery = heaterDelivery;
    }

    /**
     * 
     * @return
     *     The heaterSource
     */
    public String getHeaterSource() {
        return heaterSource;
    }

    /**
     * 
     * @param heaterSource
     *     The heater_source
     */
    public void setHeaterSource(String heaterSource) {
        this.heaterSource = heaterSource;
    }

    /**
     * 
     * @return
     *     The heatpumpReady
     */
    public Boolean getHeatpumpReady() {
        return heatpumpReady;
    }

    /**
     * 
     * @param heatpumpReady
     *     The heatpump_ready
     */
    public void setHeatpumpReady(Boolean heatpumpReady) {
        this.heatpumpReady = heatpumpReady;
    }

    /**
     * 
     * @return
     *     The heatpumpSavings
     */
    public String getHeatpumpSavings() {
        return heatpumpSavings;
    }

    /**
     * 
     * @param heatpumpSavings
     *     The heatpump_savings
     */
    public void setHeatpumpSavings(String heatpumpSavings) {
        this.heatpumpSavings = heatpumpSavings;
    }

    /**
     * 
     * @return
     *     The heatpumpSetbackActive
     */
    public Boolean getHeatpumpSetbackActive() {
        return heatpumpSetbackActive;
    }

    /**
     * 
     * @param heatpumpSetbackActive
     *     The heatpump_setback_active
     */
    public void setHeatpumpSetbackActive(Boolean heatpumpSetbackActive) {
        this.heatpumpSetbackActive = heatpumpSetbackActive;
    }

    /**
     * 
     * @return
     *     The humidifierFanActivation
     */
    public Boolean getHumidifierFanActivation() {
        return humidifierFanActivation;
    }

    /**
     * 
     * @param humidifierFanActivation
     *     The humidifier_fan_activation
     */
    public void setHumidifierFanActivation(Boolean humidifierFanActivation) {
        this.humidifierFanActivation = humidifierFanActivation;
    }

    /**
     * 
     * @return
     *     The humidifierState
     */
    public Boolean getHumidifierState() {
        return humidifierState;
    }

    /**
     * 
     * @param humidifierState
     *     The humidifier_state
     */
    public void setHumidifierState(Boolean humidifierState) {
        this.humidifierState = humidifierState;
    }

    /**
     * 
     * @return
     *     The humidifierType
     */
    public String getHumidifierType() {
        return humidifierType;
    }

    /**
     * 
     * @param humidifierType
     *     The humidifier_type
     */
    public void setHumidifierType(String humidifierType) {
        this.humidifierType = humidifierType;
    }

    /**
     * 
     * @return
     *     The humidityControlLockoutEnabled
     */
    public Boolean getHumidityControlLockoutEnabled() {
        return humidityControlLockoutEnabled;
    }

    /**
     * 
     * @param humidityControlLockoutEnabled
     *     The humidity_control_lockout_enabled
     */
    public void setHumidityControlLockoutEnabled(Boolean humidityControlLockoutEnabled) {
        this.humidityControlLockoutEnabled = humidityControlLockoutEnabled;
    }

    /**
     * 
     * @return
     *     The humidityControlLockoutEndTime
     */
    public Long getHumidityControlLockoutEndTime() {
        return humidityControlLockoutEndTime;
    }

    /**
     * 
     * @param humidityControlLockoutEndTime
     *     The humidity_control_lockout_end_time
     */
    public void setHumidityControlLockoutEndTime(Long humidityControlLockoutEndTime) {
        this.humidityControlLockoutEndTime = humidityControlLockoutEndTime;
    }

    /**
     * 
     * @return
     *     The humidityControlLockoutStartTime
     */
    public Long getHumidityControlLockoutStartTime() {
        return humidityControlLockoutStartTime;
    }

    /**
     * 
     * @param humidityControlLockoutStartTime
     *     The humidity_control_lockout_start_time
     */
    public void setHumidityControlLockoutStartTime(Long humidityControlLockoutStartTime) {
        this.humidityControlLockoutStartTime = humidityControlLockoutStartTime;
    }

    /**
     * 
     * @return
     *     The hvacPins
     */
    public String getHvacPins() {
        return hvacPins;
    }

    /**
     * 
     * @param hvacPins
     *     The hvac_pins
     */
    public void setHvacPins(String hvacPins) {
        this.hvacPins = hvacPins;
    }

    /**
     * 
     * @return
     *     The hvacSafetyShutoffActive
     */
    public Boolean getHvacSafetyShutoffActive() {
        return hvacSafetyShutoffActive;
    }

    /**
     * 
     * @param hvacSafetyShutoffActive
     *     The hvac_safety_shutoff_active
     */
    public void setHvacSafetyShutoffActive(Boolean hvacSafetyShutoffActive) {
        this.hvacSafetyShutoffActive = hvacSafetyShutoffActive;
    }

    /**
     * 
     * @return
     *     The hvacWires
     */
    public String getHvacWires() {
        return hvacWires;
    }

    /**
     * 
     * @param hvacWires
     *     The hvac_wires
     */
    public void setHvacWires(String hvacWires) {
        this.hvacWires = hvacWires;
    }

    /**
     * 
     * @return
     *     The isOnStand
     */
    public Boolean getIsOnStand() {
        return isOnStand;
    }

    /**
     * 
     * @param isOnStand
     *     The is_on_stand
     */
    public void setIsOnStand(Boolean isOnStand) {
        this.isOnStand = isOnStand;
    }

    /**
     * 
     * @return
     *     The leaf
     */
    public Boolean getLeaf() {
        return leaf;
    }

    /**
     * 
     * @param leaf
     *     The leaf
     */
    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    /**
     * 
     * @return
     *     The leafAwayHigh
     */
    public Double getLeafAwayHigh() {
        return leafAwayHigh;
    }

    /**
     * 
     * @param leafAwayHigh
     *     The leaf_away_high
     */
    public void setLeafAwayHigh(Double leafAwayHigh) {
        this.leafAwayHigh = leafAwayHigh;
    }

    /**
     * 
     * @return
     *     The leafAwayLow
     */
    public Double getLeafAwayLow() {
        return leafAwayLow;
    }

    /**
     * 
     * @param leafAwayLow
     *     The leaf_away_low
     */
    public void setLeafAwayLow(Double leafAwayLow) {
        this.leafAwayLow = leafAwayLow;
    }

    /**
     * 
     * @return
     *     The leafLearning
     */
    public String getLeafLearning() {
        return leafLearning;
    }

    /**
     * 
     * @param leafLearning
     *     The leaf_learning
     */
    public void setLeafLearning(String leafLearning) {
        this.leafLearning = leafLearning;
    }

    /**
     * 
     * @return
     *     The leafScheduleDelta
     */
    public Double getLeafScheduleDelta() {
        return leafScheduleDelta;
    }

    /**
     * 
     * @param leafScheduleDelta
     *     The leaf_schedule_delta
     */
    public void setLeafScheduleDelta(Double leafScheduleDelta) {
        this.leafScheduleDelta = leafScheduleDelta;
    }

    /**
     * 
     * @return
     *     The leafThresholdCool
     */
    public Long getLeafThresholdCool() {
        return leafThresholdCool;
    }

    /**
     * 
     * @param leafThresholdCool
     *     The leaf_threshold_cool
     */
    public void setLeafThresholdCool(Long leafThresholdCool) {
        this.leafThresholdCool = leafThresholdCool;
    }

    /**
     * 
     * @return
     *     The leafThresholdHeat
     */
    public Double getLeafThresholdHeat() {
        return leafThresholdHeat;
    }

    /**
     * 
     * @param leafThresholdHeat
     *     The leaf_threshold_heat
     */
    public void setLeafThresholdHeat(Double leafThresholdHeat) {
        this.leafThresholdHeat = leafThresholdHeat;
    }

    /**
     * 
     * @return
     *     The leafType
     */
    public Long getLeafType() {
        return leafType;
    }

    /**
     * 
     * @param leafType
     *     The leaf_type
     */
    public void setLeafType(Long leafType) {
        this.leafType = leafType;
    }

    /**
     * 
     * @return
     *     The learningDaysCompletedCool
     */
    public Long getLearningDaysCompletedCool() {
        return learningDaysCompletedCool;
    }

    /**
     * 
     * @param learningDaysCompletedCool
     *     The learning_days_completed_cool
     */
    public void setLearningDaysCompletedCool(Long learningDaysCompletedCool) {
        this.learningDaysCompletedCool = learningDaysCompletedCool;
    }

    /**
     * 
     * @return
     *     The learningDaysCompletedHeat
     */
    public Long getLearningDaysCompletedHeat() {
        return learningDaysCompletedHeat;
    }

    /**
     * 
     * @param learningDaysCompletedHeat
     *     The learning_days_completed_heat
     */
    public void setLearningDaysCompletedHeat(Long learningDaysCompletedHeat) {
        this.learningDaysCompletedHeat = learningDaysCompletedHeat;
    }

    /**
     * 
     * @return
     *     The learningDaysCompletedRange
     */
    public Long getLearningDaysCompletedRange() {
        return learningDaysCompletedRange;
    }

    /**
     * 
     * @param learningDaysCompletedRange
     *     The learning_days_completed_range
     */
    public void setLearningDaysCompletedRange(Long learningDaysCompletedRange) {
        this.learningDaysCompletedRange = learningDaysCompletedRange;
    }

    /**
     * 
     * @return
     *     The learningMode
     */
    public Boolean getLearningMode() {
        return learningMode;
    }

    /**
     * 
     * @param learningMode
     *     The learning_mode
     */
    public void setLearningMode(Boolean learningMode) {
        this.learningMode = learningMode;
    }

    /**
     * 
     * @return
     *     The learningState
     */
    public String getLearningState() {
        return learningState;
    }

    /**
     * 
     * @param learningState
     *     The learning_state
     */
    public void setLearningState(String learningState) {
        this.learningState = learningState;
    }

    /**
     * 
     * @return
     *     The learningTime
     */
    public Long getLearningTime() {
        return learningTime;
    }

    /**
     * 
     * @param learningTime
     *     The learning_time
     */
    public void setLearningTime(Long learningTime) {
        this.learningTime = learningTime;
    }

    /**
     * 
     * @return
     *     The localIp
     */
    public String getLocalIp() {
        return localIp;
    }

    /**
     * 
     * @param localIp
     *     The local_ip
     */
    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    /**
     * 
     * @return
     *     The loggingPriority
     */
    public String getLoggingPriority() {
        return loggingPriority;
    }

    /**
     * 
     * @param loggingPriority
     *     The logging_priority
     */
    public void setLoggingPriority(String loggingPriority) {
        this.loggingPriority = loggingPriority;
    }

    /**
     * 
     * @return
     *     The lowerSafetyTemp
     */
    public Double getLowerSafetyTemp() {
        return lowerSafetyTemp;
    }

    /**
     * 
     * @param lowerSafetyTemp
     *     The lower_safety_temp
     */
    public void setLowerSafetyTemp(Double lowerSafetyTemp) {
        this.lowerSafetyTemp = lowerSafetyTemp;
    }

    /**
     * 
     * @return
     *     The lowerSafetyTempEnabled
     */
    public Boolean getLowerSafetyTempEnabled() {
        return lowerSafetyTempEnabled;
    }

    /**
     * 
     * @param lowerSafetyTempEnabled
     *     The lower_safety_temp_enabled
     */
    public void setLowerSafetyTempEnabled(Boolean lowerSafetyTempEnabled) {
        this.lowerSafetyTempEnabled = lowerSafetyTempEnabled;
    }

    /**
     * 
     * @return
     *     The macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 
     * @param macAddress
     *     The mac_address
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * 
     * @return
     *     The maintBandLower
     */
    public Double getMaintBandLower() {
        return maintBandLower;
    }

    /**
     * 
     * @param maintBandLower
     *     The maint_band_lower
     */
    public void setMaintBandLower(Double maintBandLower) {
        this.maintBandLower = maintBandLower;
    }

    /**
     * 
     * @return
     *     The maintBandUpper
     */
    public Double getMaintBandUpper() {
        return maintBandUpper;
    }

    /**
     * 
     * @param maintBandUpper
     *     The maint_band_upper
     */
    public void setMaintBandUpper(Double maintBandUpper) {
        this.maintBandUpper = maintBandUpper;
    }

    /**
     * 
     * @return
     *     The modelVersion
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * 
     * @param modelVersion
     *     The model_version
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * 
     * @return
     *     The nlclientState
     */
    public String getNlclientState() {
        return nlclientState;
    }

    /**
     * 
     * @param nlclientState
     *     The nlclient_state
     */
    public void setNlclientState(String nlclientState) {
        this.nlclientState = nlclientState;
    }

    /**
     * 
     * @return
     *     The noteCodes
     */
    public List<JsonObject> getNoteCodes() {
        return noteCodes;
    }

    /**
     * 
     * @param noteCodes
     *     The note_codes
     */
    public void setNoteCodes(List<JsonObject> noteCodes) {
        this.noteCodes = noteCodes;
    }

    /**
     * 
     * @return
     *     The obOrientation
     */
    public String getObOrientation() {
        return obOrientation;
    }

    /**
     * 
     * @param obOrientation
     *     The ob_orientation
     */
    public void setObOrientation(String obOrientation) {
        this.obOrientation = obOrientation;
    }

    /**
     * 
     * @return
     *     The obPersistence
     */
    public Boolean getObPersistence() {
        return obPersistence;
    }

    /**
     * 
     * @param obPersistence
     *     The ob_persistence
     */
    public void setObPersistence(Boolean obPersistence) {
        this.obPersistence = obPersistence;
    }

    /**
     * 
     * @return
     *     The pinCDescription
     */
    public String getPinCDescription() {
        return pinCDescription;
    }

    /**
     * 
     * @param pinCDescription
     *     The pin_c_description
     */
    public void setPinCDescription(String pinCDescription) {
        this.pinCDescription = pinCDescription;
    }

    /**
     * 
     * @return
     *     The pinGDescription
     */
    public String getPinGDescription() {
        return pinGDescription;
    }

    /**
     * 
     * @param pinGDescription
     *     The pin_g_description
     */
    public void setPinGDescription(String pinGDescription) {
        this.pinGDescription = pinGDescription;
    }

    /**
     * 
     * @return
     *     The pinObDescription
     */
    public String getPinObDescription() {
        return pinObDescription;
    }

    /**
     * 
     * @param pinObDescription
     *     The pin_ob_description
     */
    public void setPinObDescription(String pinObDescription) {
        this.pinObDescription = pinObDescription;
    }

    /**
     * 
     * @return
     *     The pinRcDescription
     */
    public String getPinRcDescription() {
        return pinRcDescription;
    }

    /**
     * 
     * @param pinRcDescription
     *     The pin_rc_description
     */
    public void setPinRcDescription(String pinRcDescription) {
        this.pinRcDescription = pinRcDescription;
    }

    /**
     * 
     * @return
     *     The pinRhDescription
     */
    public String getPinRhDescription() {
        return pinRhDescription;
    }

    /**
     * 
     * @param pinRhDescription
     *     The pin_rh_description
     */
    public void setPinRhDescription(String pinRhDescription) {
        this.pinRhDescription = pinRhDescription;
    }

    /**
     * 
     * @return
     *     The pinStarDescription
     */
    public String getPinStarDescription() {
        return pinStarDescription;
    }

    /**
     * 
     * @param pinStarDescription
     *     The pin_star_description
     */
    public void setPinStarDescription(String pinStarDescription) {
        this.pinStarDescription = pinStarDescription;
    }

    /**
     * 
     * @return
     *     The pinW1Description
     */
    public String getPinW1Description() {
        return pinW1Description;
    }

    /**
     * 
     * @param pinW1Description
     *     The pin_w1_description
     */
    public void setPinW1Description(String pinW1Description) {
        this.pinW1Description = pinW1Description;
    }

    /**
     * 
     * @return
     *     The pinW2auxDescription
     */
    public String getPinW2auxDescription() {
        return pinW2auxDescription;
    }

    /**
     * 
     * @param pinW2auxDescription
     *     The pin_w2aux_description
     */
    public void setPinW2auxDescription(String pinW2auxDescription) {
        this.pinW2auxDescription = pinW2auxDescription;
    }

    /**
     * 
     * @return
     *     The pinY1Description
     */
    public String getPinY1Description() {
        return pinY1Description;
    }

    /**
     * 
     * @param pinY1Description
     *     The pin_y1_description
     */
    public void setPinY1Description(String pinY1Description) {
        this.pinY1Description = pinY1Description;
    }

    /**
     * 
     * @return
     *     The pinY2Description
     */
    public String getPinY2Description() {
        return pinY2Description;
    }

    /**
     * 
     * @param pinY2Description
     *     The pin_y2_description
     */
    public void setPinY2Description(String pinY2Description) {
        this.pinY2Description = pinY2Description;
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
     *     The preconditioningActive
     */
    public Boolean getPreconditioningActive() {
        return preconditioningActive;
    }

    /**
     * 
     * @param preconditioningActive
     *     The preconditioning_active
     */
    public void setPreconditioningActive(Boolean preconditioningActive) {
        this.preconditioningActive = preconditioningActive;
    }

    /**
     * 
     * @return
     *     The preconditioningEnabled
     */
    public Boolean getPreconditioningEnabled() {
        return preconditioningEnabled;
    }

    /**
     * 
     * @param preconditioningEnabled
     *     The preconditioning_enabled
     */
    public void setPreconditioningEnabled(Boolean preconditioningEnabled) {
        this.preconditioningEnabled = preconditioningEnabled;
    }

    /**
     * 
     * @return
     *     The preconditioningReady
     */
    public Boolean getPreconditioningReady() {
        return preconditioningReady;
    }

    /**
     * 
     * @param preconditioningReady
     *     The preconditioning_ready
     */
    public void setPreconditioningReady(Boolean preconditioningReady) {
        this.preconditioningReady = preconditioningReady;
    }

    /**
     * 
     * @return
     *     The radiantControlEnabled
     */
    public Boolean getRadiantControlEnabled() {
        return radiantControlEnabled;
    }

    /**
     * 
     * @param radiantControlEnabled
     *     The radiant_control_enabled
     */
    public void setRadiantControlEnabled(Boolean radiantControlEnabled) {
        this.radiantControlEnabled = radiantControlEnabled;
    }

    /**
     * 
     * @return
     *     The rangeEnable
     */
    public Boolean getRangeEnable() {
        return rangeEnable;
    }

    /**
     * 
     * @param rangeEnable
     *     The range_enable
     */
    public void setRangeEnable(Boolean rangeEnable) {
        this.rangeEnable = rangeEnable;
    }

    /**
     * 
     * @return
     *     The rssi
     */
    public Long getRssi() {
        return rssi;
    }

    /**
     * 
     * @param rssi
     *     The rssi
     */
    public void setRssi(Long rssi) {
        this.rssi = rssi;
    }

    /**
     * 
     * @return
     *     The safetyTempActivatingHvac
     */
    public Boolean getSafetyTempActivatingHvac() {
        return safetyTempActivatingHvac;
    }

    /**
     * 
     * @param safetyTempActivatingHvac
     *     The safety_temp_activating_hvac
     */
    public void setSafetyTempActivatingHvac(Boolean safetyTempActivatingHvac) {
        this.safetyTempActivatingHvac = safetyTempActivatingHvac;
    }

    /**
     * 
     * @return
     *     The scheduleLearningReset
     */
    public Boolean getScheduleLearningReset() {
        return scheduleLearningReset;
    }

    /**
     * 
     * @param scheduleLearningReset
     *     The schedule_learning_reset
     */
    public void setScheduleLearningReset(Boolean scheduleLearningReset) {
        this.scheduleLearningReset = scheduleLearningReset;
    }

    /**
     * 
     * @return
     *     The serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 
     * @param serialNumber
     *     The serial_number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 
     * @return
     *     The starType
     */
    public String getStarType() {
        return starType;
    }

    /**
     * 
     * @param starType
     *     The star_type
     */
    public void setStarType(String starType) {
        this.starType = starType;
    }

    /**
     * 
     * @return
     *     The sunlightCorrectionActive
     */
    public Boolean getSunlightCorrectionActive() {
        return sunlightCorrectionActive;
    }

    /**
     * 
     * @param sunlightCorrectionActive
     *     The sunlight_correction_active
     */
    public void setSunlightCorrectionActive(Boolean sunlightCorrectionActive) {
        this.sunlightCorrectionActive = sunlightCorrectionActive;
    }

    /**
     * 
     * @return
     *     The sunlightCorrectionEnabled
     */
    public Boolean getSunlightCorrectionEnabled() {
        return sunlightCorrectionEnabled;
    }

    /**
     * 
     * @param sunlightCorrectionEnabled
     *     The sunlight_correction_enabled
     */
    public void setSunlightCorrectionEnabled(Boolean sunlightCorrectionEnabled) {
        this.sunlightCorrectionEnabled = sunlightCorrectionEnabled;
    }

    /**
     * 
     * @return
     *     The sunlightCorrectionReady
     */
    public Boolean getSunlightCorrectionReady() {
        return sunlightCorrectionReady;
    }

    /**
     * 
     * @param sunlightCorrectionReady
     *     The sunlight_correction_ready
     */
    public void setSunlightCorrectionReady(Boolean sunlightCorrectionReady) {
        this.sunlightCorrectionReady = sunlightCorrectionReady;
    }

    /**
     * 
     * @return
     *     The switchSystemOff
     */
    public Boolean getSwitchSystemOff() {
        return switchSystemOff;
    }

    /**
     * 
     * @param switchSystemOff
     *     The switch_system_off
     */
    public void setSwitchSystemOff(Boolean switchSystemOff) {
        this.switchSystemOff = switchSystemOff;
    }

    /**
     * 
     * @return
     *     The targetHumidity
     */
    public Long getTargetHumidity() {
        return targetHumidity;
    }

    /**
     * 
     * @param targetHumidity
     *     The target_humidity
     */
    public void setTargetHumidity(Long targetHumidity) {
        this.targetHumidity = targetHumidity;
    }

    /**
     * 
     * @return
     *     The targetHumidityEnabled
     */
    public Boolean getTargetHumidityEnabled() {
        return targetHumidityEnabled;
    }

    /**
     * 
     * @param targetHumidityEnabled
     *     The target_humidity_enabled
     */
    public void setTargetHumidityEnabled(Boolean targetHumidityEnabled) {
        this.targetHumidityEnabled = targetHumidityEnabled;
    }

    /**
     * 
     * @return
     *     The targetTimeConfidence
     */
    public Long getTargetTimeConfidence() {
        return targetTimeConfidence;
    }

    /**
     * 
     * @param targetTimeConfidence
     *     The target_time_confidence
     */
    public void setTargetTimeConfidence(Long targetTimeConfidence) {
        this.targetTimeConfidence = targetTimeConfidence;
    }

    /**
     * 
     * @return
     *     The temperatureLock
     */
    public Boolean getTemperatureLock() {
        return temperatureLock;
    }

    /**
     * 
     * @param temperatureLock
     *     The temperature_lock
     */
    public void setTemperatureLock(Boolean temperatureLock) {
        this.temperatureLock = temperatureLock;
    }

    /**
     * 
     * @return
     *     The temperatureLockHighTemp
     */
    public Double getTemperatureLockHighTemp() {
        return temperatureLockHighTemp;
    }

    /**
     * 
     * @param temperatureLockHighTemp
     *     The temperature_lock_high_temp
     */
    public void setTemperatureLockHighTemp(Double temperatureLockHighTemp) {
        this.temperatureLockHighTemp = temperatureLockHighTemp;
    }

    /**
     * 
     * @return
     *     The temperatureLockLowTemp
     */
    public Long getTemperatureLockLowTemp() {
        return temperatureLockLowTemp;
    }

    /**
     * 
     * @param temperatureLockLowTemp
     *     The temperature_lock_low_temp
     */
    public void setTemperatureLockLowTemp(Long temperatureLockLowTemp) {
        this.temperatureLockLowTemp = temperatureLockLowTemp;
    }

    /**
     * 
     * @return
     *     The temperatureLockPinHash
     */
    public String getTemperatureLockPinHash() {
        return temperatureLockPinHash;
    }

    /**
     * 
     * @param temperatureLockPinHash
     *     The temperature_lock_pin_hash
     */
    public void setTemperatureLockPinHash(String temperatureLockPinHash) {
        this.temperatureLockPinHash = temperatureLockPinHash;
    }

    /**
     * 
     * @return
     *     The temperatureScale
     */
    public String getTemperatureScale() {
        return temperatureScale;
    }

    /**
     * 
     * @param temperatureScale
     *     The temperature_scale
     */
    public void setTemperatureScale(String temperatureScale) {
        this.temperatureScale = temperatureScale;
    }

    /**
     * 
     * @return
     *     The timeToTarget
     */
    public Long getTimeToTarget() {
        return timeToTarget;
    }

    /**
     * 
     * @param timeToTarget
     *     The time_to_target
     */
    public void setTimeToTarget(Long timeToTarget) {
        this.timeToTarget = timeToTarget;
    }

    /**
     * 
     * @return
     *     The timeToTargetTraining
     */
    public String getTimeToTargetTraining() {
        return timeToTargetTraining;
    }

    /**
     * 
     * @param timeToTargetTraining
     *     The time_to_target_training
     */
    public void setTimeToTargetTraining(String timeToTargetTraining) {
        this.timeToTargetTraining = timeToTargetTraining;
    }

    /**
     * 
     * @return
     *     The touchedBy
     */
    public JsonObject getTouchedBy() {
        return touchedBy;
    }

    /**
     * 
     * @param touchedBy
     *     The touched_by
     */
    public void setTouchedBy(JsonObject touchedBy) {
        this.touchedBy = touchedBy;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The upperSafetyTemp
     */
    public Long getUpperSafetyTemp() {
        return upperSafetyTemp;
    }

    /**
     * 
     * @param upperSafetyTemp
     *     The upper_safety_temp
     */
    public void setUpperSafetyTemp(Long upperSafetyTemp) {
        this.upperSafetyTemp = upperSafetyTemp;
    }

    /**
     * 
     * @return
     *     The upperSafetyTempEnabled
     */
    public Boolean getUpperSafetyTempEnabled() {
        return upperSafetyTempEnabled;
    }

    /**
     * 
     * @param upperSafetyTempEnabled
     *     The upper_safety_temp_enabled
     */
    public void setUpperSafetyTempEnabled(Boolean upperSafetyTempEnabled) {
        this.upperSafetyTempEnabled = upperSafetyTempEnabled;
    }

    /**
     * 
     * @return
     *     The userBrightness
     */
    public String getUserBrightness() {
        return userBrightness;
    }

    /**
     * 
     * @param userBrightness
     *     The user_brightness
     */
    public void setUserBrightness(String userBrightness) {
        this.userBrightness = userBrightness;
    }

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
     *     The y2Type
     */
    public String getY2Type() {
        return y2Type;
    }

    /**
     * 
     * @param y2Type
     *     The y2_type
     */
    public void setY2Type(String y2Type) {
        this.y2Type = y2Type;
    }

    /**
     * 
     * @return
     *     The schedules
     */
    public List<JsonObject> getSchedules() {
        return schedules;
    }

    /**
     * 
     * @param schedules
     *     The schedules
     */
    public void setSchedules(List<JsonObject> schedules) {
        this.schedules = schedules;
    }

}
