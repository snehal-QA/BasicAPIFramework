package resources;

public enum apiResources {
	
	//Resources
	AuthEndpoint("/api/v1/authentication/login"),
	CreateBeneficiaryEndpoint("/api/v1/beneficiaries/create");
	
private String resource;
	
	apiResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
}
