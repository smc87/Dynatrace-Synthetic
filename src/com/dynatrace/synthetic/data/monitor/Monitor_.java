
package com.dynatrace.synthetic.data.monitor;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "monitorID",
    "mbgMonitorId",
    "tname",
    "status",
    "class",
    "timeout",
    "createdate",
    "moddate",
    "frequency",
    "summaryflag",
    "frameflag",
    "componentflag",
    "testType",
    "folderName"
})
public class Monitor_ {

    @JsonProperty("monitorID")
    private String monitorID;
    @JsonProperty("mbgMonitorId")
    private String mbgMonitorId;
    @JsonProperty("tname")
    private String tname;
    @JsonProperty("status")
    private String status;
    @JsonProperty("class")
    private String _class;
    @JsonProperty("timeout")
    private String timeout;
    @JsonProperty("createdate")
    private String createdate;
    @JsonProperty("moddate")
    private String moddate;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("summaryflag")
    private String summaryflag;
    @JsonProperty("frameflag")
    private String frameflag;
    @JsonProperty("componentflag")
    private String componentflag;
    @JsonProperty("testType")
    private String testType;
    @JsonProperty("folderName")
    private String folderName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The monitorID
     */
    @JsonProperty("monitorID")
    public String getMonitorID() {
        return monitorID;
    }

    /**
     * 
     * @param monitorID
     *     The monitorID
     */
    @JsonProperty("monitorID")
    public void setMonitorID(String monitorID) {
        this.monitorID = monitorID;
    }

    /**
     * 
     * @return
     *     The mbgMonitorId
     */
    @JsonProperty("mbgMonitorId")
    public String getMbgMonitorId() {
        return mbgMonitorId;
    }

    /**
     * 
     * @param mbgMonitorId
     *     The mbgMonitorId
     */
    @JsonProperty("mbgMonitorId")
    public void setMbgMonitorId(String mbgMonitorId) {
        this.mbgMonitorId = mbgMonitorId;
    }

    /**
     * 
     * @return
     *     The tname
     */
    @JsonProperty("tname")
    public String getTname() {
        return tname;
    }

    /**
     * 
     * @param tname
     *     The tname
     */
    @JsonProperty("tname")
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The _class
     */
    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     * 
     * @return
     *     The timeout
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * 
     * @param timeout
     *     The timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    /**
     * 
     * @return
     *     The createdate
     */
    @JsonProperty("createdate")
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 
     * @param createdate
     *     The createdate
     */
    @JsonProperty("createdate")
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 
     * @return
     *     The moddate
     */
    @JsonProperty("moddate")
    public String getModdate() {
        return moddate;
    }

    /**
     * 
     * @param moddate
     *     The moddate
     */
    @JsonProperty("moddate")
    public void setModdate(String moddate) {
        this.moddate = moddate;
    }

    /**
     * 
     * @return
     *     The frequency
     */
    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * 
     * @return
     *     The summaryflag
     */
    @JsonProperty("summaryflag")
    public String getSummaryflag() {
        return summaryflag;
    }

    /**
     * 
     * @param summaryflag
     *     The summaryflag
     */
    @JsonProperty("summaryflag")
    public void setSummaryflag(String summaryflag) {
        this.summaryflag = summaryflag;
    }

    /**
     * 
     * @return
     *     The frameflag
     */
    @JsonProperty("frameflag")
    public String getFrameflag() {
        return frameflag;
    }

    /**
     * 
     * @param frameflag
     *     The frameflag
     */
    @JsonProperty("frameflag")
    public void setFrameflag(String frameflag) {
        this.frameflag = frameflag;
    }

    /**
     * 
     * @return
     *     The componentflag
     */
    @JsonProperty("componentflag")
    public String getComponentflag() {
        return componentflag;
    }

    /**
     * 
     * @param componentflag
     *     The componentflag
     */
    @JsonProperty("componentflag")
    public void setComponentflag(String componentflag) {
        this.componentflag = componentflag;
    }

    /**
     * 
     * @return
     *     The testType
     */
    @JsonProperty("testType")
    public String getTestType() {
        return testType;
    }

    /**
     * 
     * @param testType
     *     The testType
     */
    @JsonProperty("testType")
    public void setTestType(String testType) {
        this.testType = testType;
    }

    /**
     * 
     * @return
     *     The folderName
     */
    @JsonProperty("folderName")
    public String getFolderName() {
        return folderName;
    }

    /**
     * 
     * @param folderName
     *     The folderName
     */
    @JsonProperty("folderName")
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
