package org.example;

import java.io.IOException;
import org.apache.http.client.fluent.Request;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = Request.Get("http://example.com")
                .execute()
                .returnContent()
                .asString();
        System.out.println(content);

        Log log = LogFactory.getLog("My log");
        log.info("Log this, please.");
    }
}


//
//import java.io.IOException;
//import org.apache.http.client.fluent.Request;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String content = Request.Get("http://example.com")
//                .execute()
//                .returnContent()
//                .asString();
//        System.out.println(content);
//    }
//}
