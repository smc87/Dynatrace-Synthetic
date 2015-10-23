
package com.dynatrace.synthetic.data.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "Monitors"
})
public class Monitors {

    @JsonProperty("Monitors")
    private List<Monitor> Monitors = new ArrayList<Monitor>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Monitors
     */
    @JsonProperty("Monitors")
    public List<Monitor> getMonitors() {
        return Monitors;
    }

    /**
     * 
     * @param Monitors
     *     The Monitors
     */
    @JsonProperty("Monitors")
    public void setMonitors(List<Monitor> Monitors) {
        this.Monitors = Monitors;
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
