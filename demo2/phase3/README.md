# Live Demo 2 - Phase 3: Provoke and resolve a version conflict

This demo is not related to the previous demo project because Spring Boot provides `<dependencyManagement>` via BOM.

## Added conflicting dependency:

```xml
<dependency>
   <groupId>org.apache.commons</groupId>
   <artifactId>commons-text</artifactId>
   <version>1.6</version>
   <!-- transitive dependency: commons-lang3 -->
   <!-- on version 3.8.1 -->
</dependency>

<dependency>
   <groupId>org.apache.commons</groupId>
   <artifactId>commons-compress</artifactId>
   <version>1.28.0</version>
   <!-- transitive dependency: commons-lang3 -->
   <!-- on version 3.18.0 -->
</dependency>
```

## Compile and run tests:

```shell
$ mvn test
# ❌ cannot find symbol - introduced in 3.12.0
# maven picks 3.8.1 because "nearest wins"
```

## Verify:

```shell
$ mvn dependency:tree -Dverbose
```
```terminaloutput
# ...
[INFO] com.example:demo2-phase3:jar:0.0.1-SNAPSHOT
[INFO] +- org.apache.commons:commons-text:jar:1.6:compile
[INFO] |  \- org.apache.commons:commons-lang3:jar:3.8.1:compile
[INFO] +- org.apache.commons:commons-compress:jar:1.28.0:compile
[INFO] |  +- commons-codec:commons-codec:jar:1.19.0:compile
[INFO] |  +- commons-io:commons-io:jar:2.20.0:compile
[INFO] |  \- (org.apache.commons:commons-lang3:jar:3.18.0:compile - omitted for conflict with 3.8.1)
# ...
```

## Resolve:

### Solution A: Add an `<exclusion>`

```xml
<dependency>
   <groupId>org.apache.commons</groupId>
   <artifactId>commons-text</artifactId>
   <version>1.6</version>
   <exclusions>
      <exclusion>
         <groupId>org.apache.commons</groupId>
         <artifactId>commons-lang3</artifactId>
      </exclusion>
   </exclusions>
</dependency>
```

### Solution B: Add `<depenencyManagement>`

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.18.0</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```
