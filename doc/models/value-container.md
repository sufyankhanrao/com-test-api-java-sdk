
# Value Container

## Structure

`ValueContainer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Value` | `JsonValue` | Required | - | JsonValue getValue() | setValue(JsonValue value) |
| `ValueArray` | `List<JsonValue>` | Optional | - | List<JsonValue> getValueArray() | setValueArray(List<JsonValue> valueArray) |
| `ValueMap` | `JsonValue` | Optional | - | JsonValue getValueMap() | setValueMap(JsonValue valueMap) |

## Example (as JSON)

```json
{
  "name": "a name",
  "id": "definition-123",
  "value": {
    "key1": "val1",
    "key2": "val2"
  },
  "valueArray": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "valueMap": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

