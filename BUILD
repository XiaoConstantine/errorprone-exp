load("@contrib_rules_jvm//java:defs.bzl", "spotbugs_config")

spotbugs_config(
    name = "spotbugs-config",
    effort = "default",
    exclude_filter = "spotbugs-excludes.xml",
    fail_on_warning = True,
    visibility = [
        "//visibility:public",
    ],
)

java_binary(
    name = "spotbugs_cli",
    testonly = True,
    main_class = "edu.umd.cs.findbugs.LaunchAppropriateUI",
    visibility = [
        "//visibility:public",
    ],
    runtime_deps = [
        "@maven//:com_github_spotbugs_spotbugs"
    ],
)
