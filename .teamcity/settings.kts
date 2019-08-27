import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script

version = "2019.1"

project {
    sequence {
        build(BuildA)
        parallel {
            sequence {
                build(BuildB)
                build(BuildC)
            }
            sequence {
                build(BuildD)
                parallel {
                    build(BuildE)
                    build(BuildF)
                }
                build(BuildG)
            }
            build(BuildH)
        }
        build(BuildI)
        parallel {
            build(BuildJ)
            build(BuildK)
        }
        build(BuildL)
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

object BuildE : BuildType({
    name = "E"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildF : BuildType({
    name = "F"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildG : BuildType({
    name = "G"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildH : BuildType({
    name = "H"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildI : BuildType({
    name = "I"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildJ : BuildType({
    name = "J"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildK : BuildType({
    name = "K"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})

object BuildL : BuildType({
    name = "L"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})