import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.cts.bean.Pojoclass;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

public class Maincls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		final String JSON_PATH="C://765758//mapjson.json";
		BufferedReader buff=null;
		StringBuilder sb = new StringBuilder();
		try
		{
			buff= new BufferedReader(new FileReader(JSON_PATH));

		    sb.append("<html>");
		    sb.append("<head>");
		    sb.append("<title>Title Of the page");
		    sb.append("</title>");
		    sb.append("</head>");
		    sb.append("<body> <b>Hello World</b>");


			Type type = new TypeToken<Map<String, Pojoclass>>(){}.getType();
			Map<String,Pojoclass> myMap = gson.fromJson(buff, type);

			if(myMap != null)
			{
				for(String k:myMap.keySet())
				{
					for (Map<String,Pojoclass> l:myMap.get(k))
					{
						System.out.println(" valus : "+ l);
					}
				}
			}


			/*Iterator it = myMap.entrySet().iterator();
		   while (it.hasNext()) {

		        Map.Entry pair = (Map.Entry)it.next();

		        sb.append("<p><b>"+pair.getValue()+"</b></p>");
		        sb.append("<style></style>");
		        sb.append("<div>");
		        it.remove();
		        sb.append("<p>"+pair.getKey()+"</p>");
		        sb.append("</div>");


		    	//System.out.println(myMap.getObject());
		      //Review data = gson.fromJson(buff, Review.class);
				//Pojoclass pj= gson.fromJson(buff, Pojoclass.class);
				//Map<String,Pojoclass> pj= gson.fromJson(new TypeToken<Map<String, Pojoclass>>(){}.getType(), Pojoclass.class);
		     // String objname=(String) pair.getValue();
		        //System.out.println(objname);
		    } */


		}
		finally
		{
			//System.out.println("error");


		    sb.append("</body>");
		    sb.append("</html>");
		    FileWriter fstream = new FileWriter("D://Development_Avecto//Template.html");
		    BufferedWriter out = new BufferedWriter(fstream);
		    out.write(sb.toString());
		    out.close();

		    System.out.println("written");
		}
	}

}
