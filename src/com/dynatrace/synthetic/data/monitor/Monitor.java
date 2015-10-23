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
    "Monitor"
})
public class Monitor {

    @JsonProperty("Monitor")
    private Monitor_ Monitor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Monitor
     */
    @JsonProperty("Monitor")
    public Monitor_ getMonitor() {
        return Monitor;
    }

    /**
     * 
     * @param Monitor
     *     The Monitor
     */
    @JsonProperty("Monitor")
    public void setMonitor(Monitor_ Monitor) {
        this.Monitor = Monitor;
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
