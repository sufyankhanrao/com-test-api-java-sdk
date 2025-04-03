
# Schema Container

## Structure

`SchemaContainer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Schema` | `JsonObject` | Required | - | JsonObject getSchema() | setSchema(JsonObject schema) |
| `SchemaArray` | `List<JsonObject>` | Optional | - | List<JsonObject> getSchemaArray() | setSchemaArray(List<JsonObject> schemaArray) |
| `SchemaMap` | `JsonObject` | Optional | - | JsonObject getSchemaMap() | setSchemaMap(JsonObject schemaMap) |

## Example (as JSON)

```json
{
  "name": "a name",
  "id": "definition-123",
  "schema": {
    "key1": "val1",
    "key2": "val2"
  },
  "schemaArray": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "schemaMap": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

