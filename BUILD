java_library(
    name = "m",
    javacopts=[
        "-XepPatchChecks:DeadException",
        "-XepPatchLocation:IN_PLACE",
    ],
    srcs = glob(["*.java"]),
)

java_binary(
    name = 'app',
    main_class = "Main",
    runtime_deps = [
        ":m"
    ],
)
