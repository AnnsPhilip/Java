import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StringJsonToMap {

	public static void main(String[] args) {

		String jsonString = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
		System.out.println("Converted Map: " + method1(jsonString));
		
		Gson gson = new Gson();
		
		System.out.println("Converted Map in Json: " + gson.toJson(method1(jsonString)));
	}

	// Convert JsonString to Map using for loop
	public static Map<String, String> method1(String jsonString) {
		JSONObject jsonObject = new JSONObject(jsonString);
		Map<String, String> map = new HashMap<>();

		for (String key : jsonObject.keySet()) {
			map.put(key, jsonObject.getString(key));
		}

		return map;
	}

	// Convert JsonString to Map using Gson()
	public static Map<String, String> method2(String jsonString) {
		Gson gson = new Gson();
		Type type = new TypeToken<Map<String, String>>() {
		}.getType();
		Map<String, String> map = gson.fromJson(jsonString, type);

		return map;
	}

	// Convert JsonString to Map using ObjectMapper()
	public static Map<String, String> method3(String jsonString) {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		try {
			map = objectMapper.readValue(jsonString, new TypeReference<Map<String, String>>() {
			});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return map;
	}

}
