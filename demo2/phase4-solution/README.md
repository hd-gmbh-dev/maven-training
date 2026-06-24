# Live Demo 2 - Phase 4: Add dev and ci profiles

We start with the project from [demo1/phase4](../../demo1/phase4-solution).

## Added a long-running test

[`Phase4ApplicationTests.java`](src/test/java/com/example/Phase4ApplicationTests.java):

```java

@Test
@Tag("slow")
void slowTest() {
    System.out.println("Waiting ...");
    var i = new AtomicInteger(0);
    await()
            .atLeast(5, SECONDS)
            .atMost(15, SECONDS)
            .pollInterval(1, SECONDS)
            .until(() -> i.incrementAndGet() == 10);
    System.out.println("done!");
}
```

## Added profiles:

```xml

<profiles>
    <profile>
        <id>dev</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <build>
            <plugins>
                <plugin>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <configuration>
                        <excludedGroups>slow</excludedGroups> <!-- skips @Tag("slow") -->
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>
    <profile>
        <id>ci</id> <!-- No filter: all tests run -->
    </profile>
</profiles>
```

## Compile and run tests:

```shell
$ mvn test
```

```terminaloutput
...
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.544 s -- in com.example.Phase4ApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
...
```

```shell
$ mvn test -P ci
```

```terminaloutput
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.73 s -- in com.example.Phase4ApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
```
