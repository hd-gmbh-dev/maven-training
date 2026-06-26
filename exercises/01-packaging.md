# Exercise 1 — Understanding Packaging

🟢 **Beginner** &nbsp; ⏱ 10–15 min

## Background

Starter project: [`demo1/phase4-solution`](../demo1/phase4-solution)

The starter project intentionally omits `<packaging>` from the `pom.xml`. Maven still behaves correctly — but why?

## Tasks

1. Run `mvn package` in the starter project and inspect the result in `target/`.
2. Look up which `<packaging>` value is applied implicitly when the tag is missing.
3. Add the value explicitly to `pom.xml` and run `mvn package` again. Does anything change?
4. Change `<packaging>` to `war` and observe what Maven produces now. What is missing?

> [!TIP]
> The Maven documentation for `<packaging>` can be found at [maven.apache.org/pom.html#packaging](https://maven.apache.org/pom.html#packaging)

## Learning Goal

You understand which packaging types Maven supports (`jar`, `war`, `ear`, `pom`) and why modern Spring Boot applications use `jar`.
