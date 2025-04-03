
# Getting Started with JsonValueTester

## Introduction

Testing APIMatic META file

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.test.api</groupId>
  <artifactId>test-api</artifactId>
  <version>0.0.1</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/com.test.api/test-api/0.0.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project JsonValueTesterLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |

The API client can be initialized as follows:

```java
JsonValueTesterClient client = new JsonValueTesterClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.TESTING)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## List of APIs

* [Json Obj](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/controllers/json-obj.md)
* [Json Val](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/controllers/json-val.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/headers.md)
* [ApiException](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sufyankhanrao/com-test-api-java-sdk/tree/0.0.1/doc/http-client-configuration-builder.md)

