
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
    "mid",
    "MBG_mid",
    "tname",
    "ttype",
    "ttime",
    "arrtime",
    "popid",
    "popname",
    "popcountry",
    "prid",
    "prreg",
    "prisp",
    "prip",
    "rtime",
    "tpt",
    "tps",
    "tpf",
    "tot",
    "tos",
    "tof",
    "nbyte",
    "prebw",
    "postbw",
    "actualbw"
})
public class TestData__ {

    @JsonProperty("mid")
    private String mid;
    @JsonProperty("MBG_mid")
    private String MBGMid;
    @JsonProperty("tname")
    private String tname;
    @JsonProperty("ttype")
    private String ttype;
    @JsonProperty("ttime")
    private String ttime;
    @JsonProperty("arrtime")
    private String arrtime;
    @JsonProperty("popid")
    private String popid;
    @JsonProperty("popname")
    private String popname;
    @JsonProperty("popcountry")
    private String popcountry;
    @JsonProperty("prid")
    private String prid;
    @JsonProperty("prreg")
    private String prreg;
    @JsonProperty("prisp")
    private String prisp;
    @JsonProperty("prip")
    private String prip;
    @JsonProperty("rtime")
    private String rtime;
    @JsonProperty("tpt")
    private String tpt;
    @JsonProperty("tps")
    private String tps;
    @JsonProperty("tpf")
    private String tpf;
    @JsonProperty("tot")
    private String tot;
    @JsonProperty("tos")
    private String tos;
    @JsonProperty("tof")
    private String tof;
    @JsonProperty("nbyte")
    private String nbyte;
    @JsonProperty("prebw")
    private String prebw;
    @JsonProperty("postbw")
    private String postbw;
    @JsonProperty("actualbw")
    private String actualbw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mid
     */
    @JsonProperty("mid")
    public String getMid() {
        return mid;
    }

    /**
     * 
     * @param mid
     *     The mid
     */
    @JsonProperty("mid")
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 
     * @return
     *     The MBGMid
     */
    @JsonProperty("MBG_mid")
    public String getMBGMid() {
        return MBGMid;
    }

