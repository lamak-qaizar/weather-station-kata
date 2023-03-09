# Weather Station Kata

The weather station provides temperature readings to the villagers of Kolachi.

Installed in the station is one trusty temperature sensor. The sensor is extremely accurate. Since it was installed decades ago, it is a little slow. When it doesn't have a recent reading to report (it must still be processing something), it reports back a stale reading which is blank.

## Objective

Test and refactor the legacy WeatherStation class before adding the features given below.

### Features

The villagers depend on the station to know what to wear.

Once the code has been tested and refactored, add the following features:

1. When the temperature is less than 10 degrees Celcius, tell the villagers to put on warm clothes.
2. When the temperature is above 35 degrees Celcius, tell the villagers to put on light clothes. 

### Refactoring hints

- Introduce missing domain concepts (calisthenics rule: [wrap primitives](https://williamdurand.fr/2013/06/03/object-calisthenics/#3-wrap-all-primitives-and-strings))
- [Replace conditional with polymorphism](https://refactoring.com/catalog/replaceConditionalWithPolymorphism.html)
- Can you spot the "[Null Object Pattern](https://martinfowler.com/eaaCatalog/specialCase.html)"?