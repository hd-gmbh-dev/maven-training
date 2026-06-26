# Exercise 3 — Resolving Dependency Conflicts

```shell
$ mvn dependency:tree -Dverbose
```

You will see the following output:

```
[INFO] com.example:exercise-03-conflicts:jar:0.0.1-SNAPSHOT
[INFO] +- org.apache.commons:commons-text:jar:1.6:compile
[INFO] |  \- org.apache.commons:commons-lang3:jar:3.8.1:compile
[INFO] \- org.apache.commons:commons-compress:jar:1.28.0:compile
[INFO]    +- commons-codec:commons-codec:jar:1.19.0:compile
[INFO]    +- commons-io:commons-io:jar:2.20.0:compile
[INFO]    \- (org.apache.commons:commons-lang3:jar:3.18.0:compile - omitted for conflict with 3.8.1)
```

Here you can see that `commons-lang3` is requested in version 3.8.1 by `commons-text:1.6` and in version `3.18.0` by `commons-compress:1.28.0`.
Neares wins – so maven uses `3.8.1`.

To resolve it, the `dependencyManagement` section was inserted in the `pom.xml`. No version conflict anymore!

Run `mvn dependency:tree -Dverbose` again and you will see this:

```
[INFO] com.example:exercise-03-conflicts:jar:0.0.1-SNAPSHOT
[INFO] +- org.apache.commons:commons-text:jar:1.6:compile
[INFO] |  \- org.apache.commons:commons-lang3:jar:3.20.0:compile (version managed from 3.8.1)
[INFO] \- org.apache.commons:commons-compress:jar:1.28.0:compile
[INFO]    +- commons-codec:commons-codec:jar:1.19.0:compile
[INFO]    +- commons-io:commons-io:jar:2.20.0:compile
[INFO]    \- (org.apache.commons:commons-lang3:jar:3.20.0:compile - version managed from 3.18.0; omitted for duplicate)
```
