package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"beneficiary",
"nickname",
"payer_entity_type",
"payment_methods"
})
@javax.annotation.processing.Generated("jsonschema2pojo")
public class CreateBeneficiary {

@JsonProperty("beneficiary")
private Beneficiary beneficiary;
@JsonProperty("nickname")
private String nickname;
@JsonProperty("payer_entity_type")
private String payerEntityType;
@JsonProperty("payment_methods")
private List<String> paymentMethods;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("beneficiary")
public Beneficiary getBeneficiary() {
return beneficiary;
}

@JsonProperty("beneficiary")
public void setBeneficiary(Beneficiary beneficiary) {
this.beneficiary = beneficiary;
}

@JsonProperty("nickname")
public String getNickname() {
return nickname;
}

@JsonProperty("nickname")
public void setNickname(String nickname) {
this.nickname = nickname;
}

@JsonProperty("payer_entity_type")
public String getPayerEntityType() {
return payerEntityType;
}

@JsonProperty("payer_entity_type")
public void setPayerEntityType(String payerEntityType) {
this.payerEntityType = payerEntityType;
}

@JsonProperty("payment_methods")
public List<String> getPaymentMethods() {
return paymentMethods;
}

@JsonProperty("payment_methods")
public void setPaymentMethods(List<String> paymentMethods) {
this.paymentMethods = paymentMethods;
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