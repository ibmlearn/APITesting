Feature: Testing Advertiser API Targeting Support End Point

Background: 
	Given Simple init 
	And Set basic application url is "http://application:8080/Api/rest/" 
	And Set basic user details are 
		| particular                      | value           |

Scenario: GET request example 
	Given Set GET api endpoint as "signup" 
	And Set HEADER param request content type as "application/json" 
	And Set HEADER param response accept type as "application/json" 
	And Set Query param as "empty" 
	And Raise "GET" HTTP request 
	Then Valid HTTP response should be received 
	And Response http code should be 200 
	And Response HEADER content type should be "application/json" 
	And Response BODY should not be null or empty 
	And Response BODY parsing for "GET__signup" should be successful 

