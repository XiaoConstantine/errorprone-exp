load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ------------------------------
# Buidifier definition
# ------------------------------
# buildifier is written in Go and hence needs rules_go to be built.
# See https://github.com/bazelbuild/rules_go for the up to date setup instructions.
http_archive(
    name = "bazel_skylib",
    sha256 = "58f558d04a936cade1d4744d12661317e51f6a21e3dd7c50b96dc14f3fa3b87d",
    strip_prefix = "bazel-skylib-df3c9e2735f02a7fe8cd80db4db00fec8e13d25f",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/archive/df3c9e2735f02a7fe8cd80db4db00fec8e13d25f.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "56d8c5a5c91e1af73eca71a6fab2ced959b67c86d12ba37feedb0a2dfea441a6",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.37.0/rules_go-v0.37.0.zip",
        "https://github.com/bazelbuild/rules_go/releases/download/v0.37.0/rules_go-v0.37.0.zip",
    ],
)
load("@io_bazel_rules_go//go:deps.bzl", "go_rules_dependencies")

go_rules_dependencies()

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains")

go_register_toolchains(version = "1.19")


http_archive(
    name = "bazel_gazelle",
    sha256 = "448e37e0dbf61d6fa8f00aaa12d191745e14f07c31cabfa731f0c8e8a4f41b97",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.28.0/bazel-gazelle-v0.28.0.tar.gz",
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.28.0/bazel-gazelle-v0.28.0.tar.gz",
    ],
)

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")


http_archive(
    name = "com_google_protobuf",
    sha256 = "3bd7828aa5af4b13b99c191e8b1e884ebfa9ad371b0ce264605d347f135d2568",
    strip_prefix = "protobuf-3.19.4",
    urls = [
        "https://github.com/protocolbuffers/protobuf/archive/v3.19.4.tar.gz",
    ],
)

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "ae34c344514e08c23e90da0e2d6cb700fcd28e80c02e23e4d5715dddcb42f7b3",
    strip_prefix = "buildtools-4.2.2",
    urls = [
        "https://github.com/bazelbuild/buildtools/archive/refs/tags/4.2.2.tar.gz",
    ],
)
# ---------------------------------------
# Java definition
# ---------------------------------------

RULES_JVM_EXTERNAL_TAG = "4.2"
RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

# Force a sufficiently new copy of @platforms, see https://github.com/bazelbuild/bazel/issues/15175 and
# https://github.com/google/jax/issues/10132. When our transitive dependencies aren't pulling in an
# old version, we can remove this (the current hypothesis is that the cause is in TFRT).
http_archive(
    name = "platforms",
    sha256 = "379113459b0feaf6bfbb584a91874c065078aa673222846ac765f86661c27407",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/platforms/releases/download/0.0.5/platforms-0.0.5.tar.gz",
        "https://github.com/bazelbuild/platforms/releases/download/0.0.5/platforms-0.0.5.tar.gz",
    ],
)

local_repository(
    name = "a",
    path = "/Users/xiao/development/github.com/XiaoConstantine/gazelle-ext"
    #branch = "main",
    #remote = "https://github.com/XiaoConstantine/gazelle-ext.git"
)

load("@a//:go.bzl", "deps")
deps()
#git_repository(
    #name = "a",
    #branch = "main",
    #remote = "https://github.com/XiaoConstantine/gazelle-ext.git"
#)
#load("@a//:go.bzl", "deps")
#deps()


# If you use WORKSPACE.bazel, use the following line instead of the bare gazelle_dependencies():
# gazelle_dependencies(go_repository_default_config = "@//:WORKSPACE.bazel")
gazelle_dependencies()


# Java 17 JVM Definitions
# TODO: Move to third_party/
#load("@rules_jvm_external//:defs.bzl", "maven_install")
#load("@rules_jvm_external//:specs.bzl", "maven")

#maven_install(
    #artifacts = [
        #"org.apache.lucene:lucene-analyzers-common:8.11.2",
        #"org.apache.lucene:lucene-backward-codecs:9.3.0",
        #"org.apache.lucene:lucene-core:9.3.0",
        #"org.apache.lucene:lucene-facet:9.3.0",
        #"org.apache.lucene:lucene-grouping:9.3.0",
        #"org.apache.lucene:lucene-highlighter:9.3.0",
        #"org.apache.lucene:lucene-join:9.3.0",
        #"org.apache.lucene:lucene-memory:9.3.0",
        #"org.apache.lucene:lucene-misc:9.3.0",
        #"org.apache.lucene:lucene-queries:9.3.0",
        #"org.apache.lucene:lucene-queryparser:9.3.0",
        #"org.apache.lucene:lucene-replicator:9.3.0",
        #"org.apache.lucene:lucene-sandbox:9.3.0",
        #"org.apache.lucene:lucene-spatial:8.4.1",
        #"org.apache.lucene:lucene-spatial3d:9.3.0",
        #"org.apache.lucene:lucene-spatial-extras:9.3.0",
        #"org.apache.lucene:lucene-suggest:9.3.0",
        #"com.google.guava:guava:31.1-jre",
        #"com.google.inject:guice:5.1.0",
        #"com.fasterxml.jackson.core:jackson-databind:2.13.3",
        #"com.fasterxml.jackson.core:jackson-core:2.13.3",
        #"com.fasterxml.jackson.core:jackson-annotations:2.13.3",
        #"org.slf4j:slf4j-api:1.7.30",
        #"org.slf4j:slf4j-jdk14:1.7.9",
    #],
    #maven_install_json = "//:maven_install.json",
    #repositories = [
        ##"https://maven.google.com",
        #"https://repo1.maven.org/maven2",
    #],
#)


#load("@maven//:defs.bzl", "pinned_maven_install")
#pinned_maven_install()
