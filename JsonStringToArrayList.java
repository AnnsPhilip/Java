import java.lang.reflect.Type;
import java.util.ArrayList;

import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonStringToArrayList {

	public static void main(String[] args) {

		String str = "[\"key1\",\"key2\",\"key3\",\"key4\"]";
		System.out.println("Converted ArrayList in Json: " + method1(str));
	}

	// Convert JsonString to Array List using ObjectMapper()
	public static ArrayList<String> method1(String str) {

		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			arrayList = objectMapper.readValue(str, new TypeReference<ArrayList<String>>() {
			});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return arrayList;

	}

	// Convert JsonString to Array List using Gson()
	public static ArrayList<String> method2(String str) {

		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<String>>() {
		}.getType();
		ArrayList<String> arrayList = gson.fromJson(str, listType);

		return arrayList;

	}

	// Convert JsonString to Array List using JsonArray()
	public static ArrayList<String> method3(String str) {

		ArrayList<String> list = new ArrayList<>();
		JSONArray jsonArray = new JSONArray(str);
		for (int i = 0; i < jsonArray.length(); i++) {
			list.add(jsonArray.getString(i));
		}

		return list;

	}

}
