java_plugin(
    name = "p",
    srcs = ["FooBarChecker.java"],
    deps = [
        "@maven//:com_google_auto_service_auto_service",
        "@maven//:com_google_auto_service_auto_service_annotations",
        "@maven//:com_google_errorprone_error_prone_annotation",
        "@maven//:com_google_errorprone_error_prone_check_api",
    ],
)

java_library(
    name = "m",
    srcs = ["Main.java"],
    visibility = ["//visibility:public"],
    plugins = [
        ":p",
    ],
)

java_binary(
    name = "app",
    main_class = "Main",
    runtime_deps = [
        ":m",
    ],
)
