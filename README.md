# Weather Station Kata

The weather station provides temperature readings to the villagers of Kolachi.

Installed in the station is one trusty temperature sensor. The sensor is extremely accurate. Since it was installed decades ago, it is a little slow. When it doesn't have a recent reading to report (it must still be processing something), it reports back a stale reading which is blank.

## Objectives

1. Test the legacy `WeatherStation` class
2. Refactor to improve it ("make the change easy, before making the easy change" -- Kent Beck)
3. Add the features listed below using TDD

### Features

The villagers depend on the station to know what to wear.

1. When the temperature is less than 10 degrees Celsius, inform the villagers to put on warm clothes.
2. When the temperature is above 35 degrees Celsius, inform the villagers to put on light clothes. 

## Hints

Read the hints below at your discretion.

### Testing

- Avoid using 3rd party mocking libraries e.g. Mockito (create your own test doubles)

### Refactoring

- Introduce missing domain concepts (calisthenics rule: [wrap primitives](https://williamdurand.fr/2013/06/03/object-calisthenics/#3-wrap-all-primitives-and-strings))
- [Replace conditional with polymorphism](https://refactoring.com/catalog/replaceConditionalWithPolymorphism.html)
- Can you spot the "[Null Object Pattern](https://martinfowler.com/eaaCatalog/specialCase.html)"?