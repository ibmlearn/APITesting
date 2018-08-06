package com.pp.step.implementation.advertiser;

import cucumber.api.DataTable;

public class TargetingSupportStepImplementations {

	public String applicationURL;
	public String currentGETEndPoint;
	public String currentPOSTEndPoint;
	public String currentPUTEndPoint;
	public String currentDELETEEndPoint;
	public String headerParamRequestContentType;
	public String headerParamResponseAcceptType;

	public void parseBasicUserDetails(DataTable userDetailDataTable) {

	}

	public void setQueryParam(String queryParam) {
		if (queryParam.contains("empty"))
			return;
	}

	public void rasieFollowingHTTPMethod(String httpMethod) {
		switch (httpMethod) {
		case "GET":
			break;
		case "POST":
			break;
		case "PUT":
			break;
		case "DELETE":
			break;
		default:
		}
	}

	public void validateHTTPresponseShouldBeValid() {

	}

	public void validateHTTPresponseCode(int expectedHttpResponseCode) {

	}

	public void validateHTTPresponseContentType(String headerParamResponseContentType) {

	}

	public void validateHTTPresponseBodyShouldNotBeNull() {

	}

	public void validateHTTPresponseBodyShouldBeSuccessfulFor(String httpMethod_APIendPoint) {

	}
}
