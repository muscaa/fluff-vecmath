# Fluff Math

[![](https://jitpack.io/v/muscaa/fluff-math.svg)](https://jitpack.io/#muscaa/fluff-math) [![License: Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Description

A simple math library.<br>
**Notice**: Not a finished product.

### Features

- Vectors
- Matrices
- Geometry

## Usage

To integrate it into your project, add the following dependency:

**Gradle**
```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation "com.github.muscaa:fluff-math:VERSION"
}
```
**Maven**
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.muscaa</groupId>
        <artifactId>fluff-math</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```
Replace `VERSION` with the latest release available on [JitPack](https://jitpack.io/#muscaa/fluff-math).

## Examples

```java
Vec2i vec1 = new Vec2i(2, 3); // 2D int vector
Vec2i vec2 = new Vec2i(3, 4);
vec1.add(vec2);

System.out.println(vec1); // (5, 7)

Mat2d mat1 = new Mat2d(new double[][] { // 2D double matrix
    {
        1.0,  1.0,  1.0
    },
    {
        2.0,  2.0,  2.0
    }
});
Mat2d mat2 = new Mat2d(new double[][] {
    {
        1.0,  2.0
    },
    {
        1.0,  2.0
    },
    {
        1.0,  2.0
    }
});
mat1.multiply(mat2);

System.out.println(mat1); // [(3.0, 6.0), (6.0, 12.0)]
```
