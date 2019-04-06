package in.pabreja.sample.javaagent;

import java.lang.instrument.Instrumentation;


/**
 *
 * add this to build.gradle and create fatJar
 *
 * dependencies {
 *     compileApi 'org.javassist:javassist:3.19+'
 *
 *     jar {
 *         // make a fatjar otherwise it's painful getting the boot-class-path correct when deploying
 *         from { configurations.compile.collect { it.isDirectory() ? it : zipTree(it) } }
 *         manifest {
 *             attributes(
 *                 "Agent-Class": "in.pabreja.sample.javaagent.SimpleAgent",
 *                 "Can-Redefine-Classes": true,
 *                 "Can-Retransform-Classes": true,
 *                 "Boot-Class-Path": "pabreja-sample-agent-" + version + ".jar",
 *                 "Premain-Class": "in.pabreja.sample.javaagent.SimpleAgent")
 *         }
 *     }
 * }
 *
 *
 * another example
 * jar {
 *     archiveName = "${rootProject.name}-${rootProject.version}.jar"
 *     manifest {
 *         attributes(
 *                 'Premain-Class': 'in.pabreja.sample.javaagent.SimpleAgent',
 *                 'Can-Redefine-Classes': 'true',
 *                 'Can-Retransform-Classes': 'true',
 *                 'Can-Set-Native-Method-Prefix': 'true',
 *                 'Implementation-Title': "ClassLogger",
 *                 'Implementation-Version': rootProject.version
 *         )
 *     }
 * }
 *
 * -javaagent:<jar-file>.jar[=arguments]
 *
 * java -javaagent:</path/to/agent>.jar -jar myapp.jar
 */
public class SimpleAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        final SimpleClassTransformer transformer = new SimpleClassTransformer();
        inst.addTransformer(transformer);
    }

    public static void agentmain(String agentArgs, Instrumentation inst){
        premain(agentArgs,inst);
    }
}
