package Generic;

import java.util.List;

import com.github.javafaker.Faker;
import pojo.CreateBeneficiary;


public class CreateBeneficiary_requestPayloadBuilder {
		
		public static CreateBeneficiary createbeneficiarypayload(List<String> payment_methods,String country_code,String account_currency, 
				String account_name,String account_number, String account_routing_type1, String bank_country_code,
				String bank_name,String swift_code) {
			//---------Create objects to access respective data in them ------------------------------//		
			CreateBeneficiary requestbody= new CreateBeneficiary();
			
			//-------------To create fake data--------------------------------------------------------//
			Faker faker = new Faker();
			//------------------------------Set data--------------------------------------------------//
			
			//-----------------------PersonalEmail----------------------------------------------------//
			requestbody.getBeneficiary().getAdditionalInfo().setPersonalEmail(faker.internet().emailAddress());
			
			//-----------------------Address----------------------------------------------------------//
			requestbody.getBeneficiary().getAddress().setCity(faker.address().cityName());
			requestbody.getBeneficiary().getAddress().setCountryCode(country_code);
			requestbody.getBeneficiary().getAddress().setPostcode(faker.address().zipCode());
			requestbody.getBeneficiary().getAddress().setState(faker.address().state());
			requestbody.getBeneficiary().getAddress().setStreetAddress(faker.address().streetAddress());
			
			//---------------------------BankDetails----------------------------------------------------//
			requestbody.getBeneficiary().getBankDetails().setAccountCurrency(account_currency);
			requestbody.getBeneficiary().getBankDetails().setAccountName(account_name);
			requestbody.getBeneficiary().getBankDetails().setAccountNumber(account_number);
			requestbody.getBeneficiary().getBankDetails().setAccountRoutingType1(account_routing_type1);
			requestbody.getBeneficiary().getBankDetails().setBankCountryCode(swift_code);
			requestbody.getBeneficiary().getBankDetails().setBankName(bank_name);
			requestbody.getBeneficiary().getBankDetails().setSwiftCode(swift_code);
			
		    //-----------------------------------------setcompany details-------------------------------//
			requestbody.getBeneficiary().setCompanyName(faker.company().name());
			requestbody.getBeneficiary().setEntityType(faker.company().industry());
			
			//-----------------------------------other details--------------------------------------------//
			requestbody.setNickname(faker.name().username());
			requestbody.setPayerEntityType("PERSONAL");
			//----------------------------------payment methods------------------------------------------//
			requestbody.setPaymentMethods(payment_methods);
			
			
			return requestbody;	
		}
}
