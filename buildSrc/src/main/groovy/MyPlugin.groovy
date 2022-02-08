import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("tiger") {
            doLast {
                println "Happy Tiger Year"
            }
        }
    }
}
