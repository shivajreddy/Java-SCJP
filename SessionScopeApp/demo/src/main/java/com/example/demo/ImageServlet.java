package com.example.demo;

import java.io.IOException;
import java.io.InputStream;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "image_servlet", value = "/image")
public class ImageServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        // # 1. Set the response MIME type
        res.setContentType("image/png");

        // # 2. Response Binary Stream
        ServletOutputStream outputStream = res.getOutputStream();

        // # 3. Open stream
        InputStream inputStream = getServletContext().getResourceAsStream("images/shiva_memoji.jpg");

        // # 4. Define Byte Array
        byte[] imageBytes = new byte[inputStream.available()];

        // # 5. read the image
        inputStream.read(imageBytes);

        // # 6. write Image Bytes on servlet output stream
        outputStream.write(imageBytes);

        // # 7. flush the response
        outputStream.flush();
    }
}
