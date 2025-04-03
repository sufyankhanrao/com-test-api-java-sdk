# Json Obj

```java
JsonObjController jsonObjController = client.getJsonObjController();
```

## Class Name

`JsonObjController`

## Methods

* [Send Schemain Model](../../doc/controllers/json-obj.md#send-schemain-model)
* [Send Schemaas Body](../../doc/controllers/json-obj.md#send-schemaas-body)
* [Send Schemaas Form](../../doc/controllers/json-obj.md#send-schemaas-form)
* [Send Schemaas Query](../../doc/controllers/json-obj.md#send-schemaas-query)
* [Get Schema](../../doc/controllers/json-obj.md#get-schema)
* [Get Schema Array](../../doc/controllers/json-obj.md#get-schema-array)
* [Get Schema Map](../../doc/controllers/json-obj.md#get-schema-map)
* [Get Schemain Model](../../doc/controllers/json-obj.md#get-schemain-model)


# Send Schemain Model

Send Schema in Model

```java
CompletableFuture<ServerResponse> sendSchemainModelAsync(
    final SchemaContainer body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SchemaContainer`](../../doc/models/schema-container.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SchemaContainer body = new SchemaContainer.Builder(
    "a name",
    "definition-123",
    JsonObject.fromJsonString("{\"key1\":\"val1\",\"key2\":\"val2\"}")
)
.build();

jsonObjController.sendSchemainModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Schemaas Body

Send Schema as Body

```java
CompletableFuture<ServerResponse> sendSchemaasBodyAsync(
    final JsonObject body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `JsonObject` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
JsonObject body = JsonObject.fromJsonString("{\"key1\":\"val1\",\"key2\":\"val2\"}");

jsonObjController.sendSchemaasBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Schemaas Form

Send Schema as Form

```java
CompletableFuture<ServerResponse> sendSchemaasFormAsync(
    final SendSchemaasFormInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contentType` | [`ContentTypeEnum`](../../doc/models/content-type-enum.md) | Header, Required | - |
| `id` | `int` | Form, Required | - |
| `model` | `JsonObject` | Form, Required | - |
| `modelArray` | `List<JsonObject>` | Form, Optional | - |
| `modelMap` | `JsonObject` | Form, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendSchemaasFormInput sendSchemaasFormInput = new SendSchemaasFormInput.Builder(
    ContentTypeEnum.ENUM_APPLICATIONXWWWFORMURLENCODED,
    112,
    JsonObject.fromJsonString("{\"key1\":\"val1\",\"key2\":\"val2\"}")
)
.build();

jsonObjController.sendSchemaasFormAsync(sendSchemaasFormInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Schemaas Query

Send Schema as Query

```java
CompletableFuture<ServerResponse> sendSchemaasQueryAsync(
    final SendSchemaasQueryInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Query, Required | - |
| `model` | `JsonObject` | Query, Required | - |
| `modelArray` | `List<JsonObject>` | Query, Optional | - |
| `modelMap` | `JsonObject` | Query, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendSchemaasQueryInput sendSchemaasQueryInput = new SendSchemaasQueryInput.Builder(
    112,
    JsonObject.fromJsonString("{\"key1\":\"val1\",\"key2\":\"val2\"}")
)
.build();

jsonObjController.sendSchemaasQueryAsync(sendSchemaasQueryInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Schema

Get Schema

```java
CompletableFuture<JsonObject> getSchemaAsync()
```

## Response Type

`JsonObject`

## Example Usage

```java
jsonObjController.getSchemaAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Schema Array

Get Schema Array

```java
CompletableFuture<List<JsonObject>> getSchemaArrayAsync()
```

## Response Type

`List<JsonObject>`

## Example Usage

```java
jsonObjController.getSchemaArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Schema Map

Get Schema Map

```java
CompletableFuture<JsonObject> getSchemaMapAsync()
```

## Response Type

`JsonObject`

## Example Usage

```java
jsonObjController.getSchemaMapAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Schemain Model

Get Schema in Model

```java
CompletableFuture<SchemaContainer> getSchemainModelAsync()
```

## Response Type

[`SchemaContainer`](../../doc/models/schema-container.md)

## Example Usage

```java
jsonObjController.getSchemainModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

