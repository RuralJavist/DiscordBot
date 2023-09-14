package com.bot.discordbot.services.utils;

import jakarta.servlet.http.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Map;

@Service
public class CookieProvider {
    public Cookie createNewCookie(Map<String,String> userInfo){
        jakarta.servlet.http.Cookie cookie = new jakarta.servlet.http.Cookie("user_data", userInfo.get("refresh_token"));
        cookie.setDomain("localhost");
        cookie.setPath("/auth/**");
        cookie.setMaxAge(311040000);
        cookie.setHttpOnly(true);
        cookie.setSecure(false);
        return cookie;
    }

}
