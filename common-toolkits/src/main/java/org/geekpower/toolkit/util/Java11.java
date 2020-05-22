package org.geekpower.toolkit.util;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.List;

public class Java11 {

    public static void main(String[] args) {
        
        var a = "123";
        int l = a.length();
        a.strip();
        a.trim();
        List<Integer> asList = Arrays.asList(1);
        List<Integer> of = List.of(1);
        System.out.println(a);
        System.out.println(l);
        
        
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://javastack.cn"))
                .GET()
                .build();
        
    }
    
}
