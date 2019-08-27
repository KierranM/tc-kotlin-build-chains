import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script

version = "2019.1"

project {
    sequence {
        build(BuildA)
        parallel {
            build(BuildB)
            build(BuildC)
        }
        build(BuildD)
    }
}

object BuildA : BuildType({
    name = "A"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildB : BuildType({
    name = "B"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})


object BuildC : BuildType({
    name = "C"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildD : BuildType({
    name = "D"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})