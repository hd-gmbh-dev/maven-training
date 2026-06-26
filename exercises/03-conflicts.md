# Exercise 3 — Resolving Dependency Conflicts

🟡 **Intermediate** &nbsp; ⏱ 20–25 min

## Background

Starter project: [`03-conflicts-starter`](03-conflicts-starter)

The two added dependencies in the `pom.xml` pulls in the same transitive dependency at different versions.
Maven silently resolves this conflict using the "nearest wins" principle — but not always to the right version.

## Tasks

1. Run `mvn dependency:tree -Dverbose`.
2. Identify the library that appears in two different versions and note which version Maven has chosen.
3. Ensure the newer version is used — you could either use `<exclusions>` or `<dependencyManagement>`. What is the difference between the two approaches?
4. Verify the result again with `mvn dependency:tree -Dverbose`.

> [!TIP]
> `mvn dependency:tree -Dverbose` also shows you the omitted versions and the reason Maven chose a particular one.

## Learning Goal

You understand how transitive dependencies arise, how Maven resolves conflicts, and when to use `<exclusions>` vs. `<dependencyManagement>`.
