import org.gradle.api.Plugin
import org.gradle.api.Project

class Main implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.register('generateJacocoReport', JacocoTask) {
            reports {
                xml.enabled = true
                html.enabled = true
            }
        }
    }
}