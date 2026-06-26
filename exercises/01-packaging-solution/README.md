# Exercise 1 — Understanding Packaging

```shell
$ cd ../../demo1/phase4-solution
$ mvn package
$ ls -la target
```

You should see a `demo1-phase4-0.0.1-SNAPSHOT.jar` in the list.
No `war`, `ear`, etc. because `jar` is the default and there is not `<packaging>` in the `pom.xml`.
