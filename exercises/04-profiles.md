# Exercise 4 — Configuring Build Profiles

🟡 **Intermediate** &nbsp; ⏱ 20–25 min

## Background

Starter project: [`demo1/phase4-solution`](../demo1/phase4-solution)

Maven profiles control the **build process**, not the runtime behavior of an application. A typical use case: during development only fast unit tests should run, whereas in CI all tests including slower ones should be executed.

## Tasks

1. Create two JUnit (already available through spring) test classes in the starter project:
   1. one annotated with `@Tag("unit")` (runs fast)  
      and
   2. one with `@Tag("slow")` (simulates a long-running test using `Thread.sleep`).
2. Define two profiles in `pom.xml`:
    - **`ci`**: runs all tests (no filter) — the default for the pipeline
    - **`dev`**: excludes tests tagged with `@Tag("slow")` via `maven-surefire-plugin`
3. Test both profiles: `mvn test -P dev` and `mvn test -P ci`. Which tests run in each case?
4. **Bonus:** Set `dev` as the default profile so that `mvn test` without a `-P` flag automatically runs only the fast tests.

> [!TIP]
> The `maven-surefire-plugin` supports `<excludedGroups>` and `<includedGroups>` to filter by JUnit 5 tags.

## Learning Goal

You understand what Maven profiles are actually useful for, and can configure `maven-surefire-plugin` within a profile.
