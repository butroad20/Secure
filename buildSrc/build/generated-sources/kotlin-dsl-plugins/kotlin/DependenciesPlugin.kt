/**
 * Precompiled [dependencies.gradle.kts][Dependencies_gradle] script plugin.
 *
 * @see Dependencies_gradle
 */
class DependenciesPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Dependencies_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java)
                .newInstance(target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
