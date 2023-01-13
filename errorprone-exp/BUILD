java_library(
    name = "m",
    javacopts=[
        "-XepPatchChecks:DeadException",
        "-XepPatchLocation:IN_PLACE"
    ],
    srcs = glob(["Main.java"]),
)

java_library(
    name = "bug_checker",
    srcs = glob(["BugChecker.java"]),
    deps = [
        
    ]
)

java_binary(
    name = 'app',
    main_class = "Main",
    runtime_deps = [
        ":m"
    ],
)
