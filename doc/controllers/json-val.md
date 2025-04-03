# Json Val

```java
JsonValController jsonValController = client.getJsonValController();
```

## Class Name

`JsonValController`

## Methods

* [Send Valuein Model](../../doc/controllers/json-val.md#send-valuein-model)
* [Send Valueas Body](../../doc/controllers/json-val.md#send-valueas-body)
* [Send Valueas Form](../../doc/controllers/json-val.md#send-valueas-form)
* [Send Valueas Query](../../doc/controllers/json-val.md#send-valueas-query)
* [Get Value](../../doc/controllers/json-val.md#get-value)
* [Get Value Array](../../doc/controllers/json-val.md#get-value-array)
* [Get Value Map](../../doc/controllers/json-val.md#get-value-map)
* [Get Valuein Model](../../doc/controllers/json-val.md#get-valuein-model)


# Send Valuein Model

Send Value in Model

```java
CompletableFuture<ServerResponse> sendValueinModelAsync(
    final ValueContainer body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ValueContainer`](../../doc/models/value-container.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ValueContainer body = new ValueContainer.Builder(
    "a name",
    "definition-123",
    ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class)
)
.build();

jsonValController.sendValueinModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Valueas Body

Send Value as Body

```java
CompletableFuture<ServerResponse> sendValueasBodyAsync(
    final JsonValue body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `JsonValue` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
JsonValue body = ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class);

jsonValController.sendValueasBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Valueas Form

Send Value as Form

```java
CompletableFuture<ServerResponse> sendValueasFormAsync(
    final SendValueasFormInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contentType` | [`ContentTypeEnum`](../../doc/models/content-type-enum.md) | Header, Required | - |
| `id` | `int` | Form, Required | - |
| `model` | `JsonValue` | Form, Required | - |
| `modelArray` | `List<JsonValue>` | Form, Optional | - |
| `modelMap` | `JsonValue` | Form, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendValueasFormInput sendValueasFormInput = new SendValueasFormInput.Builder(
    ContentTypeEnum.ENUM_APPLICATIONXWWWFORMURLENCODED,
    112,
    ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class)
)
.build();

jsonValController.sendValueasFormAsync(sendValueasFormInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Valueas Query

Send Value as Query

```java
CompletableFuture<ServerResponse> sendValueasQueryAsync(
    final SendValueasQueryInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Query, Required | - |
| `model` | `JsonValue` | Query, Required | - |
| `modelArray` | `List<JsonValue>` | Query, Optional | - |
| `modelMap` | `JsonValue` | Query, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendValueasQueryInput sendValueasQueryInput = new SendValueasQueryInput.Builder(
    112,
    ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class)
)
.build();

jsonValController.sendValueasQueryAsync(sendValueasQueryInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Value

Get Value

```java
CompletableFuture<JsonValue> getValueAsync()
```

## Response Type

`JsonValue`

## Example Usage

```java
jsonValController.getValueAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Value Array

Get Value Array

```java
CompletableFuture<List<JsonValue>> getValueArrayAsync()
```

## Response Type

`List<JsonValue>`

## Example Usage

```java
jsonValController.getValueArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Value Map

Get Value Map

```java
CompletableFuture<JsonValue> getValueMapAsync()
```

## Response Type

`JsonValue`

## Example Usage

```java
jsonValController.getValueMapAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Valuein Model

Get Value in Model

```java
CompletableFuture<ValueContainer> getValueinModelAsync()
```

## Response Type

[`ValueContainer`](../../doc/models/value-container.md)

## Example Usage

```java
jsonValController.getValueinModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

