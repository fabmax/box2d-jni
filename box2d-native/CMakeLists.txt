cmake_minimum_required(VERSION 3.16)
project(box2d_project)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Platform detection and architecture configuration
if(APPLE)
    # Detect architecture on macOS
    if(CMAKE_OSX_ARCHITECTURES)
        # Use explicitly set architecture
        set(MACOS_ARCH "${CMAKE_OSX_ARCHITECTURES}")
    elseif(CMAKE_SYSTEM_PROCESSOR STREQUAL "arm64" OR CMAKE_SYSTEM_PROCESSOR STREQUAL "aarch64")
        set(MACOS_ARCH "arm64")
        set(CMAKE_OSX_ARCHITECTURES "arm64")
    else()
        set(MACOS_ARCH "x64")
        set(CMAKE_OSX_ARCHITECTURES "x86_64")
    endif()
    message(STATUS "Building for macOS x64")

elseif(WIN32)
    # Detect Windows architecture
    if(CMAKE_GENERATOR_PLATFORM STREQUAL "ARM64" OR CMAKE_SYSTEM_PROCESSOR STREQUAL "ARM64")
        message(STATUS "Building for Windows ARM64")
        set(WIN_ARCH "arm64")
    else()
        message(STATUS "Building for Windows x64")
        set(WIN_ARCH "x64")
    endif()
    message(STATUS "Windows architecture: ${WIN_ARCH}")
    
elseif(UNIX AND NOT APPLE)
    # Detect architecture on Linux
    if(CMAKE_SYSTEM_PROCESSOR STREQUAL "aarch64" OR CMAKE_SYSTEM_PROCESSOR STREQUAL "arm64")
        message(STATUS "Building for Linux ARM64")
        set(LINUX_ARCH "arm64")
    else()
        message(STATUS "Building for Linux x64")
        set(LINUX_ARCH "x64")
    endif()
    message(STATUS "Linux architecture: ${LINUX_ARCH}")
    
else()
    message(STATUS "Building for unknown platform")
endif()

include(FetchContent)

FetchContent_Declare(
    box2d
    GIT_REPOSITORY https://github.com/erincatto/box2d.git
    GIT_TAG        v3.1.1
    GIT_SHALLOW    TRUE
)
FetchContent_MakeAvailable(box2d)

set(JAVA_AWT_LIBRARY NotNeeded)
set(JAVA_JVM_LIBRARY NotNeeded)
set(JAVA_AWT_INCLUDE_PATH NotNeeded)
find_package(JNI REQUIRED)

add_library(Box2dJniBindings SHARED
    src/webidlbindings/jni/box2d.cpp
)

target_include_directories(Box2dJniBindings PRIVATE
    ${JNI_INCLUDE_DIRS}
    src/webidlbindings/jni
    src/webidlbindings
)

target_link_libraries(Box2dJniBindings PRIVATE box2d)

# Set output directory for better organization
if(WIN32)
    set_target_properties(Box2dJniBindings PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/lib/${WIN_ARCH}"
        RUNTIME_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/bin/${WIN_ARCH}"
    )
elseif(APPLE)
    set_target_properties(Box2dJniBindings PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/lib/${MACOS_ARCH}"
        RUNTIME_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/bin/${MACOS_ARCH}"
    )
elseif(UNIX)
    set_target_properties(Box2dJniBindings PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/lib/${LINUX_ARCH}"
        RUNTIME_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/bin/${LINUX_ARCH}"
    )
endif()