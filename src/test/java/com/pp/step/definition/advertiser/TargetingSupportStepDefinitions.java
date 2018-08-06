package com.pp.step.definition.advertiser;

import com.pp.step.implementation.advertiser.TargetingSupportStepImplementations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TargetingSupportStepDefinitions {

	private TargetingSupportStepImplementations tssi = null;

	@Given("^Simple init$")
	public void simple_init() {
		tssi = new TargetingSupportStepImplementations();
	}

	@Given("^Set basic application url is \"(.*?)\"$")
	public void set_basic_application_url(String url) {
		tssi.applicationURL = url;
	}

	@Given("^Set basic user details are$")
	public void set_basic_user_details(DataTable userDetailDataTable) {
		tssi.parseBasicUserDetails(userDetailDataTable);
	}

	@Given("^Set GET api endpoint as \"(.*?)\"$")
	public void set_GET_api_endpoint(String currrentGETEndPoint) {
		tssi.currentGETEndPoint = currrentGETEndPoint;
	}

	@Given("^Set HEADER param request content type as \"(.*?)\"$")
	public void set_HEADER_param_request_content_type_as(String headerParamRequestContentType) {
		tssi.headerParamRequestContentType = headerParamRequestContentType;
	}

	@Given("^Set HEADER param response accept type as \"(.*?)\"$")
	public void set_HEADER_param_response_accept_type_as(String headerParamResponseAcceptType) {
		tssi.headerParamResponseAcceptType = headerParamResponseAcceptType;
	}

	@Given("^Set Query param as \"(.*?)\"$")
	public void set_Query_param_as(String queryParam) {
		tssi.setQueryParam(queryParam);
	}

	@Given("^Raise \"(.*?)\" HTTP request$")
	public void raise_HTTP_request(String httpMethod) {
		tssi.rasieFollowingHTTPMethod(httpMethod);
	}

	@Then("^Valid HTTP response should be received$")
	public void valid_HTTP_response_should_be_received() {
		tssi.validateHTTPresponseShouldBeValid();
	}

	@Then("^Response http code should be (\\d+)$")
	public void response_http_code_should_be(int expectedHttpResponseCode) {
		tssi.validateHTTPresponseCode(expectedHttpResponseCode);
	}

	@Then("^Response HEADER content type should be \"(.*?)\"$")
	public void response_HEADER_content_type_should_be(String headerParamResponseContentType) {
		tssi.validateHTTPresponseContentType(headerParamResponseContentType);
	}

	@Then("^Response BODY should not be null or empty$")
	public void response_BODY_should_not_be_null_or_empty() {
		tssi.validateHTTPresponseBodyShouldNotBeNull();
	}

	@Then("^Response BODY parsing for \"(.*?)\" should be successful$")
	public void response_BODY_parsing_for_should_be_successful(String httpMethod_APIendPoint) {
		tssi.validateHTTPresponseBodyShouldBeSuccessfulFor(httpMethod_APIendPoint);
	}

}
