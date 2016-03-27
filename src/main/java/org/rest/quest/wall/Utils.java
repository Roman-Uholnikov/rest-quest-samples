package org.rest.quest.wall;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

/**
 * Created by roman on 19.03.16.
 */
public class Utils {

    private Utils() {
    }

    public static HttpEntity getHttpHeadersEntity(String keyword, int teamId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("team-id", String.valueOf(teamId));
        headers.set("keyword", keyword);
        return new HttpEntity(headers);
    }
}
