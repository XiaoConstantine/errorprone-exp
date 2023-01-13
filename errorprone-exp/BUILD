java_library(
    name = "m",
    srcs = glob(["Main.java"]),
    javacopts = [
        "-XepPatchChecks:DeadException",
        "-XepPatchLocation:IN_PLACE",
    ],
)

java_library(
    name = "bug_checker",
    srcs = glob(["FooBarChecker.java"]),
    deps = [
        "@maven//:com_google_auto_service_auto_service",
        "@maven//:com_google_auto_service_auto_service_annotations",
        "@maven//:com_google_errorprone_error_prone_annotation",
        "@maven//:com_google_errorprone_error_prone_check_api",
    ],
)

java_binary(
    name = "app",
    main_class = "Main",
    runtime_deps = [
        ":m",
        ":bug_checker"
    ],
)
