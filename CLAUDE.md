# Claude Code Configuration

This file contains configuration and context for Claude Code to help with development tasks.

## Project Information
- **Project**: Box2D Wrappers
- **Languages**: C++, Java, Kotlin
- **Build Systems**: CMake, Gradle
- **Sub-projects**:
  - box2d-native: CMake project providing C++ bindings for Box2D
  - box2d-jni: Gradle project which uses box2d-native to provide Java bindings for Box2D

## Notes
- This is a Box2D physics engine wrapper project
- Uses CMake for native build configuration
- Uses Gradle for Java build configuration
- `box2d-native/src/webidlbindings` contains C++ code which wraps the Box2D C API
  - The documentation of the original Box2D functions is copied over to the C++ wrappers
- `box2d-native/src/webidl` contains the WebIDL files used to generate the bindings
- Bindings are described in WebIDL which is then used to generate appropriate Java / C++ bindings

## WebIDL syntax rules
- Non-primitive value parameters have a [Value] decorator before the type
- Reference parameters have a [Ref] decorator before the type
- Functions returning a non-primitive value also have a [Value] decorator in front of them (as the very first part of
  the signature)
- Native functions that are difficult to map (e.g. because they take pointers to arrays) should be included in the
  idl file but commented out