
package com.dynatrace.synthetic.data.results;

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
    "QueryTime",
    "BackboneData",
    "OtherData"
})
public class TestData {

    @JsonProperty("QueryTime")
    private com.dynatrace.synthetic.data.results.QueryTime QueryTime;
    @JsonProperty("BackboneData")
    private com.dynatrace.synthetic.data.results.BackboneData BackboneData;
    @JsonProperty("OtherData")
    private com.dynatrace.synthetic.data.results.OtherData OtherData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The QueryTime
     */
    @JsonProperty("QueryTime")
    public com.dynatrace.synthetic.data.results.QueryTime getQueryTime() {
        return QueryTime;
    }

    /**
     * 
     * @param QueryTime
     *     The QueryTime
     */
    @JsonProperty("QueryTime")
    public void setQueryTime(com.dynatrace.synthetic.data.results.QueryTime QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * 
     * @return
     *     The BackboneData
     */
    @JsonProperty("BackboneData")
    public com.dynatrace.synthetic.data.results.BackboneData getBackboneData() {
        return BackboneData;
    }

    /**
     * 
     * @param BackboneData
     *     The BackboneData
     */
    @JsonProperty("BackboneData")
    public void setBackboneData(com.dynatrace.synthetic.data.results.BackboneData BackboneData) {
        this.BackboneData = BackboneData;
    }

    /**
     * 
     * @return
     *     The OtherData
     */
    @JsonProperty("OtherData")
    public com.dynatrace.synthetic.data.results.OtherData getOtherData() {
        return OtherData;
    }

    /**
     * 
     * @param OtherData
     *     The OtherData
     */
    @JsonProperty("OtherData")
    public void setOtherData(com.dynatrace.synthetic.data.results.OtherData OtherData) {
        this.OtherData = OtherData;
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
