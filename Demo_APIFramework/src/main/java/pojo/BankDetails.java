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
"account_currency",
"account_name",
"account_number",
"account_routing_type1",
"bank_country_code",
"bank_name",
"swift_code"
})
@javax.annotation.processing.Generated("jsonschema2pojo")
public class BankDetails {

@JsonProperty("account_currency")
private String accountCurrency;
@JsonProperty("account_name")
private String accountName;
@JsonProperty("account_number")
private String accountNumber;
@JsonProperty("account_routing_type1")
private String accountRoutingType1;
@JsonProperty("bank_country_code")
private String bankCountryCode;
@JsonProperty("bank_name")
private String bankName;
@JsonProperty("swift_code")
private String swiftCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("account_currency")
public String getAccountCurrency() {
return accountCurrency;
}

@JsonProperty("account_currency")
public void setAccountCurrency(String accountCurrency) {
this.accountCurrency = accountCurrency;
}

@JsonProperty("account_name")
public String getAccountName() {
return accountName;
}

@JsonProperty("account_name")
public void setAccountName(String accountName) {
this.accountName = accountName;
}

@JsonProperty("account_number")
public String getAccountNumber() {
return accountNumber;
}

@JsonProperty("account_number")
public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
}

@JsonProperty("account_routing_type1")
public String getAccountRoutingType1() {
return accountRoutingType1;
}

@JsonProperty("account_routing_type1")
public void setAccountRoutingType1(String accountRoutingType1) {
this.accountRoutingType1 = accountRoutingType1;
}

@JsonProperty("bank_country_code")
public String getBankCountryCode() {
return bankCountryCode;
}

@JsonProperty("bank_country_code")
public void setBankCountryCode(String bankCountryCode) {
this.bankCountryCode = bankCountryCode;
}

@JsonProperty("bank_name")
public String getBankName() {
return bankName;
}

@JsonProperty("bank_name")
public void setBankName(String bankName) {
this.bankName = bankName;
}

@JsonProperty("swift_code")
public String getSwiftCode() {
return swiftCode;
}

@JsonProperty("swift_code")
public void setSwiftCode(String swiftCode) {
this.swiftCode = swiftCode;
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