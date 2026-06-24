# Live Demo 1 - Phase 3: mvn archetype:generate

This project was created by:

```shell
$ mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5
```
```terminaloutput
...
Define value for property 'groupId': com.example
Define value for property 'artifactId': phase3
Define value for property 'version' 1.0-SNAPSHOT: 
Define value for property 'package' com.example: 
...
```

## Compile and run:

```shell
$ mvn package && java -cp target/phase3-1.0-SNAPSHOT.jar com.example.App
```
