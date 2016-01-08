package com.bwssystems.nest.protocol.error;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class NestError {

@SerializedName("error")
@Expose
private String error;
@SerializedName("error_description")
@Expose
private String errorDescription;
@SerializedName("instance_id")
@Expose
private String instanceId;

/**
* 
* @return
* The error
*/
public String getError() {
return error;
}

/**
* 
* @param error
* The error
*/
public void setError(String error) {
this.error = error;
}

/**
* 
* @return
* The errorDescription
*/
public String getErrorDescription() {
return errorDescription;
}

/**
* 
* @param errorDescription
* The error_description
*/
public void setErrorDescription(String errorDescription) {
this.errorDescription = errorDescription;
}

/**
* 
* @return
* The instanceId
*/
public String getInstanceId() {
return instanceId;
}

/**
* 
* @param instanceId
* The instance_id
*/
public void setInstanceId(String instanceId) {
this.instanceId = instanceId;
}

}
