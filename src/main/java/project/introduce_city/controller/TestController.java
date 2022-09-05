package project.introduce_city.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@RestController
public class TestController {
    @GetMapping("/api")
        public String callApi() throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/4510000/GetTourService"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=K9Mb1iwYHt9NcuHrBjC4SvhpI7vC2ws7UF3vpH4j5QPhHXb2XQiot4qqF6gbE3oPQ0KI%2F1H1zamvYDA7p%2Bqj8w%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageIndex","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("firstIndex","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON) Default : XML*/
        urlBuilder.append("&" + URLEncoder.encode("themecode","UTF-8") + "=" + URLEncoder.encode("1064", "UTF-8")); /*1064 : 섬 1065 : 해수욕장 1066 : 항구 1067 : 산/계곡 1068 : 호수 1069 : 축제 1070 : 체험/마을 1071 : 휴양/공원 1072 : 박물관 1073 : 보물/사적 1074 : 천연기념물 1075 : 유/무형문화재 1076 : 기념물/민속자료 1077 : 문화재자료*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        return sb.toString();
    }
}
