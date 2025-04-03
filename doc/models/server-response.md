
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Passed` | `boolean` | Required | - | boolean getPassed() | setPassed(boolean passed) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `Input` | `JsonObject` | Optional | - | JsonObject getInput() | setInput(JsonObject input) |
| `NullableNumberMap` | `Map<String, Double>` | Optional | - | Map<String, Double> getNullableNumberMap() | setNullableNumberMap(Map<String, Double> nullableNumberMap) |
| `NullableNumberArray` | `List<Double>` | Optional | - | List<Double> getNullableNumberArray() | setNullableNumberArray(List<Double> nullableNumberArray) |

## Example (as JSON)

```json
{
  "passed": false,
  "Message": "Message6",
  "input": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "nullableNumberMap": {
    "key0": 117.45,
    "key1": 117.46
  },
  "nullableNumberArray": [
    216.38,
    216.39,
    216.4
  ]
}
```

