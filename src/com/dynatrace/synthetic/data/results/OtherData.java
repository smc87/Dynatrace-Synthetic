
package com.dynatrace.synthetic.data.results;

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
    "TestLevelData"
})
public class OtherData {

    @JsonProperty("TestLevelData")
    private List<TestLevelDatum_> TestLevelData = new ArrayList<TestLevelDatum_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The TestLevelData
     */
    @JsonProperty("TestLevelData")
    public List<TestLevelDatum_> getTestLevelData() {
        return TestLevelData;
    }

    /**
     * 
     * @param TestLevelData
     *     The TestLevelData
     */
    @JsonProperty("TestLevelData")
    public void setTestLevelData(List<TestLevelDatum_> TestLevelData) {
        this.TestLevelData = TestLevelData;
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
