# Live Demo 2 - Phase 1: Add a test utility library

We start with the project from [demo1/phase4](../../demo1/phase4-solution).

## Added test-scoped dependency:

```xml
<dependency>
    <groupId>org.awaitility</groupId>
    <artifactId>awaitility</artifactId>
    <scope>test</scope>
</dependency>
```

## Verify:

1. Now you can use it in the [test class](src/test/java/com/example/Demo2Phase1ApplicationTests.java):
   ```java
   import static org.awaitility.Awaitility.await;
   // ...
   void test() {
       await().atMost(5, SECONDS).until(() -> false);
   }
   ```
2. But it is not possible to use it in [production code](src/main/java/com/example/Demo2Phase1Application.java):
   ```java
   import static org.awaitility.Awaitility.await;
   // ❌ Cannot resolve symbol 'Awaitility'
   ```

## Compile and run tests:

```shell
$ mvn test
```
