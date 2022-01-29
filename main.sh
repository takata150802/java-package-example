#!/bin/bash
set -eux


docker run \
    --rm \
    -i \
    -v /:/host \
    --workdir /host/$(pwd) \
    openjdk \
    /bin/bash << EOF
    set -x
    javac -d . ExamplePackage.java
    javac ExamplePackage.java
    javac Main.java
    java Main
    exit
EOF

exit
