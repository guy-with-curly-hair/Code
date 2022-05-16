package arcesium;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class HttpUrlJsonparsing1 {


     public static  void main ( String[] args)
     {
          String sURL = "https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users";
            String srcOutput = getApiData(sURL);
         Contact[] c=  mapHoldingToResponse(srcOutput);
         List<String> ll =Arrays.asList(new String[] {"address.city", "IN","Mumbai,Kolkata"});
         getFinalOutput(c,ll);
          }

    public static Contact[] mapHoldingToResponse(String holdingResponse){
        try{
        Gson gson = new GsonBuilder().create();
        Contact[] r = gson.fromJson(holdingResponse , Contact[].class);
           return r;
        }catch(Exception ex){
           System.out.println("error in holding gson parding =["+ex+"]");
        }
        return null;
    }

    public static void getFinalOutput(Contact[] contacts, List<String> input)
    {

        String matcher = input.get(0);
        String operand = input.get(1);
        String[] value = input.get(2).split(",");
        List<Integer> output = new ArrayList<>();

        for ( String v : value)
        {
            matcher(contacts, output, v, matcher);
        }
            if(output.isEmpty() )
                System.out.println("-1");
    else
        System.out.println(output.stream().map( i -> String.valueOf(i)).collect(Collectors.joining(",")));

    }

    public static void matcher(Contact[] contacts, List<Integer> out, String value, String matcher)
    {
        for ( Contact c : contacts)
        {
            if ( matcher == "id" && c.getId().equals(Integer.valueOf(value)))
                out.add(c.getId());
            if ( matcher == "username" && c.getUsername().equals( value))
                out.add(c.getId());
            if ( matcher == "name" && c.getName().equals(value))
                out.add(c.getId());
            if ( matcher == "email" && c.getEmail().equals(value))
                out.add(c.getId());
            if ( matcher == "website" && c.getWebsite().equals(value))
                out.add(c.getId());
            if ( matcher == "company.name" && c.getCompany().getName().equals(value))
                out.add(c.getId());
            if ( matcher == "company.basename" && c.getCompany().getBasename().equals(value))
                out.add(c.getId());
            if ( matcher == "address.street" && c.getAddress().getStreet().equals(value))
                out.add(c.getId());
            if ( matcher == "address.suite" && c.getAddress().getSuite().equals(value))
                out.add(c.getId());
            if ( matcher == "address.city" && c.getAddress().getCity().equals(value))
                out.add(c.getId());
            if ( matcher == "address.zipcode" && c.getAddress().getZipcode().equals(value))
                out.add(c.getId());
            if ( matcher == "address.geo.lat" && c.getAddress().getGloc().getLat() == Long.valueOf(value))
                out.add(c.getId());
            if ( matcher == "address.geo.lng" && c.getAddress().getGloc().getLng() == Long.valueOf(value))
                out.add(c.getId());
        }

    }

    public static String getApiData(String urll){
        try{
        URL url = new URL(urll);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();
        String inline ="";
        Scanner scanner = new Scanner(url.openStream());
        while(scanner.hasNext()){
            inline+= scanner.nextLine();
        }
        scanner.close();
        return inline;
        
        }catch(Exception e){
            System.out.println("exception code ="+e);
        }
        return "";
    }

}


