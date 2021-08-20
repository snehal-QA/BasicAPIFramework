package pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"additional_info",
"address",
"bank_details",
"company_name",
"entity_type"
})
@javax.annotation.processing.Generated("jsonschema2pojo")
public class Beneficiary {

@JsonProperty("additional_info")
private AdditionalInfo additionalInfo;
@JsonProperty("address")
private Address address;
@JsonProperty("bank_details")
private BankDetails bankDetails;
@JsonProperty("company_name")
private String companyName;
@JsonProperty("entity_type")
private String entityType;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("additional_info")
public AdditionalInfo getAdditionalInfo() {
return additionalInfo;
}

@JsonProperty("additional_info")
public void setAdditionalInfo(AdditionalInfo additionalInfo) {
this.additionalInfo = additionalInfo;
}

@JsonProperty("address")
public Address getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}

@JsonProperty("bank_details")
public BankDetails getBankDetails() {
return bankDetails;
}

@JsonProperty("bank_details")
public void setBankDetails(BankDetails bankDetails) {
this.bankDetails = bankDetails;
}

@JsonProperty("company_name")
public String getCompanyName() {
return companyName;
}

@JsonProperty("company_name")
public void setCompanyName(String companyName) {
this.companyName = companyName;
}

@JsonProperty("entity_type")
public String getEntityType() {
return entityType;
}

@JsonProperty("entity_type")
public void setEntityType(String entityType) {
this.entityType = entityType;
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