
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Scanner;




import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class XMLFlattening {

	private static JSONObject flatten(JSONObject object, JSONObject flattened){
		if(flattened == null){
			flattened = new JSONObject();
		}
		Iterator<?> keys = object.keys();
		while(keys.hasNext()){
			String key = (String)keys.next();
			try {
				if(object.get(key) instanceof JSONObject){
					flatten(object.getJSONObject(key), flattened);
				} else {
					flattened.put(key, object.get(key));
				}
			} catch(JSONException e){
				
			}
		}
		return flattened;
	}

	public static void main(String[] args) throws JSONException, FileNotFoundException, UnsupportedEncodingException {
		

//		Node node = nodeBuilder().clusterName("elasticsearch").node();
//		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("192.168.1.141", 9300));
//
//		
//		BulkRequestBuilder bulkRequest = client.prepareBulk();
		String index="PUT /alternatevalues/analysis/";
		int id=1;
		JSONObject flattened=null;
		@SuppressWarnings("resource")
		String str = new Scanner(new File("data.xml")).useDelimiter("\\Z").next();
		JSONObject json = XML.toJSONObject(str);
		
		//
		flattened=flatten(json, flattened);
		
		


		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

		if(flattened.get("Document") instanceof JSONArray){
			JSONArray jsonPersonData = flattened.getJSONArray("Document");
			for (int i=0; i<jsonPersonData.length(); i++) {
				JSONObject objects =  jsonPersonData.getJSONObject(i);

				String BatchInstanceIdentifier=flattened.getString("BatchInstanceIdentifier");
				String BatchName=flattened.getString("BatchName");
				String Identifier=objects.get("Identifier").toString();
				String Type=objects.get("Type").toString();
				String confidence=objects.get("Confidence").toString();
				

				String name = null,page = null;
				Integer value = null;
				float documentLevelConfidence=0.0f;

				if(objects.has("DocumentLevelFields")){
					JSONObject object1 =  objects.getJSONObject("DocumentLevelFields");
					if(object1.has("DocumentLevelField")){

						if(object1.getJSONObject("DocumentLevelField").getJSONObject("AlternateValues").get("AlternateValue") instanceof JSONArray){
							JSONArray jsonPersonData1=object1.getJSONObject("DocumentLevelField").getJSONObject("AlternateValues").getJSONArray("AlternateValue");
//							for (int j=0; j<jsonPersonData1.length(); j++) {
//								JSONObject object2 =  jsonPersonData1.getJSONObject(j);
//								if(object2.has("Name"))
//									name=object2.getString("Name");
//								if(object2.has("Value"))
//									value=object2.getInt("Value");
//								if(object2.has("Page"))
//									page=object2.getString("Page");
//								if(object2.has("Confidence"))
//									documentLevelConfidence=object2.getLong("Confidence");
//								//
//								
//									
//								id=id+1;
//							}

						}else{
							JSONObject object2=object1.getJSONObject("DocumentLevelField").getJSONObject("AlternateValues").getJSONObject("AlternateValue");

							if(object2.has("Name"))
								name=object2.getString("Name");
							if(object2.has("Value"))
								value=object2.getInt("Value");
							if(object2.has("Page"))
								page=object2.getString("Page");
							if(object2.has("Confidence"))
								documentLevelConfidence=object2.getLong("Confidence");
							
								
							id=id+1;
						}
					}

				}else{
					
						
					id=id+1;
				}




			}
		}
		writer.close();
//		BulkResponse bulkResponse = bulkRequest.execute().actionGet();
//		if (bulkResponse.hasFailures()) {
//		    
//		}
//		client.close();


	}



}
