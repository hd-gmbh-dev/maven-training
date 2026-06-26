# Exercise 2 — Adding a Dependency

🟢 **Beginner** &nbsp; ⏱ 15–20 min

## Background

Starter project: [`demo1/phase4-solution`](../demo1/phase4-solution)

The starter project has no external dependencies yet (except the spring dependencies).
You will add one and actually use it in code.

## Tasks

1. Add `com.google.code.gson:gson` at its current version as a dependency (scope: `compile`).
2. Extend the `main` method in `Phase4Application.java` to convert a Java object (or `Map`) to a JSON string using Gson and prints it to the console.
3. Run `mvn package` and start the resulting JAR with `java -cp target/... YourClass`.
4. **Bonus:** JUnit is already there as a `test` scoped dependency through spring. You cannot use JUnit classes under `src/main/java` but you can under `src/test/java`. Refactor your code to get a testable method which does the conversion and write a simple test for it. Run `mvn test`.

> [!TIP]
> Find the current Gson version on [mvnrepository.com](https://mvnrepository.com) — search for `gson` and copy the `<dependency>` block directly.

## Learning Goal

You can add a dependency to `pom.xml`, understand what scopes mean, and see how Maven automatically downloads the JAR and includes it in the build.
