package com.instawork.in.Utility;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;

public class Utility {

    private File jsonFile;
    public String fileName;

    public Utility(String fileName){
        this.fileName =fileName;
    }
    public String getTestData(String data) throws IOException{

        jsonFile = new File(fileName);
        return JsonPath.read(jsonFile,"$."+data);


    }


}
