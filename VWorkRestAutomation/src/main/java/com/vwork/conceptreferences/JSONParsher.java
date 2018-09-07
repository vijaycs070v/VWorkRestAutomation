package com.vwork.conceptreferences;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParsher {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser=new JSONParser();
		JSONObject jsonobject = (JSONObject) parser.parse(new FileReader("./src/main/java/com/vwork/Json/EmpDetails.json"));
		System.out.println(jsonobject);
		System.out.println(jsonobject.get("account"));
		
		JSONObject persionaldetails=(JSONObject) jsonobject.get("persionaldetails");
		System.out.println(persionaldetails.get("firstname"));
		System.out.println(persionaldetails.get("lastname"));
		
		
		JSONArray skils=(JSONArray) jsonobject.get("skils");
		System.out.println(skils);
		System.out.println(skils.get(0)); //
		
		JSONArray mobiles=(JSONArray) jsonobject.get("mobiles");
		JSONObject mobiles0=(JSONObject) mobiles.get(0);
		System.out.println(mobiles0.get("operator"));
		System.out.println(mobiles0.get("mob"));
		
		
		
	}

}
