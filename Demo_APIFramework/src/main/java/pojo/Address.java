package pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"city",
"country_code",
"postcode",
"state",
"street_address"
})
@Generated("jsonschema2pojo")
public class Address {

@JsonProperty("city")
private String city;
@JsonProperty("country_code")
private String countryCode;
@JsonProperty("postcode")
private String postcode;
@JsonProperty("state")
private String state;
@JsonProperty("street_address")
private String streetAddress;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("city")
public String getCity() {
return city;
}

@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("country_code")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("country_code")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("postcode")
public String getPostcode() {
return postcode;
}

@JsonProperty("postcode")
public void setPostcode(String postcode) {
this.postcode = postcode;
}

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("street_address")
public String getStreetAddress() {
return streetAddress;
}

@JsonProperty("street_address")
public void setStreetAddress(String streetAddress) {
this.streetAddress = streetAddress;
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