## System Requirements

* Latest Google Chrome-- driver 114 browser
* Maven installation Apache Maven 3.9.6
* Java installation "17.0.6"

framework used : BDD- Cucumber
pom.xml and update Maven for plugins and Jars to be downloaded

* Run "maven test -Dcucumber.tags="@'ScenarioTag'"
    * ScenarioTag would run for a default headlesschrome browser

Features file location: src\test\resources\features
Glue file location: src\test\java\StepDefinition
Java pages location : src\test\java\pages

After running you can find the reports in below folders
html:target/cucumber-html-report,
json:cucumber.json