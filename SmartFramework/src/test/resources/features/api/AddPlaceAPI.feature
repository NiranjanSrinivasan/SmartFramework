Feature: Validating Place API's

@AddPlace
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
Given Add Place Payload with "<id>" "<title>" "<author">
When user calls "AddPlaceAPI" with "post" http request
Then the API call got success with status code "201"
And "author" in response body is "QA"

Examples:
|id|title|author|
|80|QA|Krishna|
|90|QA|Asha|