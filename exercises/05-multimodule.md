# Exercise 5 — Building a Multi-Module Project

🔴 **Advanced** &nbsp; ⏱ 30–40 min

## Background

In practice, larger Java applications often consist of multiple Maven modules. A parent POM with `<packaging>pom</packaging>` acts as the aggregator and dependency manager — it contains no application code of its own.

## Tasks

1. Create a new directory structure with a parent POM and two submodules:

   ```
   multi-module/
   ├── pom.xml              ← Parent (packaging: pom)
   ├── core/
   │   └── pom.xml          ← Module with business logic
   └── app/
       └── pom.xml          ← Module that depends on 'core'
   ```

2. Register both modules in the parent POM under `<modules>` and define the shared Java version as well as Gson as a managed dependency in `<dependencyManagement>`.
3. The `core` module should contain a simple class with a helper method and reference Gson as a dependency — **without** specifying a version (that comes from the parent).
4. The `app` module should declare `core` as a dependency and call the helper method from a `main` method.
5. Run `mvn package` in the root directory. Maven should build both modules in the correct order.
6. **Bonus:** Run the application. For that you have to install the `core` lib in your local maven repo (`mvn install`) and then you can run it via `mvn exec:java -pl app -Dexec.mainClass=com.example.app.Application`)

> [!TIP]
> The order in which Maven builds modules is derived from the dependencies between them — not from the order in `<modules>`.

## Learning Goal

You can set up a multi-module project, understand the role of `<packaging>pom</packaging>`, and know how `<dependencyManagement>` in the parent POM manages versions centrally.
