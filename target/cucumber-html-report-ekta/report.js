$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "name": "To test my cucumber test is running",
  "description": "  I want to run a sample feature file.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I test if Google search is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate to Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.setUpMeth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Cheese\" in search box",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.enterMeth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press enter",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.enterMeth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get results page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.resultsMeth()"
});
formatter.result({
  "status": "passed"
});
});