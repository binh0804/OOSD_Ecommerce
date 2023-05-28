package com.ecommerce.utility;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class CommonUtility {

    public static void forwardToPage(String page, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(page).forward(request, response);
    }

    public static void forwardToPage(String page, String message, HttpServletRequest request,
                                     HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", message);
//        response.setHeader("Content-Security-Policy",
//                "media-src 'self' https://lv-vod.fl.freecaster.net/vod/louisvuitton/dikq6kFFzG_HD.mp4; " +
//                        "style-src 'self' 'unsafe-inline' https://maxcdn.bootstrapcdn.com https://fonts.googleapis.com;" +
//                        "script-src 'self' 'unsafe-inline' http://code.jquery.com https://ajax.googleapis.com https://use.fontawesome.com ");
//        response.setHeader("X-Frame-Options", "DENY");
        request.getRequestDispatcher(page).forward(request, response);
    }

    public static void messageForShop(String message, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        forwardToPage("shop/message.jsp", message, request, response);
    }

    public static void messageForAdmin(String message, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        forwardToPage("message.jsp", message, request, response);
    }

    public static void generateCountryList(HttpServletRequest request) {
        String[] countryCodes = Locale.getISOCountries();

        Map<String, String> mapCountries = new TreeMap<>();

        for (String countryCode : countryCodes) {
            Locale locale = new Locale("", countryCode);
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            mapCountries.put(name, code);
        }

        request.setAttribute("mapCountries", mapCountries);
    }
}
