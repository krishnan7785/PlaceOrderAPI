# Place Order API on Heroku

Provides a REST based client to interact with Salesforce Composite API to Load Contract, Orders and Order Items. The application can run on heroku as a scheduled process.

## Getting Started

Follow this document to install pre-requsites https://salesforce.quip.com/xA45ASkuO2mc and deploy application to heroku.

### Prerequisites

This is a java and maven based project and will require appropriate versions of JDK and Maven. Also requires a HEROKU CLI to interact with system api on heroku.

### Deployment

These are series of steps to deploy project to heroku

```
mvn clean compile
```

after successful build

```
git init
```

after successful init

```
git commit -m 'Required Changes'
```

push to remote branch

```
git push
```

set remote git repo and app

```
heroku git:remote -a <app name>
```
deploy  to heroku

```
mvn heroku:deploy -Dheroku.appName=<App name> -DskipTests=true
```

deploy directly using this button [![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy?template=https://git.soma.salesforce.com/kganesan/PlaceOrderAPI/)

## Running the Processes

kickstart scheduler Process using

```
heroku ps:scale scheduler=1
```

kickstart worker Process 1 using

```
heroku ps:scale worker1=1
```

tail app logs using

```
heroku logs --tail
```


## Running the tests

Uses testng as the test runner. To run individual test run

```
mvn -Dtest=<Class name>#<Method Name> test
```

## Built With

* [Rabbit MQ](https://www.rabbitmq.com/getstarted.html) - Message Queue Framework
* [Quartz](http://www.quartz-scheduler.org/documentation/2.3.1-SNAPSHOT/tutorials/) - Scheduler Framework
* [Place Order REST API](https://developer.salesforce.com/docs/atlas.en-us.api_placeorder.meta/api_placeorder/) - Salesforce Composite Rest API


## Authors

* **Krishnan Ganesan** - *Initial work* 

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.
