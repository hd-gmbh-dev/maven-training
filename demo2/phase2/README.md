# Live Demo 2 - Phase 2: Inspect the dependency tree

We can just execute the commands below in the project at [demo2/phase1](../phase1-solution).

```shell
$ cd ../phase1-solution
$ mvn dependency:tree
```
```terminaloutput
...
[INFO] --- dependency:3.9.0:tree (default-cli) @ demo2-phase1 ---
[INFO] com.example:demo2-phase1:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter:jar:4.0.5:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-logging:jar:4.0.5:compile
[INFO] |  |  +- ch.qos.logback:logback-classic:jar:1.5.32:compile
[INFO] |  |  |  \- ch.qos.logback:logback-core:jar:1.5.32:compile
...
```

```shell
$ cd ../phase1-solution
$ mvn dependency:tree -Dverbose
```
```terminaloutput
...
[INFO] com.example:demo2-phase1:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter:jar:4.0.5:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-logging:jar:4.0.5:compile (version managed from 4.0.5)
[INFO] |  |  +- ch.qos.logback:logback-classic:jar:1.5.32:compile (version managed from 1.5.32)
[INFO] |  |  |  +- ch.qos.logback:logback-core:jar:1.5.32:compile (version managed from 1.5.32)
...
```

In IntelliJ IDEA open the [pom.xml](../phase1-solution/pom.xml) and hit `Ctrl`+`Alt`+`Shift`+`U` on 
Windows/Linux or `⌘`+`⌥`+`Shift`+`U` on Mac to show the dependency diagram.