    /**
     * 
     * @param MBGMid
     *     The MBG_mid
     */
    @JsonProperty("MBG_mid")
    public void setMBGMid(String MBGMid) {
        this.MBGMid = MBGMid;
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
     *     The ttype
     */
    @JsonProperty("ttype")
    public String getTtype() {
        return ttype;
    }

    /**
     * 
     * @param ttype
     *     The ttype
     */
    @JsonProperty("ttype")
    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    /**
     * 
     * @return
     *     The ttime
     */
    @JsonProperty("ttime")
    public String getTtime() {
        return ttime;
    }

    /**
     * 
     * @param ttime
     *     The ttime
     */
    @JsonProperty("ttime")
    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    /**
     * 
     * @return
     *     The arrtime
     */
    @JsonProperty("arrtime")
    public String getArrtime() {
        return arrtime;
    }

    /**
     * 
     * @param arrtime
     *     The arrtime
     */
    @JsonProperty("arrtime")
    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    /**
     * 
     * @return
     *     The popid
     */
    @JsonProperty("popid")
    public String getPopid() {
        return popid;
    }

    /**
     * 
     * @param popid
     *     The popid
     */
    @JsonProperty("popid")
    public void setPopid(String popid) {
        this.popid = popid;
    }

    /**
     * 
     * @return
     *     The popname
     */
    @JsonProperty("popname")
    public String getPopname() {
        return popname;
    }

    /**
     * 
     * @param popname
     *     The popname
     */
    @JsonProperty("popname")
    public void setPopname(String popname) {
        this.popname = popname;
    }

    /**
     * 
     * @return
     *     The popcountry
     */
    @JsonProperty("popcountry")
    public String getPopcountry() {
        return popcountry;
    }

    /**
     * 
     * @param popcountry
     *     The popcountry
     */
    @JsonProperty("popcountry")
    public void setPopcountry(String popcountry) {
        this.popcountry = popcountry;
    }

    /**
     * 
     * @return
     *     The prid
     */
    @JsonProperty("prid")
    public String getPrid() {
        return prid;
    }

    /**
     * 
     * @param prid
     *     The prid
     */
    @JsonProperty("prid")
    public void setPrid(String prid) {
        this.prid = prid;
    }

    /**
     * 
     * @return
     *     The prreg
     */
    @JsonProperty("prreg")
    public String getPrreg() {
        return prreg;
    }

    /**
     * 
     * @param prreg
     *     The prreg
     */
    @JsonProperty("prreg")
    public void setPrreg(String prreg) {
        this.prreg = prreg;
    }

    /**
     * 
     * @return
     *     The prisp
     */
    @JsonProperty("prisp")
    public String getPrisp() {
        return prisp;
    }

    /**
     * 
     * @param prisp
     *     The prisp
     */
    @JsonProperty("prisp")
    public void setPrisp(String prisp) {
        this.prisp = prisp;
    }

    /**
     * 
     * @return
     *     The prip
     */
    @JsonProperty("prip")
    public String getPrip() {
        return prip;
    }

    /**
     * 
     * @param prip
     *     The prip
     */
    @JsonProperty("prip")
    public void setPrip(String prip) {
        this.prip = prip;
    }

    /**
     * 
     * @return
     *     The rtime
     */
    @JsonProperty("rtime")
    public String getRtime() {
        return rtime;
    }

    /**
     * 
     * @param rtime
     *     The rtime
     */
    @JsonProperty("rtime")
    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    /**
     * 
     * @return
     *     The tpt
     */
    @JsonProperty("tpt")
    public String getTpt() {
        return tpt;
    }

    /**
     * 
     * @param tpt
     *     The tpt
     */
    @JsonProperty("tpt")
    public void setTpt(String tpt) {
        this.tpt = tpt;
    }

    /**
     * 
     * @return
     *     The tps
     */
    @JsonProperty("tps")
    public String getTps() {
        return tps;
    }

    /**
     * 
     * @param tps
     *     The tps
     */
    @JsonProperty("tps")
    public void setTps(String tps) {
        this.tps = tps;
    }

    /**
     * 
     * @return
     *     The tpf
     */
    @JsonProperty("tpf")
    public String getTpf() {
        return tpf;
    }

    /**
     * 
     * @param tpf
     *     The tpf
     */
    @JsonProperty("tpf")
    public void setTpf(String tpf) {
        this.tpf = tpf;
    }

    /**
     * 
     * @return
     *     The tot
     */
    @JsonProperty("tot")
    public String getTot() {
        return tot;
    }

    /**
     * 
     * @param tot
     *     The tot
     */
    @JsonProperty("tot")
    public void setTot(String tot) {
        this.tot = tot;
    }

    /**
     * 
     * @return
     *     The tos
     */
    @JsonProperty("tos")
    public String getTos() {
        return tos;
    }

    /**
     * 
     * @param tos
     *     The tos
     */
    @JsonProperty("tos")
    public void setTos(String tos) {
        this.tos = tos;
    }

    /**
     * 
     * @return
     *     The tof
     */
    @JsonProperty("tof")
    public String getTof() {
        return tof;
    }

    /**
     * 
     * @param tof
     *     The tof
     */
    @JsonProperty("tof")
    public void setTof(String tof) {
        this.tof = tof;
    }

    /**
     * 
     * @return
     *     The nbyte
     */
    @JsonProperty("nbyte")
    public String getNbyte() {
        return nbyte;
    }

    /**
     * 
     * @param nbyte
     *     The nbyte
     */
    @JsonProperty("nbyte")
    public void setNbyte(String nbyte) {
        this.nbyte = nbyte;
    }

    /**
     * 
     * @return
     *     The prebw
     */
    @JsonProperty("prebw")
    public String getPrebw() {
        return prebw;
    }

    /**
     * 
     * @param prebw
     *     The prebw
     */
    @JsonProperty("prebw")
    public void setPrebw(String prebw) {
        this.prebw = prebw;
    }

    /**
     * 
     * @return
     *     The postbw
     */
    @JsonProperty("postbw")
    public String getPostbw() {
        return postbw;
    }

    /**
     * 
     * @param postbw
     *     The postbw
     */
    @JsonProperty("postbw")
    public void setPostbw(String postbw) {
        this.postbw = postbw;
    }

    /**
     * 
     * @return
     *     The actualbw
     */
    @JsonProperty("actualbw")
    public String getActualbw() {
        return actualbw;
    }

    /**
     * 
     * @param actualbw
     *     The actualbw
     */
    @JsonProperty("actualbw")
    public void setActualbw(String actualbw) {
        this.actualbw = actualbw;
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
